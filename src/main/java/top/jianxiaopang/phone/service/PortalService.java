package top.jianxiaopang.phone.service;

import top.jianxiaopang.phone.pojo.Result;

import java.util.HashMap;

public interface PortalService {
	public Result selectCpu();

	public Result selectPhoneByCategory(HashMap hashMap);
}
