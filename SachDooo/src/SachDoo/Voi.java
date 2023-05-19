package SachDoo;

import java.util.Scanner;

public class Voi extends SachDo {
	String tenLoaiVoi;
	String nuoc;
	private int soLuongConTrongTuNhien;
	private int soLuongNuoi;
	public int getSoLuongConTrongTuNhien() {
		return soLuongConTrongTuNhien;
	}
	public void setSoLuongConTrongTuNhien(int soLuongConTrongTuNhien) {
		this.soLuongConTrongTuNhien = soLuongConTrongTuNhien;
	}
	public int getSoLuongNuoi() {
		return soLuongNuoi;
	}
	public void setSoLuongNuoi(int soLuongNuoi) {
		this.soLuongNuoi = soLuongNuoi;
	}
	public Voi(String maSo, String tenLoaiVoi, String nuoc, int soLuongConTrongTuNhien, int soLuongNuoi) {
		super(maSo);
		this.tenLoaiVoi = tenLoaiVoi;
		this.nuoc = nuoc;
		this.soLuongConTrongTuNhien = soLuongConTrongTuNhien;
		this.soLuongNuoi = soLuongNuoi;
	}
	public String baoTon() {
		if((soLuongConTrongTuNhien+soLuongNuoi)<=20) {
			System.out.println("Tuyet chung");
		}
		else if((soLuongConTrongTuNhien+soLuongNuoi)<=100) {
			System.out.println("Nguy cap");
		}
		else 
			System.out.println("Bao ve");
		return baoTon();
	}
	public void nhapTT() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ma so");
	maSo=sc.nextLine();
	System.out.println("Nhap ten loai voi: ");
	tenLoaiVoi=sc.nextLine();
	System.out.println("Nhap nuoc: ");
	nuoc=sc.nextLine();
	System.out.println("Nhap so luong con trong tu nhien: ");
	soLuongConTrongTuNhien=sc.nextInt();
	System.out.println("Nhap so luong nuoi: ");
	soLuongNuoi=sc.nextInt();
	}
	public void xuatTT() {
	System.out.println("Ma so: "+maSo);
	System.out.println("Ten loai voi: "+tenLoaiVoi);
	System.out.println("Nuoc: "+nuoc);
	System.out.println("So luong con trong tu nhien: "+soLuongConTrongTuNhien);
	System.out.println("So luong nuoi: "+soLuongNuoi);
	System.out.println("Tinh trang: "+baoTon());
	}
}
