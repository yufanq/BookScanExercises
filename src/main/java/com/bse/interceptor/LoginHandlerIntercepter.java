package com.bse.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆拦截器
 * 
 * 场景：用户进行操作的时候，我们进行登陆拦截器操作，判断用户是否登陆？
 *  	如登陆，则不拦截；没登陆，则拦截并转到登陆界面、
 * 
 */
public class LoginHandlerIntercepter implements HandlerInterceptor {
	/**
	 * preHandler：在进入Handler方法之前执行了，
	 * 		使用于身份认证，身份授权，登陆校验等，比如身份认证，用户没有登陆，拦截不再向下执行，
	 * 		返回值为 false，即可实现拦截；否则，返回true时，拦截不进行执行；
	 * 
	 * postHandler：进入Handler方法之后，返回ModelAndView之前执行，
	 * 		使用场景从ModelAndView参数出发，比如，将公用的模型数据在这里传入到视图，也可以统一指定显示的视图等；
	 * 
	 * afterHandler：在执行Handler完成后执行此方法，
	 * 		使用于统一的异常处理，统一的日志处理等；
	 * 
	 * 
	 * 附：多个拦截器使用的时候，preHandler是顺序执行的，
	 * 		而postHandler和afterHandler是倒序执行的；
	 * 
	 */
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("-----进入拦截器-----");
		// 接到请求的URI，进行判断是否是需要拦截的URI；
		//String requestURI = request.getRequestURI();
		
		//这里对所有URI进行拦截
		HttpSession session = request.getSession();
		/*DUser currentUser = (DUser) session.getAttribute("currentUser");
		if (currentUser != null) {
			System.out.println("-----判断成功，不进行拦截-----");
			// 登陆成功的用户
			
			return true;
		} else {
			System.out.println("-----判断失败，进行拦截并转到登陆页面-----");
			// 没有登陆，转向登陆界面
			String forwardPath = session.getServletContext().getRealPath("/");
			
			//request.setAttribute("loginErrorMgs", "登陆失效，请重新登陆！！！");
			//request.getRequestDispatcher("/admin/page/main/index.jsp").forward(request, response);
			
			//request.getRequestDispatcher("/index.jsp").forward(request, response);
			request.getRequestDispatcher("/admin/exitLogin.do").forward(request, response);
			
			return false;
		}*/
		
		return true;
	}

}