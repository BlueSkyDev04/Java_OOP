package Xe;

import java.util.Scanner;

public class XeHangA extends Xe {
	String  tenGoi;
	private Double thueTieuThuDacBiet;
	public Double getThueTieuThuDacBiet() {
		return thueTieuThuDacBiet;
	}
	public void setThueTieuThuDacBiet(Double thueTieuThuDacBiet) {
		this.thueTieuThuDacBiet = thueTieuThuDacBiet;
	}
	public XeHangA() {
	}
	public XeHangA(String maSo, String hangSanXuat, Double giaSanXuat, Double phiBaoHanh, String tenGoi, Double thueTieuThuDacBiet) {
		super(maSo,hangSanXuat,giaSanXuat,phiBaoHanh);
		this.tenGoi = tenGoi;
		this.thueTieuThuDacBiet = thueTieuThuDacBiet;
	}
	public Double TinhThueTieuThuDacBiet() {
		if(getgiaSanXuat()>=100000) {
			thueTieuThuDacBiet=getgiaSanXuat()*1.5;
		}
		else 
			thueTieuThuDacBiet=getgiaSanXuat()*0.5;
		return thueTieuThuDacBiet;
	}
	public Double TinhThanhTien() {
		Double thanhTien=getgiaSanXuat()+phiBaoHanh+TinhThueMoiTruong()+thueTieuThuDacBiet;
		return thanhTien;
	}
	@Override
	public void NhapDL() {
		Scanner sc=new Scanner(System.in);
		Boolean a=false;
		do {
		try {
			System.out.println("Nhập mã số: ");
			maSo=sc.nextLine();
			System.out.println("Nhập hãng sản xuất: ");
			hangSanXuat=sc.nextLine();
			System.out.println("Nhập giá sản xuất: ");
			giaSanXuat =sc.nextDouble();
			sc.nextLine();
			System.out.println("Nhập tên gọi: ");
			tenGoi=sc.nextLine();	
		} catch (Exception e) {
			System.err.println("Lỗi! Vui lòng nhập lại đúng định dạng! ");
			a=true;
		}
		}while(a);}
		
		

	@Override
	public void XuatDL() {
		System.out.println("Mã số: "+maSo);
		System.out.println("Hãng sản xuất: "+hangSanXuat);
		System.out.println("Giá sản xuất: "+getgiaSanXuat());
		System.out.println("Phí bảo hành: "+TinhPhiBaoHanh());	
		System.out.println("Tên gọi: "+tenGoi);
		System.out.println("Thuế tiêu thụ đặc biệt: "+TinhThueTieuThuDacBiet());
		System.out.println("Thành tiền: "+TinhThanhTien());
	}
	
}
