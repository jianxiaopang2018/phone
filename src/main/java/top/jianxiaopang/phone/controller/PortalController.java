package top.jianxiaopang.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.jianxiaopang.phone.dao.BackstageDao;
import top.jianxiaopang.phone.pojo.Other;
import top.jianxiaopang.phone.pojo.Result;
import top.jianxiaopang.phone.service.BackstageService;
import top.jianxiaopang.phone.service.PortalService;

@Controller()
@RequestMapping("/portal")
public class PortalController {
	@Autowired
	private BackstageDao backstageDao;
	@Autowired
	private PortalService portalService;

	@ResponseBody
	@RequestMapping(value = "/other", method = RequestMethod.GET)
	public Result selectOther() {
		Other other = new Other();
		other.setBatteryCapacities(backstageDao.selectBatteryCapacity());
		other.setBodyMaterials(backstageDao.selectBodyMaterial());
		return Result.success(other);
	}

	@ResponseBody
	@RequestMapping(value = "/cpu", method = RequestMethod.GET)
		public Result selectCpu() {
			return portalService.selectCpu();
		}
}