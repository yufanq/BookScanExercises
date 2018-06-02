package com.bse.shiro;

import com.bse.entity.Admin;
import com.bse.entity.Jurisdiction;
import com.bse.entity.Role;
import com.bse.service.AdminService;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminRealm extends AuthorizingRealm {

    @Autowired
    private AdminService adminService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
        Admin admin = adminService.selectPermissionsAll(username);
        
        Set<String> roles=new HashSet<String>();
        for (Role role : admin.getRoles()) {
        	roles.add(role.getrName());
        	System.out.println("------------------------------------"+role.getrName());
		}
        Set<String> permissions=new HashSet<String>();
        for (Jurisdiction  permission: admin.getJurisdictions()) {
        	System.out.println("------------------------------------"+permission.getjName());
        	permissions.add(permission.getjName());
		}
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(roles);
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = (String)token.getPrincipal();
     
        Admin admin=adminService.selectPermissionsAll(username);
          if(admin == null) {
            throw new UnknownAccountException();//没找到帐�?
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实�?
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
        		admin.getaAccount(), //用户�?
        		admin.getaPassword(), //密码
                ByteSource.Util.bytes(admin.getCredentialsSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }

}
