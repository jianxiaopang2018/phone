package top.jianxiaopang.phone.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.jianxiaopang.phone.pojo.*;
import top.jianxiaopang.phone.service.BackstageService;

@Controller
@RequestMapping("/backstage")
public class BackstageController {
	@Autowired
	private BackstageService backstageService;

	Logger log = LoggerFactory.getLogger(BackstageController.class);

	@ResponseBody
	@RequestMapping("/insertBatteryCapacity")
	private Result insertBatteryCapacity(@RequestBody BatteryCapacity batteryCapacity) {
		log.info("——————进入插入电池容量的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(batteryCapacity));
		return backstageService.insertBatteryCapacity(batteryCapacity.getScope());
	}

	
	@ResponseBody
	@RequestMapping("/deleteBatteryCapacity")
	private Result deleteBatteryCapacity(@RequestBody Id id) {
		log.info("——————进入删除电池容量的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteBatteryCapacity(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateBatteryCapacity")
	private Result updateBatteryCapacity(@RequestBody BatteryCapacity batteryCapacity) {
		log.info("——————进入更新电池容量的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(batteryCapacity));
		return backstageService.updateBatteryCapacity(batteryCapacity);
	}

	@ResponseBody
	@RequestMapping("/selectBatteryCapacity")
	private Result selectBatteryCapacity() {
		log.info("——————进入查询电池容量的控制类——————");
		return backstageService.selectBatteryCapacity();
	}

	@ResponseBody
	@RequestMapping("/insertBodyMaterial")
	private Result insertBodyMaterial(@RequestBody BodyMaterial bodyMaterial) {
		log.info("——————进入插入机身材质的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(bodyMaterial));
		return backstageService.insertBodyMaterial(bodyMaterial.getName());
	}

	@ResponseBody
	@RequestMapping("/deleteBodyMaterial")
	private Result deleteBodyMaterial(@RequestBody Id id) {
		log.info("——————进入删除机身材质的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteBodyMaterial(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateBodyMaterial")
	private Result updateBodyMaterial(@RequestBody BodyMaterial bodyMaterial) {
		log.info("——————进入更新机身材质的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(bodyMaterial));
		return backstageService.updateBodyMaterial(bodyMaterial);
	}

	@ResponseBody
	@RequestMapping("/selectBodyMaterial")
	private Result selectBodyMaterial() {
		log.info("——————进入查询机身材质的控制类——————");
		return backstageService.selectBodyMaterial();
	}

	@ResponseBody
	@RequestMapping("/insertBrand")
	private Result insertBrand(@RequestBody Brand brand) {
		log.info("——————进入插入品牌的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(brand));
		return backstageService.insertBrand(brand.getName());
	}

	@ResponseBody
	@RequestMapping("/deleteBrand")
	private Result deleteBrand(@RequestBody Id id) {
		log.info("——————进入删除品牌的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteBrand(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateBrand")
	private Result updateBrand(@RequestBody Brand brand) {
		log.info("——————进入更新品牌的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(brand));
		return backstageService.updateBrand(brand);
	}

	@ResponseBody
	@RequestMapping("/selectBrand")
	private Result selectBrand() {
		log.info("——————进入查询品牌的控制类——————");
		return backstageService.selectBrand();
	}

	@ResponseBody
	@RequestMapping("/insertCpu")
	private Result insertCpu(@RequestBody Cpu cpu) {
		log.info("——————进入插入cpu的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(cpu));
		return backstageService.insertCpu(cpu);
	}

	@ResponseBody
	@RequestMapping("/deleteCpu")
	private Result deleteCpu(@RequestBody Id id) {
		log.info("——————进入删除cpu的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteCpu(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateCpu")
	private Result updateCpu(@RequestBody Cpu cpu) {
		log.info("——————进入更新cpu的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(cpu));
		return backstageService.updateCpu(cpu);
	}

	@ResponseBody
	@RequestMapping("/selectCpu")
	private Result selectCpu() {
		log.info("——————进入查询cpu的控制类——————");
		return backstageService.selectCpu();
	}

	@ResponseBody
	@RequestMapping("/insertFrontCamera")
	private Result insertFrontCamera(@RequestBody FrontCamera frontCamera) {
		log.info("——————进入插入前置摄像头的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(frontCamera));
		return backstageService.insertFrontCamera(frontCamera);
	}

	@ResponseBody
	@RequestMapping("/deleteFrontCamera")
	private Result deleteFrontCamera(@RequestBody Id id) {
		log.info("——————进入删除前置摄像头的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteFrontCamera(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateFrontCamera")
	private Result updateFrontCamera(@RequestBody FrontCamera frontCamera) {
		log.info("——————进入更新前置摄像头的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(frontCamera));
		return backstageService.updateFrontCamera(frontCamera);
	}

	@ResponseBody
	@RequestMapping("/selectFrontCamera")
	private Result selectFrontCamera() {
		log.info("——————进入查询前置摄像头的控制类——————");
		return backstageService.selectFrontCamera();
	}

	@ResponseBody
	@RequestMapping("/insertMicrousb")
	private Result insertMicrousb(@RequestBody Microusb microusb) {
		log.info("——————进入插入充电口的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(microusb));
		return backstageService.insertMicrousb(microusb);
	}

	@ResponseBody
	@RequestMapping("/deleteMicrousb")
	private Result deleteMicrousb(@RequestBody Id id) {
		log.info("——————进入删除充电口的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteMicrousb(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateMicrousb")
	private Result updateMicrousb(@RequestBody Microusb microusb) {
		log.info("——————进入更新充电口的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(microusb));
		return backstageService.updateMicrousb(microusb);
	}

	@ResponseBody
	@RequestMapping("/selectMicrousb")
	private Result selectMicrousb() {
		log.info("——————进入查询充电口的控制类——————");
		return backstageService.selectMicrousb();
	}

	@ResponseBody
	@RequestMapping("/insertPrice")
	private Result insertPrice(@RequestBody Price price) {
		log.info("——————进入插入价格的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(price));
		return backstageService.insertPrice(price.getScope());
	}

	@ResponseBody
	@RequestMapping("/deletePrice")
	private Result deletePrice(@RequestBody Id id) {
		log.info("——————进入删除价格的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deletePrice(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updatePrice")
	private Result updatePrice(@RequestBody Price price) {
		log.info("——————进入更新价格的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(price));
		return backstageService.updatePrice(price);
	}

	@ResponseBody
	@RequestMapping("/selectPrice")
	private Result selectPrice() {
		log.info("——————进入查询价格的控制类——————");
		return backstageService.selectPrice();
	}

	@ResponseBody
	@RequestMapping("/insertRamAndRom")
	private Result insertRamAndRom(@RequestBody RamAndRom ramAndRom) {
		log.info("——————进入插入运存内存容量的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(ramAndRom));
		return backstageService.insertRamAndRom(ramAndRom);
	}

	@ResponseBody
	@RequestMapping("/deleteRamAndRom")
	private Result deleteRamAndRom(@RequestBody Id id) {
		log.info("——————进入删除运存内存信息的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteRamAndRom(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateRamAndRom")
	private Result updateRamAndRom(@RequestBody RamAndRom ramAndRom) {
		log.info("——————进入更新运存内存信息的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(ramAndRom));
		return backstageService.updateRamAndRom(ramAndRom);
	}

	@ResponseBody
	@RequestMapping("/selectRamAndRom")
	private Result selectRamAndRom() {
		log.info("——————进入查询运存内存信息的控制类——————");
		return backstageService.selectRamAndRom();
	}

	@ResponseBody
	@RequestMapping("/insertRearCamera")
	private Result insertRearCamera(@RequestBody RearCamera rearCamera) {
		log.info("——————进入插入后置摄像头的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(rearCamera));
		return backstageService.insertRearCamera(rearCamera);
	}

	@ResponseBody
	@RequestMapping("/deleteRearCamera")
	private Result deleteRearCamera(@RequestBody Id id) {
		log.info("——————进入删除后置摄像头的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteRearCamera(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateRearCamera")
	private Result updateRearCamera(@RequestBody RearCamera rearCamera) {
		log.info("——————进入更新后置摄像头的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(rearCamera));
		return backstageService.updateRearCamera(rearCamera);
	}

	@ResponseBody
	@RequestMapping("/selectRearCamera")
	private Result selectRearCamera() {
		log.info("——————进入查询后置摄像头的控制类——————");
		return backstageService.selectRearCamera();
	}

	@ResponseBody
	@RequestMapping("/insertResolution")
	private Result insertResolution(@RequestBody Resolution resolution) {
		log.info("——————进入插入分辨率的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(resolution));
		return backstageService.insertResolution(resolution);
	}

	@ResponseBody
	@RequestMapping("/deleteResolution")
	private Result deleteResolution(@RequestBody Id id) {
		log.info("——————进入删除分辨率的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteResolution(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateResolution")
	private Result updateResolution(@RequestBody Resolution resolution) {
		log.info("——————进入更新分辨率的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(resolution));
		return backstageService.updateResolution(resolution);
	}

	@ResponseBody
	@RequestMapping("/selectResolution")
	private Result selectResolution() {
		log.info("——————进入查询分辨率的控制类——————");
		return backstageService.selectResolution();
	}

	@ResponseBody
	@RequestMapping("/insertScreenMaterial")
	private Result insertScreenMaterial(@RequestBody ScreenMaterial screenMaterial) {
		log.info("——————进入插入屏幕材质的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(screenMaterial));
		return backstageService.insertScreenMaterial(screenMaterial.getName());
	}

	@ResponseBody
	@RequestMapping("/deleteScreenMaterial")
	private Result deleteScreenMaterial(@RequestBody Id id) {
		log.info("——————进入删除屏幕材质的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteScreenMaterial(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateScreenMaterial")
	private Result updateScreenMaterial(@RequestBody ScreenMaterial screenMaterial) {
		log.info("——————进入更新屏幕材质的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(screenMaterial));
		return backstageService.updateScreenMaterial(screenMaterial);
	}

	@ResponseBody
	@RequestMapping("/selectScreenMaterial")
	private Result selectScreenMaterial() {
		log.info("——————进入查询屏幕材质的控制类——————");
		return backstageService.selectScreenMaterial();
	}

	@ResponseBody
	@RequestMapping("/insertScreenSize")
	private Result insertScreenSize(@RequestBody ScreenSize screenSize) {
		log.info("——————进入插入屏幕范围的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(screenSize));
		return backstageService.insertScreenSize(screenSize.getScope());
	}

	@ResponseBody
	@RequestMapping("/deleteScreenSize")
	private Result deleteScreenSize(@RequestBody Id id) {
		log.info("——————进入删除屏幕范围的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deleteScreenSize(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updateScreenSize")
	private Result updateScreenSize(@RequestBody ScreenSize screenSize) {
		log.info("——————进入更新屏幕范围的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(screenSize));
		return backstageService.updateScreenSize(screenSize);
	}

	@ResponseBody
	@RequestMapping("/selectScreenSize")
	private Result selectScreenSize() {
		log.info("——————进入查询屏幕范围的控制类——————");
		return backstageService.selectScreenSize();
	}

	@ResponseBody
	@RequestMapping("/insertPhone")
	private Result insertPhone(@RequestBody Phone phone) {
		log.info("——————进入插入手机的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(phone));
		return backstageService.insertPhone(phone);
	}

	@ResponseBody
	@RequestMapping("/deletePhone")
	private Result deletePhone(@RequestBody Id id) {
		log.info("——————进入删除手机的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(id));
		return backstageService.deletePhone(id.getId());
	}

	@ResponseBody
	@RequestMapping("/updatePhone")
	private Result updatePhone(@RequestBody Phone phone) {
		log.info("——————进入更新手机的控制类——————");
		log.info("接收参数为"+JSON.toJSONString(phone));
		return backstageService.updatePhone(phone);
	}

	@ResponseBody
	@RequestMapping("/selectPhone")
	private Result selectPhone(@RequestParam Integer page, @RequestParam String  order_by_price) {
		log.info("——————进入查询手机的控制类——————");
		log.info("接收参数为page="+page);
		return backstageService.selectPhone(page, order_by_price);
	}

	@ResponseBody
	@RequestMapping("/selectPhone/{id}")
	private Result selectPhoneById(@PathVariable Integer id) {
		log.info("——————进入通过id查询手机的控制类——————");
		log.info("接收参数为id="+id);
		return backstageService.selectPhoneById(id);
	}
}
