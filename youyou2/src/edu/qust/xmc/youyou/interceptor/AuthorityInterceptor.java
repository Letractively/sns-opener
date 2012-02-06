package edu.qust.xmc.youyou.interceptor;

import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.*;

import edu.qust.xmc.youyou.action.CheckEmailAction;
import edu.qust.xmc.youyou.action.LoginAction;
import edu.qust.xmc.youyou.action.RegisterAction;

import java.util.Map;

public class AuthorityInterceptor extends AbstractInterceptor {
	public String intercept(ActionInvocation invocation) throws Exception {
		// 故意停滞 2秒
		Thread.sleep(1200);

		// 消除对注册和登录两个action的拦截
		if (LoginAction.class == invocation.getAction().getClass()
				|| RegisterAction.class == invocation.getAction().getClass()
				|| CheckEmailAction.class == invocation.getAction().getClass()) {
			return invocation.invoke();
		}
		// 检查seesion中是否存在user对象
		Map session = ActionContext.getContext().getSession();
		Object user = session.get("user");
		if (user == null) {
			return "login";
		} else {
			return invocation.invoke();
		}
	}
}