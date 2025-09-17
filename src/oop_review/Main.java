package oop_review;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		SanPham dt1 = new SanPham("samsung", 10000, "dien thoai samsung gia re", 10, "Dien thoai");
		SanPham dt2 = new SanPham("oppo", 20000, "dien thoai oppo gia re", 20, "Dien thoai");
		SanPham dt3 = new SanPham("iphone", 30000, "dien thoai iphone gia re", 30, "Dien thoai");
		
		SanPham lap1 = new SanPham("acer", 10000, "lap top acer gia re", 10, "Laptop");
		SanPham lap2 = new SanPham("lenovo", 20000, "lap top lenovo gia re", 20, "Laptop");
		SanPham lap3 = new SanPham("mac", 30000, "lap top mac gia re", 30, "Laptop");
		
		ArrayList<SanPham> ds = new ArrayList<SanPham>();
		
		Discount dc1 = new Discount(10, null, "ABC");
		Discount dc2 = new Discount(20, null, "XYZ");
		Discount dc3 = new Discount(50, null, "MNP");
		
		ArrayList<Discount> listDicount = new ArrayList<Discount>();
		listDicount.add(dc1);
		listDicount.add(dc2);
		listDicount.add(dc3);
		
		ds.add(dt1);
		ds.add(dt2);
		ds.add(dt3);
		ds.add(lap1);
		ds.add(lap2);
		ds.add(lap3);
		
		
		
		int control;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Vui long chon thao tac: ");
			control = sc.nextInt();
			if(control == 1) {
				for(int i = 0; i < ds.size(); i++) {
					System.out.println(i + 1 + ". " + ds.get(i).toString());
				}
			}
			if(control == 2) {
				int indexProduct;
				
				System.out.println("Chon san pham can cap nhat: ");
				indexProduct = sc.nextInt() - 1; sc.nextLine();
				SanPham temp = ds.get(indexProduct);
				
				System.out.println("Nhap ten: ");
				temp.setNameProduct(sc.nextLine());
				
				System.out.println("Nhap mo ta: ");
				temp.setDescriptionProduct(sc.nextLine());
				
				System.out.println("Nhap don gia: ");
				temp.setPriceProduct(sc.nextInt()); sc.nextLine();
				
				System.out.println("Nhap so luong: ");
				temp.setQuantityProduct(sc.nextInt()); sc.nextLine();
				
				ds.set(indexProduct, temp);
				System.out.println("Cap nhat thanh cong!");
			}
			if(control == 3) {
				int t, a, b;
				String category;
				SanPham temp;
				
				System.out.println("1. Loc theo gia");
				System.out.println("2. Loc theo danh muc");
				
				t = sc.nextInt(); sc.nextLine();
				if(t == 1) {
					int index = 1;
					System.out.println("Nhap pham vi:");
					a = sc.nextInt();
					b = sc.nextInt();
					
					for(int i = 0; i < ds.size(); i++) {
						temp = ds.get(i);
						if(temp.getPriceProduct() <= b && temp.getPriceProduct() >= a) {
							System.out.println(index + ". " + temp.toString());
							index++;
						}
					}
				}
				if(t == 2) {
					int index = 1;
					System.out.println("Nhap ten danh muc:");
					category = sc.nextLine();
					
					for(int i = 0; i < ds.size(); i++) {
						temp = ds.get(i);
						if(temp.getCategory().equals(category)) {
							System.out.println(index + ". " + temp.toString());
							index++;
						}
					}
				}
			}
			if(control == 4) {
				int lenght = ds.size();
				String danhMuc;
				Map<String, Integer> listMap = new HashMap<String, Integer>();
				
				for(int i = 0; i <lenght; i++) {
					danhMuc = ds.get(i).getCategory();
					if(!listMap.containsKey(danhMuc)) {
						listMap.put(danhMuc, 1);
					}
					else {
						listMap.put(danhMuc, listMap.get(danhMuc) + 1);
					}
				}
				 listMap.forEach((k, v) -> System.out.println(k + " : " + v));
			}
			if(control == 5) {
				Discount t = new Discount();
				System.out.println("Nhap % giam gia");
				t.setDiscount(sc.nextInt()); sc.nextLine();
				
				System.out.println("Nhap mo ta:");
				t.setDescription(sc.nextLine());
				
				System.out.println("Nhap ma code:");
				t.setCode(sc.nextLine());
				
				listDicount.add(t);
				System.out.println("them thanh cong");
			}
			if(control == 6) {
				int id = 1, sl, sum = 0;
				String discount;
				System.out.println("Chon san pham va so luong:");
				while(id != 0) {
					id = sc.nextInt();
					sl = sc.nextInt();
					if(id == 0)
						break;
					sum += ds.get(id - 1).getPriceProduct() * sl;
				}
				sc.nextLine();
				System.out.println("Nhap ma giam gia:");
				discount = sc.nextLine();
				for(int i = 0; i < listDicount.size(); i++) {
					if(listDicount.get(i).getCode().equals(discount)) {
						sum -= sum * listDicount.get(i).getDiscount() / 100;
					}
				}
				System.out.println("Tong gia tri don hang: " + sum);
			}
			if(control == 0) {
				System.out.println("Ket thuc!");
			}
		}
		while(control != 0);
	}
}
