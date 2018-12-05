package top.jianxiaopang.phone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.jianxiaopang.phone.dao.BackstageDao;
import top.jianxiaopang.phone.dao.PortalDao;
import top.jianxiaopang.phone.pojo.Result;
import top.jianxiaopang.phone.pojo.ReturnPhone;
import top.jianxiaopang.phone.pojo.ReturnRelation;
import top.jianxiaopang.phone.service.PortalService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PortalServiceImpl implements PortalService {
	@Autowired
	private PortalDao portalDao;
	@Autowired
	private BackstageDao backstageDao;

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
		for (ReturnPhone returnPhone : returnPhones) {
			List<ReturnRelation> returnRelations = backstageDao.selectReturnRelation(returnPhone.getId());
			returnPhone.setReturnRelations(returnRelations);
		}
		return Result.success(returnPhones);
	}

	@Override
	public Result searchPhone(String keyWord) {
		List<ReturnPhone> returnPhones = portalDao.searchPhone(keyWord);
		for (ReturnPhone returnPhone : returnPhones) {
			List<ReturnRelation> returnRelations = backstageDao.selectReturnRelation(returnPhone.getId());
			returnPhone.setReturnRelations(returnRelations);
		}
		return Result.success(returnPhones);
	}
}
