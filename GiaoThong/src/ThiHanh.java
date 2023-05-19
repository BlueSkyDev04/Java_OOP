import java.util.ArrayList;
import java.util.Scanner;

public class ThiHanh {
	ArrayList<OTo> o = new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void nhapDSOTO() {
		Scanner sc=new Scanner(System.in);
		OTo x=new OTo();
		String tt;
		System.out.println("Nhập danh sách OTo: ");
		do {
			x.nhapDL();
			o.add(x);
			System.out.println("Nhập end để dừng nhập");
			tt=sc.nextLine();
		} while (!tt.equals("end"));
		System.out.println("Danh sách có " +o.size()+" oto");
	}
	public void xuatDSOTO() {
		System.out.println("Xem danh sách xe: ");
		for(OTo a: o) {
			a.xuatTT();
		}
	}
	public void timXeBangTen() {
		OTo x=new OTo();
		System.out.println("Nhập tên xe cần tìm: ");
		String tenPhuongTien=sc.nextLine();
		boolean timXe=false;
		for(OTo a: o) {
			if(a.tenPhuongTien.equalsIgnoreCase(tenPhuongTien)) {
				timXe=true;
				x=a;
				break;
			}
		}
		if(timXe) {
			System.out.println("Đã tìm thấy xe có tên là "+tenPhuongTien);
			x.xuatTT();
		}
		else 
			System.out.println("Không tìm thấy xe có têN: "+tenPhuongTien);
		
	}
	/*public void xoaXeRaKhoiDanhSach() {
		OTo x= new OTo();
		boolean daXoa=false;
		System.out.println("Nhập tên xe cần xóa: ");
		String xoaTenPhuongTien=sc.nextLine();
		do {
			for(OTo a : o) {
			if(a.tenPhuongTien==xoaTenPhuongTien) {
				o.remove(a);
				
				break;
			}
		}	
			}while(daXoa==true);
		if (daXoa==true) {
			System.out.println("Đã xóa thành công xe ");
		}else {
			System.out.println("Không có xe ");
		}
	}*/
	public static void main(String[] args) {
		ThiHanh a=new ThiHanh();
		a.nhapDSOTO();
		a.xuatDSOTO();
		a.timXeBangTen();
		a.xoaXeRaKhoiDanhSach();
	}
}
