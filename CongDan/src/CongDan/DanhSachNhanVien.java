package CongDan;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
	ArrayList<NhanVien> dsnv=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void nhapDSNhanVien() {
		NhanVien x=new NhanVien();
		String tt;
		System.out.println("Nhập danh sách nhân viên: ");
		do {
			x.NhapDuLieu();
			dsnv.add(x);
			System.out.println("Nhập end để kết thúc nhập:");
			tt=sc.nextLine();
		}while(!tt.equals("end"));
	}
	public void xuatDSNhanVien() {
		System.out.println("Danh sách nhân viên: ");
		for(NhanVien a: dsnv) {
			a.XuatDuLieu();
		}
	}
	public static void main(String[] args) {
		DanhSachNhanVien c = new DanhSachNhanVien();
		c.nhapDSNhanVien();
		c.xuatDSNhanVien();
	}
}
