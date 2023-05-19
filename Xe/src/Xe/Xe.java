package Xe;

import java.util.Scanner;

public class Xe {
	String maSo;
	String hangSanXuat;
	Double giaSanXuat;
	Double phiBaoHanh;
	public Double getgiaSanXuat() {
		return giaSanXuat;
	}
	public void setgiaSanXuat(Double giaSanXuat) {
		this.giaSanXuat = giaSanXuat;
	}
	public Xe() {
	}
	public Xe(String maSo, String hangSanXuat, Double giaSanXuat, Double phiBaoHanh) {
		this.maSo = maSo;
		this.hangSanXuat = hangSanXuat;
		this.giaSanXuat = giaSanXuat;
		this.phiBaoHanh = phiBaoHanh;
	}
	public Double TinhThueMoiTruong() {
		return 0.03*(giaSanXuat+phiBaoHanh);
	}
	public Double TinhPhiBaoHanh() {
		if(giaSanXuat>=100000) {
			phiBaoHanh=giaSanXuat*0.1;
		}
		else 
			phiBaoHanh=giaSanXuat*0.07;
		return phiBaoHanh;
		
	}
	public void NhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập mã số: ");
		maSo=sc.nextLine();
		System.out.println("Nhập hãng sản xuất: ");
		hangSanXuat=sc.nextLine();
		System.out.println("Nhập giá sản xuất: ");
		giaSanXuat=sc.nextDouble();
	}
	public void XuatDL() {
		System.out.println("Mã số: "+maSo);
		System.out.println("Hãng sản xuất: "+hangSanXuat);
		System.out.println("Giá sản xuất: "+getgiaSanXuat());
		System.out.println("Phí bảo hành: "+phiBaoHanh);
	}
	}
