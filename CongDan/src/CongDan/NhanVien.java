package CongDan;

import java.util.Scanner;

public class NhanVien extends CongDan {
	private String MaSoNhanVien;
	private Double MucLuong;
	String TinhTrang;
	public String getMaSoNhanVien() {
		return MaSoNhanVien;
	}
	public void setMaSoNhanVien(String maSoNhanVien) {
		MaSoNhanVien = maSoNhanVien;
	}
	public Double getMucLuong() {
		return MucLuong;
	}
	public void setMucLuong(Double mucLuong) {
		MucLuong = mucLuong;
	}
	public NhanVien() {
	}
	public NhanVien(String x1, String x2, String x3, Date x4, String x5, Double x6, String x7) {
		super(x1,x2,x3,x4);
		this.MaSoNhanVien=x5;
		this.MucLuong=x6;
		this.TinhTrang=x7;}
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
		System.out.println("Nhập mã số nhân viên: ");
		MaSoNhanVien=sc.nextLine();
		System.out.println("Nhập mức lương: ");
		MucLuong=sc.nextDouble();
		System.out.println("Nhập tình trạng: ");
		TinhTrang=sc.nextLine();
		}
	public void XuatDuLieu() {
		System.out.println("Số căn cước: "+SoCanCuoc);
		System.out.println("Họ và tên: "+HoTen);
		System.out.println("Giới tính: "+GioiTinh);
		System.out.println("Ngày sinh: "+NgaySinh.XuatDate());
		System.out.println("Mã nhân viên: "+MaSoNhanVien);
		System.out.println("Mức lương: "+MucLuong);
		System.out.println("Tình trạng: "+TinhTrang);
	}
	
}
