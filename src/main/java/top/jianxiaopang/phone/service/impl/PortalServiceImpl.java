package top.jianxiaopang.phone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.jianxiaopang.phone.dao.PortalDao;
import top.jianxiaopang.phone.pojo.Result;
import top.jianxiaopang.phone.pojo.ReturnPhone;
import top.jianxiaopang.phone.service.PortalService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PortalServiceImpl implements PortalService {
	@Autowired
	private PortalDao portalDao;

	@Override
	public Result selectCpu() {
		List<String> grades = portalDao.selectGradeOfCpu();
		Map map = new HashMap();
		for(String grade : grades) {
			map.put(grade, portalDao.selectCpuByGrade(grade));
		}
		return Result.success(map);
	}

	@Override
	public Result selectPhoneByCategory(HashMap hashMap) {
		List<ReturnPhone> returnPhones = portalDao.selectPhoneByCategory(hashMap);
		return Result.success(returnPhones);
	}
}
