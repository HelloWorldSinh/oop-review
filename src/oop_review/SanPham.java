package oop_review;

public class SanPham {
	private String nameProduct;
	private int priceProduct;
	private String descriptionProduct;
	private int quantityProduct;
	private String category;
	
	
	public SanPham(String nameProduct, int priceProduct, String descriptionProduct, int quantityProduct, String category) {
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		this.category = category;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(int priceProduct) {
		this.priceProduct = priceProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}


	public int getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(int quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String toString() {
		return getNameProduct() + " " + getDescriptionProduct() + " "  + getPriceProduct() + " "  + getQuantityProduct() + " "  + getCategory();
	}
}
