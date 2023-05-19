package Xe;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTai extends Xe {
	String tenGoi;
	private Double giamThue;
	public Double getGiamThue() {
		return giamThue;
	}
	public void setGiamThue(Double giamThue) {
		this.giamThue = giamThue;
	}
	public XeTai() {
	}
	public XeTai(String maSo, String hangSanXuat, Double giaSanXuat, Double phiBaoHanh, String tenGoi, Double giamThue) {
		super(maSo,hangSanXuat,giaSanXuat,phiBaoHanh);
		this.tenGoi = tenGoi;
		this.giamThue = giamThue;
	}
	public Double tinhThanhTien() {
		Double thanhTien=giaSanXuat+phiBaoHanh+TinhThueMoiTruong()+giamThue;
	return thanhTien;
	}
	public Double tinhGiamThue() {
		if(giaSanXuat>=100000) {
			giamThue=giaSanXuat*0.2;
		}
		else 
			giamThue=giaSanXuat*0.1;
		return giamThue;
	}
	public void NhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập mã số xe tải: ");
		maSo=sc.nextLine();
		System.out.println("Nhập hãng sản xuất xe tải: ");
		hangSanXuat=sc.nextLine();
		System.out.println("Nhập giá sản xuất xe tải: ");
		giaSanXuat=sc.nextDouble();
		System.out.println("Nhập tên gọi xe tải: ");
		tenGoi=sc.nextLine();
	}
	@Override
	public void XuatDL() {
		System.out.println("Mã số xe tải: "+maSo);
		System.out.println("Hãng sản xuất xe tải: "+hangSanXuat);
		System.out.println("Giá sản xuất xe tải: "+getgiaSanXuat());
		System.out.println("Phí bảo hành xe tải: "+TinhPhiBaoHanh());	
		System.out.println("Tên gọi xe tải: "+tenGoi);
		System.out.println("Số thuế được giảm xe tải: "+tinhGiamThue());
		System.out.println("Thành tiền xe tải: "+tinhThanhTien());
	}
	public void DanhSachXeTai() {
	ArrayList<String> X = new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhập danh sách xe tải: ");
	X.add(sc.nextLine());
	X.add(sc.nextLine());
	X.add(sc.nextLine());
	X.add(sc.nextLine());
	X.add(sc.nextLine());
	}
	public static void main(String[] args) {
		//eTai d= new XeTai();
		XeHangA e=new XeHangA();
		//d.NhapDL();
		//d.XuatDL();
		//d.DanhSachXeTai();
		e.NhapDL();
		e.XuatDL();
	}
	
}
