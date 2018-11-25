package top.jianxiaopang.phone.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.jianxiaopang.phone.pojo.Result;
import top.jianxiaopang.phone.pojo.User;
import top.jianxiaopang.phone.utils.JWT;

@Controller
@RequestMapping("/user")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);

	@ResponseBody
	@RequestMapping("/login")
	public Result login(@RequestBody User user) {
		log.info("进行登录");
		log.info("用户信息为",JSON.toJSONString(user));
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
			log.info("登录成功");
			String token = JWT.sign(user, 1000 * 60 * 30*4);
			return Result.success(token);
		}else {
			log.info("登录失败");
			return Result.message(401, "密码或账号错误");
		}
	}
}
