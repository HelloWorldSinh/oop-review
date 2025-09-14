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
				
			}
			if(control == 6) {
				
			}
			if(control == 0) {
				System.out.println("Ket thuc!");
			}
		}
		while(control != 0);
	}
}
