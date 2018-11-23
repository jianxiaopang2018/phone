package top.jianxiaopang.phone.interceptor;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import top.jianxiaopang.phone.pojo.Result;
import top.jianxiaopang.phone.pojo.User;
import top.jianxiaopang.phone.utils.JWT;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 登录状态验证
 */
public class TokenInterceptor implements HandlerInterceptor {
	final private Logger log = LoggerFactory.getLogger(TokenInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
		String token = request.getHeader("token");;
		Boolean bl = false;
		if(null != token) {
			User user = JWT.unsign(token, User.class);
			if(user != null) {
				if(user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
					log.info("登录状态：成功");
					bl = true;
				} else {
					bl = false;
				}
			} else {
				bl =false;
			}
		} else {
			bl = false;
		}
		if(bl == false) {
			log.info("登录状态：超时");
			Result result = Result.message(401,"登录超时，请重新登录！");
			//用gson来格式化类成json
			Gson gson = new Gson();
			String json = gson.toJson(result);
			PrintWriter out = response.getWriter();
			out.print(json);
			out.flush();
			out.close();
		}
		return bl;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

	}
}
