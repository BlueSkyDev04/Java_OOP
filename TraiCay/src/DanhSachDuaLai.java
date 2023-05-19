import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachDuaLai {
	ArrayList<DuaLai> DL=new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	public void nhapDSDL() {
	DuaLai x=new DuaLai();
	String tt;
	System.out.println("Nhap danh sach cac qua dua lai: ");
	do {
		x.nhapDL();
		DL.add(x);
		System.out.println("Nhap end de ket thuc: ");
		tt=sc.nextLine();
	}while(!tt.equals("end"));
	System.out.println("ArrayList co:"+DL.size()+" qua dua");
	}
	public void timDuaLai() {
		boolean tim=false;
		System.out.println("Nhap ten can tim: ");
		String ten=sc.nextLine();
		for(DuaLai x: DL) {
			if(x.tenGoi.equalsIgnoreCase(ten)) {
				tim=true;
				System.out.println("Tim thay qua dua co ten: "+ten);
				x.xuatTT();
			}
			if(tim==false)
				System.out.println("Khong tim thay qua dua co ten:"+ten);
		}
	}
	public static void main(String[] args) {
		DanhSachDuaLai DSDL=new DanhSachDuaLai();
		DSDL.nhapDSDL();
		DSDL.timDuaLai();
	}
}
