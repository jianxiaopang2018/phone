package top.jianxiaopang.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.jianxiaopang.phone.dao.BackstageDao;
import top.jianxiaopang.phone.dao.PortalDao;
import top.jianxiaopang.phone.pojo.Common;
import top.jianxiaopang.phone.pojo.Result;
import top.jianxiaopang.phone.service.PortalService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller()
@RequestMapping("/portal")
public class PortalController {
	@Autowired
	private BackstageDao backstageDao;
	@Autowired
	private PortalService portalService;
	@Autowired
	private PortalDao portalDao;

	@ResponseBody
	@RequestMapping(value = "/other", method = RequestMethod.GET)
	public Result selectOther() {
		Map<String, List> map = new HashMap<>();
		map.put("机身材质", backstageDao.selectBodyMaterial());
		map.put("充电接口", backstageDao.selectMicrousb());
		return Result.success(map);
	}

	@ResponseBody
	@RequestMapping(value = "/cpu", method = RequestMethod.GET)
		public Result selectCpu() {
			return portalService.selectCpu();
		}

	@ResponseBody
	@RequestMapping(value = "/selectPhoneByCategory")
	public Result selectPhoneByCategory(@RequestBody HashMap hashMap) {
		return portalService.selectPhoneByCategory(hashMap);
	}

	@ResponseBody
	@RequestMapping(value = "/searchPhone")
	public Result searchPhone(String keyWord) {
		return portalService.searchPhone(keyWord);
	}

	@ResponseBody
	@RequestMapping(value = "/camera", method = RequestMethod.GET)
	public Result selectCamera() {
		HashMap<String, List<Common>> map = new HashMap();
		map.put("前置", portalDao.selectFrontCamera());
		map.put("后置", portalDao.selectRearCamera());
		return Result.success(map);
	}

	@ResponseBody
	@RequestMapping(value = "/screen", method = RequestMethod.GET)
	public Result selectScreen() {
		HashMap<String, List<Common>> map = new HashMap();
		map.put("尺寸", portalDao.selectScreenSize());
		map.put("分辨率", portalDao.selectResolution());
		map.put("材质", portalDao.selectScreenMaterial());
		return Result.success(map);
	}
}
