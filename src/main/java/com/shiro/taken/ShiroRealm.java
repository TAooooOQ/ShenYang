package com.shiro.taken;

import com.dao.po.UserPo;
import com.service.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ash
 * @date 2018/7/11 14:28
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private ShiroService shiroService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.err.println(principalCollection.getPrimaryPrincipal());
        UserPo user = (UserPo) shiroService.getUserByUserName((String) principalCollection.getPrimaryPrincipal());
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        if (user == null) {
            return null;
        }
        info.addRole(shiroService.getRoleByUser(user).getRoleName());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        UserPo user=shiroService.getUserByUserName(token.getUsername());
        if(user==null){
            return null;
        }
        AuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(), this.getClass().getSimpleName());
        return info;
    }
}
