package top.jianxiaopang.phone.service;

import top.jianxiaopang.phone.pojo.*;

import java.util.List;

public interface BackstageService {
	public Result insertBatteryCapacity(String scope);

	public Result deleteBatteryCapacity(Integer id);

	public Result updateBatteryCapacity(BatteryCapacity batteryCapacity);

	public Result selectBatteryCapacity();

	//*******************************************************************************************

	public Result insertBodyMaterial(String name);

	public Result deleteBodyMaterial(Integer id);

	public Result updateBodyMaterial(BodyMaterial bodyMaterial);

	public Result selectBodyMaterial();

	//*******************************************************************************************

	public Result insertBrand(String name);

	public Result deleteBrand(Integer id);

	public Result updateBrand(Brand brand);

	public Result selectBrand();

	//*******************************************************************************************

	public Result insertCpu(Cpu cpu);

	public Result deleteCpu(Integer id);

	public Result updateCpu(Cpu cpu);

	public Result selectCpu();

	//*******************************************************************************************

	public Result insertFrontCamera(FrontCamera frontCamera);

	public Result deleteFrontCamera(Integer id);

	public Result updateFrontCamera(FrontCamera frontCamera);

	public Result selectFrontCamera();

	//*******************************************************************************************

	public Result insertMicrousb(Microusb microusb);

	public Result deleteMicrousb(Integer id);

	public Result updateMicrousb(Microusb microusb);

	public Result selectMicrousb();

	//*******************************************************************************************

	public Result insertPrice(String scope);

	public Result deletePrice(Integer id);

	public Result updatePrice(Price price);

	public Result selectPrice();

	//*******************************************************************************************

	public Result insertRamAndRom(RamAndRom ramAndRom);

	public Result deleteRamAndRom(Integer id);

	public Result updateRamAndRom(RamAndRom ramAndRom);

	public Result selectRamAndRom();

	//*******************************************************************************************


	public Result insertRearCamera(RearCamera rearCamera);

	public Result deleteRearCamera(Integer id);

	public Result updateRearCamera(RearCamera rearCamera);

	public Result selectRearCamera();

	//*******************************************************************************************


	public Result insertResolution(Resolution resolution);

	public Result deleteResolution(Integer id);

	public Result updateResolution(Resolution resolution);

	public Result selectResolution();

	//*******************************************************************************************

	public Result insertScreenMaterial(String name);

	public Result deleteScreenMaterial(Integer id);

	public Result updateScreenMaterial(ScreenMaterial screenMaterial);

	public Result selectScreenMaterial();

	//*******************************************************************************************

	public Result insertScreenSize(String scope);

	public Result deleteScreenSize(Integer id);

	public Result updateScreenSize(ScreenSize screenSize);

	public Result selectScreenSize();

	//*******************************************************************************************

	public Result insertPhone(Phone phone);

	//public Result insertRelation(Relation relation);

	public Result deletePhone(Integer id);

	//public Result deleteRelationById(Integer id);

	//public Result deleteRelationByPhoneId(Integer phoneId);

	public Result updatePhone(Phone phone);

	public Result selectPhone();
}
