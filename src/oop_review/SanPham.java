package oop_review;

public class SanPham {
	private String nameProduct;
	private int priceProduct;
	private String descriptionProduct;
	private int quantityProduct;
	
	
	public SanPham(String nameProduct, int priceProduct, String descriptionProduct, int quantityProduct) {
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}
	
	public int getPriceProduct() {
		return priceProduct;
	}
	
	public String getDescriptionProduct() {
		return descriptionProduct;
	}
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public void setPriceProduct(int priceProduct) {
		this.priceProduct = priceProduct;
	}
	
	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}
	
	public int updateProduct(String nameProduct, int priceProduct, String descriptionProduct, int quantityProduct) {
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		return 1;
	}
	
	public String toString() {
		return getNameProduct() + getPriceProduct() + getPriceProduct();
	}
	
}
