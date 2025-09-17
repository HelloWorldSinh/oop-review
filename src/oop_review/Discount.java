package oop_review;

public class Discount {
	private int discount;
	private String description;
	private String code;
	
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Discount(int discount, String description, String code) {
		this.discount = discount;
		this.description = description;
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Discount() {
		
	}
}
