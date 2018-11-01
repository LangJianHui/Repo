package org.aaa.ssm.realm;
import org.aaa.ssm.model.User;
import org.aaa.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 授权
	 */
	@Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取身份信息
        String username = (String)principals.getPrimaryPrincipal();
        //将权限信息封装为SimpleAuthorizationInfo
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //绑定角色
        authorizationInfo.setRoles(userService.findRoles(username));//根据用户名查找用户对应的角色（自定义实现）
        System.out.println("当前账号拥有的角色："+authorizationInfo.getRoles());
        //绑定权限
        authorizationInfo.setStringPermissions(userService.findPermissions(username));//根据用户名查找用户对应的权限（自定义实现）
        System.out.println("当前账户拥有的权限："+authorizationInfo.getStringPermissions());
        return authorizationInfo;
    }

	Logger log=Logger.getLogger(UserRealm.class);
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    	 // 从 token 中获取用户身份信息
        String username = (String)token.getPrincipal();
        // 通过 username 从数据库中查询
        User user = userService.findByUsername(username);
       // log.debug(user);
        
        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }
        if(Boolean.TRUE.equals(user.getLocked())) {
            throw new LockedAccountException(); //帐号锁定
        }

        //返回认证信息由父类 AuthenticatingRealm 进行认证
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(), //用户名
                user.getPassword(), //此处获取的是数据库中的密码,将来和表单中传过来的密码进行对比
                ByteSource.Util.bytes(user.getCredentialsSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }

    
}