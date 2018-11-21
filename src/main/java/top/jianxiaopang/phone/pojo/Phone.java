package top.jianxiaopang.phone.pojo;

import java.util.List;

public class Phone {
	private int id;
	private String name;
	private int brandId;
	private int cpuId;
	private int batteryCapacity;
	private Float screenSize;
	private int screenMaterialId;
	private String frontCamera;
	private String rearCamera;
	private int bodyMaterialId;
	private int microusbId;
	private int infrared;
	private int nfc;
	private int storageExtension;
	private int quickCharge;
	private int screenFingerprin;
	private int wirelessCharging;
	private int ois;
	private String imageUrl;
	private String detailUrl;
	private List<Relation> relations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getCpuId() {
		return cpuId;
	}

	public void setCpuId(int cpuId) {
		this.cpuId = cpuId;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Float getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Float screenSize) {
		this.screenSize = screenSize;
	}

	public int getScreenMaterialId() {
		return screenMaterialId;
	}

	public void setScreenMaterialId(int screenMaterialId) {
		this.screenMaterialId = screenMaterialId;
	}

	public String getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}

	public String getRearCamera() {
		return rearCamera;
	}

	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}

	public int getBodyMaterialId() {
		return bodyMaterialId;
	}

	public void setBodyMaterialId(int bodyMaterialId) {
		this.bodyMaterialId = bodyMaterialId;
	}

	public int getMicrousbId() {
		return microusbId;
	}

	public void setMicrousbId(int microusbId) {
		this.microusbId = microusbId;
	}

	public int getInfrared() {
		return infrared;
	}

	public void setInfrared(int infrared) {
		this.infrared = infrared;
	}

	public int getNfc() {
		return nfc;
	}

	public void setNfc(int nfc) {
		this.nfc = nfc;
	}

	public int getStorageExtension() {
		return storageExtension;
	}

	public void setStorageExtension(int storageExtension) {
		this.storageExtension = storageExtension;
	}

	public int getQuickCharge() {
		return quickCharge;
	}

	public void setQuickCharge(int quickCharge) {
		this.quickCharge = quickCharge;
	}

	public int getScreenFingerprin() {
		return screenFingerprin;
	}

	public void setScreenFingerprin(int screenFingerprin) {
		this.screenFingerprin = screenFingerprin;
	}

	public int getWirelessCharging() {
		return wirelessCharging;
	}

	public void setWirelessCharging(int wirelessCharging) {
		this.wirelessCharging = wirelessCharging;
	}

	public int getOis() {
		return ois;
	}

	public void setOis(int ois) {
		this.ois = ois;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public List<Relation> getRelations() {
		return relations;
	}

	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}
}
