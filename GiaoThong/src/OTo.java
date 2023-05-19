import java.util.Scanner;

public class OTo extends PhuongTienGiaoThong {
	int soChoNgoi;
	String kieuDongCo;
	public OTo() {
	}
	public OTo(String hangSanXuat, String tenPhuongTien, int namSanXuat, float vanTocToiDa, int soChoNgoi, String kieuDongCo) {
		super(hangSanXuat, tenPhuongTien, namSanXuat, vanTocToiDa);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	public float vanTocCoSo() {
		return vanTocToiDa/4;
	}
	public void nhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập hãng sản xuất: ");
		 hangSanXuat=sc.nextLine();
		System.out.println("Nhập tên phương tiện: ");
		tenPhuongTien=sc.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		  namSanXuat=sc.nextInt();
		System.out.println("Nhập vận tốc tối đa: ");
		  vanTocToiDa=sc.nextFloat();
		System.out.println("Số chỗ ngồi: " );
		 soChoNgoi=sc.nextInt();
		System.out.println("Kiểu động cơ: ");
		 kieuDongCo=sc.nextLine();
	}
	public void xuatTT() {
		System.out.println("Hãng sản xuất: "+this.hangSanXuat);
		System.out.println("Tên phương tiện: "+this.tenPhuongTien);
		System.out.println("Năm sản xuất: "+this.namSanXuat);
		System.out.println("Vận tốc tối đa: "+this.vanTocToiDa);
		System.out.println("Số chỗ ngồi: "+this.soChoNgoi);
		System.out.println("Kiểu động cơ: "+this.kieuDongCo);
		System.out.println("Vận tốc cơ sở: "+this.vanTocCoSo());
	}
	
	
}
