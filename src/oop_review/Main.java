package oop_review;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		SanPham dt1 = new SanPham("samsung", 10000, "dien thoai samsung gia re", 10);
		SanPham dt2 = new SanPham("oppo", 20000, "dien thoai oppo gia re", 20);
		SanPham dt3 = new SanPham("iphone", 30000, "dien thoai iphone gia re", 30);
		SanPham dt4 = new SanPham("xiaomi", 40000, "dien thoai xiaomi gia re", 40);
		SanPham dt5 = new SanPham("redmi", 50000, "dien thoai redmi gia re", 50);
		ArrayList<SanPham> listSanPham = new ArrayList<SanPham>();
		listSanPham.add(dt1);
		listSanPham.add(dt2);
		listSanPham.add(dt3);
		listSanPham.add(dt4);
		listSanPham.add(dt5);
		
		int control;
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		do {
			System.out.println("Vui long chon thao tac: ");
			control = sc.nextInt();
			System.out.println("Ban da chon so:" + control);
			if(control == 0) {
				System.out.println("Ket thuc!");
			}
		}
		while(control != 0);
	}

}
