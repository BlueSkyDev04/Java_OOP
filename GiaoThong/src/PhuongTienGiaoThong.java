import java.util.Scanner;

public class PhuongTienGiaoThong {
	String hangSanXuat;
	String tenPhuongTien;
	int namSanXuat;
	float vanTocToiDa;
	public PhuongTienGiaoThong() {
	}
	public PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, int namSanXuat, float vanTocToiDa) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.tenPhuongTien = tenPhuongTien;
		this.namSanXuat = namSanXuat;
		this.vanTocToiDa = vanTocToiDa;
	}
	public void nhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập hãng sản xuất: ");
		this.hangSanXuat=sc.nextLine();
		System.out.println("Nhập tên phương tiện: ");
		this.tenPhuongTien=sc.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		this.namSanXuat=sc.nextInt();
		System.out.println("Nhập vận tốc tối đa: ");
		this.vanTocToiDa=sc.nextFloat();
	}
	public void xuatTT() {
		System.out.println("Hãng sản xuất: "+this.hangSanXuat);
		System.out.println("Tên phương tiện: "+this.tenPhuongTien);
		System.out.println("Năm sản xuất: "+this.namSanXuat);
		System.out.println("Vận tốc tối đa: "+this.vanTocToiDa);
	}
}
