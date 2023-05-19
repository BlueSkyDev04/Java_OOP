package Bo;

import java.util.Scanner;

public class Boo implements ThuLai {
	String  giong;
	String xuatXu;
	private int soLuong;
	float trongLuong;
	private Double giaTien;
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(Double giaTien) {
		this.giaTien = giaTien;
	}
	public Boo() {
	}
	public Boo(String giong, String xuatXu, int soLuong, float trongLuong, Double giaTien) {
		this.giong = giong;
		this.xuatXu = xuatXu;
		this.soLuong = soLuong;
		this.trongLuong = trongLuong;
		this.giaTien = giaTien;
	}
	public void nhapDL(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập giống: ");
		giong=sc.nextLine();
		System.out.println("Nhập xuất xứ: ");
		xuatXu=sc.nextLine();
		System.out.println("Nhập số lượng: ");
		soLuong=sc.nextInt();
		System.out.println("Nhập trọng lượng: ");
		trongLuong=sc.nextFloat();
		System.out.println("Nhập giá tiền: ");
		giaTien=sc.nextDouble();
	}
	public Double phiLaiTao(){
		Double plt=giaTien*0.15;
		return plt;
	}
	public void xuatTT(){
		System.out.println("Giống: "+giong);
		System.out.println("xuất xứ: "+xuatXu);
		System.out.println("Số lượng: "+getSoLuong());
		System.out.println("trọng lượng: "+trongLuong);
		System.out.println("Giá tiền: "+getGiaTien());
		System.out.println("Phí lai tạo: "+phiLaiTao());
	}
	
	
}
