package top.jianxiaopang.phone.pojo;

import java.util.List;

public class ReturnPhone {
	private int id;
	private String name;
	private String brand;
	private String cpu;
	private int batteryCapacity;
	private Float screenSize;
	private String resolution;
	private String screenMaterial;
	private String frontCamera;
	private String rearCamera;
	private String bodyMaterial;
	private String  microusb;
	private int infrared;
	private int nfc;
	private int storageExtension;
	private int quickCharge;
	private int screenFingerprin;
	private int wirelessCharging;
	private int ois;
	private String imageUrl;
	private String detailUrl;
	private List<ReturnRelation> returnRelations;

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
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

	public String getScreenMaterial() {
		return screenMaterial;
	}

	public void setScreenMaterial(String screenMaterial) {
		this.screenMaterial = screenMaterial;
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

	public String getBodyMaterial() {
		return bodyMaterial;
	}

	public void setBodyMaterial(String bodyMaterial) {
		this.bodyMaterial = bodyMaterial;
	}

	public String getMicrousb() {
		return microusb;
	}

	public void setMicrousb(String microusb) {
		this.microusb = microusb;
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

	public List<ReturnRelation> getReturnRelations() {
		return returnRelations;
	}

	public void setReturnRelations(List<ReturnRelation> returnRelations) {
		this.returnRelations = returnRelations;
	}
}
