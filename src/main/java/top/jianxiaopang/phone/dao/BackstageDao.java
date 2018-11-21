package top.jianxiaopang.phone.dao;

import top.jianxiaopang.phone.pojo.*;

import java.util.List;

public interface BackstageDao {
	public Integer insertBatteryCapacity(String scope);

	public Integer deleteBatteryCapacity(Integer id);

	public Integer updateBatteryCapacity(BatteryCapacity batteryCapacity);

	public List<BatteryCapacity> selectBatteryCapacity();

	//*******************************************************************************************

	public Integer insertBodyMaterial(String name);

	public Integer deleteBodyMaterial(Integer id);

	public Integer updateBodyMaterial(BodyMaterial bodyMaterial);

	public List<BodyMaterial> selectBodyMaterial();

	//*******************************************************************************************

	public Integer insertBrand(String name);

	public Integer deleteBrand(Integer id);

	public Integer updateBrand(Brand brand);

	public List<Brand> selectBrand();

	//*******************************************************************************************

	public Integer insertCpu(Cpu cpu);

	public Integer deleteCpu(Integer id);

	public Integer updateCpu(Cpu cpu);

	public List<Brand> selectCpu();

	//*******************************************************************************************

	public Integer insertFrontCamera(FrontCamera frontCamera);

	public Integer deleteFrontCamera(Integer id);

	public Integer updateFrontCamera(FrontCamera frontCamera);

	public List<FrontCamera> selectFrontCamera();

	//*******************************************************************************************

	public Integer insertMicrousb(Microusb microusb);

	public Integer deleteMicrousb(Integer id);

	public Integer updateMicrousb(Microusb microusb);

	public List<Microusb> selectMicrousb();

	//*******************************************************************************************

	public Integer insertPrice(String scope);

	public Integer deletePrice(Integer id);

	public Integer updatePrice(Price price);

	public List<Price> selectPrice();

	//*******************************************************************************************

	public Integer insertRamAndRom(RamAndRom ramAndRom);

	public Integer deleteRamAndRom(Integer id);

	public Integer updateRamAndRom(RamAndRom ramAndRom);

	public List<RamAndRom> selectRamAndRom();

	//*******************************************************************************************

	public Integer insertRearCamera(RearCamera rearCamera);

	public Integer deleteRearCamera(Integer id);

	public Integer updateRearCamera(RearCamera rearCamera);

	public List<RearCamera> selectRearCamera();

	//*******************************************************************************************

	public Integer insertResolution(Resolution resolution);

	public Integer deleteResolution(Integer id);

	public Integer updateResolution(Resolution resolution);

	public List<Resolution> selectResolution();

	//*******************************************************************************************

	public Integer insertScreenMaterial(String name);

	public Integer deleteScreenMaterial(Integer id);

	public Integer updateScreenMaterial(ScreenMaterial screenMaterial);

	public List<ScreenMaterial> selectScreenMaterial();

	//*******************************************************************************************

	public Integer insertScreenSize(String scope);

	public Integer deleteScreenSize(Integer id);

	public Integer updateScreenSize(ScreenSize screenSize);

	public List<ScreenSize> selectScreenSize();

	public Integer insertPhone(Phone phone);

	public Integer insertRelation(Relation relation);

	public Integer deletePhone(Integer id);

	public Integer deleteRelationById(Integer id);

	public Integer deleteRelationByPhoneId(Integer phoneId);

	public Integer updatePhone(Phone phone);

	public Integer updateRelation(Relation relation);

	public List<ReturnPhone> selectPhone();

	public List<ReturnRelation> selectReturnRelation(Integer phoneId);
}
