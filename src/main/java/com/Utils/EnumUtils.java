package com.Utils;

import com.bean.en.BaseEnum;

/**
 * @author Ash
 * @date 2018/7/15 11:13
 */
public class EnumUtils {

    /**
     * 根据 int 转化成枚举
     * @param enumClass
     * @param code
     * @param <E>
     * @return
     */
    public static <E extends Enum<?> & BaseEnum> E codeOf(Class<E> enumClass, int code) {
        E[] enumConstants = enumClass.getEnumConstants();
        for(E e : enumConstants) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}