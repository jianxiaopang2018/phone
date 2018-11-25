package top.jianxiaopang.phone.pojo;

public class ReturnRelation {
	private int id;
	private String ramAndRom;
	private int ramAndRomId;
	private int price;
	private int phoneId;

	public int getRamAndRomId() {
		return ramAndRomId;
	}

	public void setRamAndRomId(int ramAndRomId) {
		this.ramAndRomId = ramAndRomId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRamAndRom() {
		return ramAndRom;
	}

	public void setRamAndRom(String ramAndRom) {
		this.ramAndRom = ramAndRom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
}
