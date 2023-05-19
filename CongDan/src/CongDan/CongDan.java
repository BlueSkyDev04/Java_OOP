package CongDan;

import java.util.Scanner;

public class CongDan {
	String SoCanCuoc; 
	String HoTen;
	String GioiTinh;
	Date NgaySinh;
	public CongDan() {}
	public CongDan(String x1, String x2, String x3, Date x4) {
		this.SoCanCuoc=x1;
		this.HoTen=x2;
		this.GioiTinh=x3;
		this.NgaySinh=x4;
	}
	public void NhapDuLieu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số căn cước: ");
		SoCanCuoc=sc.nextLine();
		System.out.println("Nhập họ và tên: ");
		HoTen=sc.nextLine();
		System.out.println("Nhập giới tính: ");
		GioiTinh=sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		int ngay=sc.nextInt();
		System.out.println("Nhập tháng sinh: ");
		int thang=sc.nextInt();
		System.out.println("Nhập năm sinh: ");
		int nam=sc.nextInt();
		Date a= new Date(ngay, thang, nam);
		this.NgaySinh=a;
	}
	public void XuatDuLieu() {
		System.out.println("Số căn cước: "+SoCanCuoc);
		System.out.println("Họ và tên: "+HoTen);
		System.out.println("Giới tính: "+GioiTinh);
		System.out.println("Ngày sinh: "+NgaySinh.XuatDate());
	}
}
