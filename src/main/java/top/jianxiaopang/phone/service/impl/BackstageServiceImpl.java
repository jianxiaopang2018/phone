package top.jianxiaopang.phone.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.jianxiaopang.phone.dao.BackstageDao;
import top.jianxiaopang.phone.pojo.*;
import top.jianxiaopang.phone.service.BackstageService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BackstageServiceImpl implements BackstageService {
	@Autowired
	private BackstageDao backstageDao;

	final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public Result insertBatteryCapacity(String scope) {
		Integer i = backstageDao.insertBatteryCapacity(scope);
		if (i < 0) {
			log.info("插入电池容量失败");
			return Result.message(400, "插入电池容量失败");
		}
		log.info("插入电池容量成功");
		return Result.message(200, "插入电池容量成功");
	}

	@Override
	public Result deleteBatteryCapacity(Integer id) {
		Integer i = backstageDao.deleteBatteryCapacity(id);
		if (i < 0) {
			log.info("删除电池容量失败");
			return Result.message(400, "删除电池容量失败");
		}
		log.info("删除电池容量成功");
		return Result.message(200, "删除电池容量成功");
	}

	@Override
	public Result updateBatteryCapacity(BatteryCapacity batteryCapacity) {
		Integer i = backstageDao.updateBatteryCapacity(batteryCapacity);
		if (i < 0) {
			log.info("更新电池容量失败");
			return Result.message(400, "更新电池容量失败");
		}
		log.info("更新电池容量成功");
		return Result.message(200, "更新电池容量成功");
	}

	@Override
	public Result selectBatteryCapacity() {
		List<BatteryCapacity> list = backstageDao.selectBatteryCapacity();
		return Result.success(list);
	}

	@Override
	public Result insertBodyMaterial(String name) {
		Integer i = backstageDao.insertBodyMaterial(name);
		if (i < 0) {
			log.info("插入机身材质失败");
			return Result.message(400, "插入机身材质失败");
		}
		log.info("插入机身材质成功");
		return Result.message(200, "插入机身材质成功");
	}

	@Override
	public Result deleteBodyMaterial(Integer id) {
		Integer i = backstageDao.deleteBodyMaterial(id);
		if (i < 0) {
			log.info("删除机身材质成功");
			return Result.message(400, "删除机身材质成功");
		}
		log.info("删除机身材质成功");
		return Result.message(200, "删除机身材质成功");
	}

	@Override
	public Result updateBodyMaterial(BodyMaterial bodyMaterial) {
		Integer i = backstageDao.updateBodyMaterial(bodyMaterial);
		if (i < 0) {
			log.info("更新机身材质失败");
			return Result.message(400, "更新机身材质失败");
		}
		log.info("更新机身材质成功");
		return Result.message(200, "更新机身材质成功");
	}

	@Override
	public Result selectBodyMaterial() {
		List<BodyMaterial> list = backstageDao.selectBodyMaterial();
		return Result.success(list);
	}

	@Override
	public Result insertBrand(String name) {
		Integer i = backstageDao.insertBrand(name);
		if (i < 0) {
			log.info("插入品牌失败");
			return Result.message(400, "插入品牌失败");
		}
		log.info("插入品牌成功");
		return Result.message(200, "插入品牌成功");
	}

	@Override
	public Result deleteBrand(Integer id) {
		Integer i = backstageDao.deleteBrand(id);
		if (i < 0) {
			log.info("删除品牌失败");
			return Result.message(400, "删除品牌失败");
		}
		log.info("删除品牌成功");
		return Result.message(200, "删除品牌成功");
	}

	@Override
	public Result updateBrand(Brand brand) {
		Integer i = backstageDao.updateBrand(brand);
		if (i < 0) {
			log.info("更新品牌失败");
			return Result.message(400, "更新品牌失败");
		}
		log.info("更新品牌成功");
		return Result.message(200, "更新品牌成功");
	}

	@Override
	public Result selectBrand() {
		List<Brand> list = backstageDao.selectBrand();
		return Result.success(list);
	}

	@Override
	public Result insertCpu(Cpu cpu) {
		Integer i = backstageDao.insertCpu(cpu);
		if (i < 0) {
			log.info("插入cpu信息失败");
			return Result.message(400, "插入cpu信息失败");
		}
		log.info("插入cpu信息成功");
		return Result.message(200, "插入cpu信息成功");
	}

	@Override
	public Result deleteCpu(Integer id) {
		Integer i = backstageDao.deleteCpu(id);
		if (i < 0) {
			log.info("删除cpu信息失败");
			return Result.message(400, "删除cpu信息失败");
		}
		log.info("删除cpu信息成功");
		return Result.message(200, "删除cpu信息成功");
	}

	@Override
	public Result updateCpu(Cpu cpu) {
		Integer i = backstageDao.updateCpu(cpu);
		if (i < 0) {
			log.info("更新cpu信息失败");
			return Result.message(400, "更新cpu信息失败");
		}
		log.info("更新cpu信息成功");
		return Result.message(200, "更新cpu信息成功");
	}

	@Override
	public Result selectCpu() {
		List<Brand> list = backstageDao.selectCpu();
		return Result.success(list);
	}

	@Override
	public Result insertFrontCamera(FrontCamera frontCamera) {
		Integer i = backstageDao.insertFrontCamera(frontCamera);
		if (i < 0) {
			log.info("插入前摄像头信息失败");
			return Result.message(400, "插入前摄像头信息失败");
		}
		log.info("插入前摄像头信息成功");
		return Result.message(200, "插入前摄像头信息成功");
	}

	@Override
	public Result deleteFrontCamera(Integer id) {
		Integer i = backstageDao.deleteFrontCamera(id);
		if (i < 0) {
			log.info("删除前摄像头信息失败");
			return Result.message(400, "删除前摄像头信息失败");
		}
		log.info("删除前摄像头信息成功");
		return Result.message(200, "删除前摄像头信息成功");
	}

	@Override
	public Result updateFrontCamera(FrontCamera frontCamera) {
		Integer i = backstageDao.updateFrontCamera(frontCamera);
		if (i < 0) {
			log.info("更新前摄像头信息失败");
			return Result.message(400, "更新前摄像头信息失败");
		}
		log.info("更新前摄像头信息成功");
		return Result.message(200, "更新前摄像头信息成功");
	}

	@Override
	public Result selectFrontCamera() {
		List<FrontCamera> list = backstageDao.selectFrontCamera();
		return Result.success(list);
	}

	@Override
	public Result insertMicrousb(Microusb microusb) {
		Integer i = backstageDao.insertMicrousb(microusb);
		if (i < 0) {
			log.info("插入充电接口信息失败");
			return Result.message(400, "插入充电接口信息失败");
		}
		log.info("插入充电接口信息成功");
		return Result.message(200, "插入充电接口信息成功");
	}

	@Override
	public Result deleteMicrousb(Integer id) {
		Integer i = backstageDao.deleteMicrousb(id);
		if (i < 0) {
			log.info("删除充电接口信息失败");
			return Result.message(400, "删除充电接口信息失败");
		}
		log.info("删除充电接口信息成功");
		return Result.message(200, "删除充电接口信息成功");
	}

	@Override
	public Result updateMicrousb(Microusb microusb) {
		Integer i = backstageDao.updateMicrousb(microusb);
		if (i < 0) {
			log.info("更新充电接口信息失败");
			return Result.message(400, "更新充电接口信息失败");
		}
		log.info("更新充电接口信息成功");
		return Result.message(200, "更新充电接口信息成功");
	}

	@Override
	public Result selectMicrousb() {
		List<Microusb> list = backstageDao.selectMicrousb();
		return Result.success(list);
	}

	@Override
	public Result insertPrice(String scope) {
		Integer i = backstageDao.insertPrice(scope);
		if (i < 0) {
			log.info("插入价值范围失败");
			return Result.message(400, "插入价值范围失败");
		}
		log.info("插入价值范围成功");
		return Result.message(200, "插入价值范围成功");
	}

	@Override
	public Result deletePrice(Integer id) {
		Integer i = backstageDao.deletePrice(id);
		if (i < 0) {
			log.info("删除价值范围成功");
			return Result.message(400, "删除价值范围成功");
		}
		log.info("删除价值范围成功");
		return Result.message(200, "删除价值范围成功");
	}

	@Override
	public Result updatePrice(Price price) {
		Integer i = backstageDao.updatePrice(price);
		if (i < 0) {
			log.info("更新价值范围失败");
			return Result.message(400, "更新价值范围失败");
		}
		log.info("更新价值范围成功");
		return Result.message(200, "更新价值范围成功");
	}

	@Override
	public Result selectPrice() {
		List<Price> list = backstageDao.selectPrice();
		return Result.success(list);
	}

	@Override
	public Result insertRamAndRom(RamAndRom ramAndRom) {
		Integer i = backstageDao.insertRamAndRom(ramAndRom);
		if (i < 0) {
			log.info("插入运存内存信息失败");
			return Result.message(400, "插入运存内存信息失败");
		}
		log.info("插入运存内存信息成功");
		return Result.message(200, "插入运存内存信息成功");
	}

	@Override
	public Result deleteRamAndRom(Integer id) {
		Integer i = backstageDao.deleteRamAndRom(id);
		if (i < 0) {
			log.info("删除运存内存信息失败");
			return Result.message(400, "删除运存内存信息失败");
		}
		log.info("删除运存内存信息成功");
		return Result.message(200, "删除运存内存信息成功");
	}

	@Override
	public Result updateRamAndRom(RamAndRom ramAndRom) {
		Integer i = backstageDao.updateRamAndRom(ramAndRom);
		if (i < 0) {
			log.info("更新运存内存信息失败");
			return Result.message(400, "更新运存内存信息失败");
		}
		log.info("更新运存内存信息成功");
		return Result.message(200, "更新运存内存信息成功");
	}

	@Override
	public Result selectRamAndRom() {
		List<RamAndRom> list = backstageDao.selectRamAndRom();
		return Result.success(list);
	}

	@Override
	public Result insertRearCamera(RearCamera rearCamera) {
		Integer i = backstageDao.insertRearCamera(rearCamera);
		if (i < 0) {
			log.info("插入后置摄像头信息失败");
			return Result.message(400, "插入后置摄像头信息失败");
		}
		log.info("插入后置摄像头信息成功");
		return Result.message(200, "插入后置摄像头信息成功");
	}

	@Override
	public Result deleteRearCamera(Integer id) {
		Integer i = backstageDao.deleteRearCamera(id);
		if (i < 0) {
			log.info("删除后置摄像头信息失败");
			return Result.message(400, "删除后置摄像头信息失败");
		}
		log.info("删除后置摄像头信息成功");
		return Result.message(200, "删除后置摄像头信息成功");
	}

	@Override
	public Result updateRearCamera(RearCamera rearCamera) {
		Integer i = backstageDao.updateRearCamera(rearCamera);
		if (i < 0) {
			log.info("更新后置摄像头信息失败");
			return Result.message(400, "更新后置摄像头信息失败");
		}
		log.info("更新后置摄像头信息成功");
		return Result.message(200, "更新后置摄像头信息成功");
	}

	@Override
	public Result selectRearCamera() {
		List<RearCamera> list = backstageDao.selectRearCamera();
		return Result.success(list);
	}

	@Override
	public Result insertResolution(Resolution resolution) {
		Integer i = backstageDao.insertResolution(resolution);
		if (i < 0) {
			log.info("插入屏幕分辨率信息失败");
			return Result.message(400, "插入屏幕分辨率信息失败");
		}
		log.info("插入屏幕分辨率信息成功");
		return Result.message(200, "插入屏幕分辨率信息成功");
	}

	@Override
	public Result deleteResolution(Integer id) {
		Integer i = backstageDao.deleteResolution(id);
		if (i < 0) {
			log.info("删除屏幕分辨率信息失败");
			return Result.message(400, "删除屏幕分辨率信息失败");
		}
		log.info("删除屏幕分辨率信息成功");
		return Result.message(200, "删除屏幕分辨率信息成功");
	}

	@Override
	public Result updateResolution(Resolution resolution) {
		Integer i = backstageDao.updateResolution(resolution);
		if (i < 0) {
			log.info("更新屏幕分辨率信息失败");
			return Result.message(400, "更新屏幕分辨率信息失败");
		}
		log.info("更新屏幕分辨率信息成功");
		return Result.message(200, "更新屏幕分辨率信息成功");
	}

	@Override
	public Result selectResolution() {
		List<Resolution> list = backstageDao.selectResolution();
		return Result.success(list);
	}

	@Override
	public Result insertScreenMaterial(String name) {
		Integer i = backstageDao.insertScreenMaterial(name);
		if (i < 0) {
			log.info("插入屏幕材质失败");
			return Result.message(400, "插入屏幕材质失败");
		}
		log.info("插入屏幕材质成功");
		return Result.message(200, "插入屏幕材质成功");
	}

	@Override
	public Result deleteScreenMaterial(Integer id) {
		Integer i = backstageDao.deleteScreenMaterial(id);
		if (i < 0) {
			log.info("删除屏幕材质失败");
			return Result.message(400, "删除屏幕材质失败");
		}
		log.info("删除屏幕材质成功");
		return Result.message(200, "删除屏幕材质成功");
	}

	@Override
	public Result updateScreenMaterial(ScreenMaterial screenMaterial) {
		Integer i = backstageDao.updateScreenMaterial(screenMaterial);
		if (i < 0) {
			log.info("更新机身材质失败");
			return Result.message(400, "更新机身材质失败");
		}
		log.info("更新机身材质成功");
		return Result.message(200, "更新机身材质成功");
	}

	@Override
	public Result selectScreenMaterial() {
		List<ScreenMaterial> list = backstageDao.selectScreenMaterial();
		return Result.success(list);
	}

	@Override
	public Result insertScreenSize(String scope) {
		Integer i = backstageDao.insertScreenSize(scope);
		if (i < 0) {
			log.info("插入屏幕大小失败");
			return Result.message(400, "插入屏幕大小失败");
		}
		log.info("插入屏幕大小成功");
		return Result.message(200, "插入屏幕大小成功");
	}

	@Override
	public Result deleteScreenSize(Integer id) {
		Integer i = backstageDao.deleteScreenSize(id);
		if (i < 0) {
			log.info("删除屏幕大小失败");
			return Result.message(400, "删除屏幕大小失败");
		}
		log.info("删除屏幕大小成功");
		return Result.message(200, "删除屏幕大小成功");
	}

	@Override
	public Result updateScreenSize(ScreenSize screenSize) {
		Integer i = backstageDao.updateScreenSize(screenSize);
		if (i < 0) {
			log.info("更新屏幕大小失败");
			return Result.message(400, "更新屏幕大小失败");
		}
		log.info("更新屏幕大小成功");
		return Result.message(200, "更新屏幕大小成功");
	}

	@Override
	public Result selectScreenSize() {
		List<ScreenSize> list = backstageDao.selectScreenSize();
		return Result.success(list);
	}

	@Override
	public Result insertPhone(Phone phone) {
		Integer i = backstageDao.insertPhone(phone);
		if (i < 0) {
			log.info("插入手机信息失败");
			return Result.message(400, "插入手机信息失败");
		}
		List<Relation> relations = phone.getRelations();
		log.info("插入关联表信息");
		for (Relation relation : relations) {
			relation.setPhoneId(phone.getId());
			backstageDao.insertRelation(relation);
		}
		log.info("插入手机信息成功");
		return Result.message(200, "插入手机信息成功");
	}

	@Override
	public Result deletePhone(Integer id) {
		Integer i = backstageDao.deletePhone(id);
		if (i < 0) {
			log.info("删除手机信息失败");
			return Result.message(400, "删除手机信息失败");
		}
		log.info("删除关联表通过手机id");
		i = backstageDao.deleteRelationByPhoneId(id);
		if (i < 0) {
			log.info("删除手机关联信息失败");
			return Result.message(400, "删除手机关联信息失败");
		}
		log.info("删除手机信息成功");
		return Result.message(200, "删除手机信息成功");
	}

	@Override
	public Result updatePhone(Phone phone) {
		Integer i = backstageDao.updatePhone(phone);
		if (i < 0) {
			log.info("更新手机信息失败");
			return Result.message(400, "更新手机信息失败");
		}
		List<Relation> relations = phone.getRelations();
		log.info("更新手机关联信息");
		for (Relation relation : relations) {
			//relation.setPhoneId(phone.getId());
			backstageDao.updateRelation(relation);
		}
		log.info("更新手机信息成功");
		return Result.message(200, "更新手机信息成功");
	}

	@Override
	public Result selectPhone(Integer page) {
		log.info("查询手机信息");
		List<ReturnPhone> returnPhones = backstageDao.selectPhone(page);
		log.info("查询手机信息对应的关联信息");
		for (ReturnPhone returnPhone : returnPhones) {
			List<ReturnRelation> returnRelations = backstageDao.selectReturnRelation(returnPhone.getId());
			returnPhone.setReturnRelations(returnRelations);
		}
		log.info("查询手机信息成功");
		if(page != null) {
			Map map = new HashMap<>();
			map.put("phones",returnPhones);
			PageBean pb = new PageBean();
			pb.setCurrentPage(page);
			pb.setPageSize(20);
			pb.setTotalCount(backstageDao.selectPhoneCount());
			pb.setTotalPage((int)(pb.getTotalCount()/20)+1);
			map.put("pagebean",pb);
			return Result.success(map);
		}
		return Result.success(returnPhones);
	}

	@Override
	public Result selectPhoneById(Integer id) {
		log.info("通过id查询手机信息");
		ReturnPhone returnPhone = backstageDao.selectPhoneById(id);
		log.info("查询手机信息对应的关联信息");
		List<ReturnRelation> returnRelations = backstageDao.selectReturnRelation(returnPhone.getId());
		returnPhone.setReturnRelations(returnRelations);
		log.info("查询手机信息成功");
		return Result.success(returnPhone);
	}
}