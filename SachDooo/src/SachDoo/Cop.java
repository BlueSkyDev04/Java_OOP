package SachDoo;
import java.util.Scanner;

public class Cop extends SachDo {
	String tenLoaiCop;
	String noiSong;
	private int soLuongCon;
	public int getSoLuongCon() {
		return soLuongCon;
	}
	public void setSoLuongCon(int soLuongCon) {
		this.soLuongCon = soLuongCon;
	}
	public Cop(String maSo,String tenLoaiCop, String noiSong, int soLuongCon) {
		super(maSo);
		this.tenLoaiCop = tenLoaiCop;
		this.noiSong = noiSong;
		this.soLuongCon = soLuongCon;
	}
	
	public String baoTon() {
		if(soLuongCon<=50) {
			System.out.println("Tuyet chung");
		}
		else if (soLuongCon<=200) {
			System.out.println("Nguy cap");
		}
		else
			System.out.println("De doa");
		return baoTon();
	}
	public void nhapTT(){
	
	Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma so");
		maSo=sc.nextLine();
		System.out.println("Nhap ten loai cop: ");
		tenLoaiCop=sc.nextLine();
		System.out.println("Nhap noi song: ");
		noiSong=sc.nextLine();
		System.out.println("Nhap so luong con: ");
		soLuongCon=sc.nextInt();
		}
	public void xuatTT() {
		System.out.println("Ma so: "+maSo);
		System.out.println("Ten loai cop: "+tenLoaiCop);
		System.out.println("Noi song: "+noiSong);
		System.out.println("So luong con: "+soLuongCon);
		System.out.println("Tinh trang: "+baoTon());
	}
	
}
