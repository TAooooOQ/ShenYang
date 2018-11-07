package com.dao.handler;

import com.Utils.EnumUtils;
import com.bean.en.BaseEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ash
 * @date 2018/7/15 13:22
 */
public class EnumHandler<E extends Enum<?> & BaseEnum> extends BaseTypeHandler<BaseEnum> {

    private Class<E> type;

    public EnumHandler(){

    }

    public EnumHandler(Class<E> type){
        if (type==null){
            System.err.println("枚举类型不能为空");
        }
        this.type=type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, BaseEnum baseEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,baseEnum.getCode());
    }

    @Override
    public BaseEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int code = resultSet.getInt(s);
        return resultSet.wasNull()? null: codeOf(code);
    }

    @Override
    public BaseEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int code = resultSet.getInt(i);
        return resultSet.wasNull()? null:codeOf(code);
    }

    @Override
    public BaseEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int code = callableStatement.getInt(i);
        return callableStatement.wasNull()? null:codeOf(code);
    }

    private E codeOf(int code){
        try {
            return EnumUtils.codeOf(type,code);
        }catch (Exception ex){
            System.err.println("枚举类型转换失败");
        }
        return null;
    }
}
