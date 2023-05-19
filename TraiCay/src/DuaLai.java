import java.util.Scanner;

public class DuaLai implements QuaDau,QuaDua,QuaXoai {
	String tenGoi;
	String noiTrong;
	String mauSac;
	private float trongLuong; 
	private double giaBan;
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public float getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(float trongLuong) {
		this.trongLuong = trongLuong;
	}
	public DuaLai() {
	}
	public DuaLai(String tenGoi, String noiTrong, String mauSac, float trongLuong, double giaBan) {
		this.tenGoi = tenGoi;
		this.noiTrong = noiTrong;
		this.mauSac = mauSac;
		this.trongLuong = trongLuong;
		this.giaBan = giaBan;
	}
	
	public void nhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten goi: ");
		tenGoi=sc.nextLine();
		System.out.println("Nhap noi trong: ");
		noiTrong=sc.nextLine();
		System.out.println("Nhap mau sac: ");
		mauSac=sc.nextLine();
		System.out.println("Nhap trong luong: ");
		trongLuong=sc.nextFloat();
		System.out.println("Nhap gia ban: ");
		giaBan=sc.nextDouble();

	}
	public void xuatTT() {
		System.out.println("Ten goi: "+tenGoi);
		System.out.println("Noi trong: "+noiTrong);
		System.out.println("Mau sac: "+mauSac);
		System.out.println("Trong luong: "+this.getTrongLuong());
		System.out.println("Gia ban: "+this.getGiaBan());
		System.out.println("Mui: "+mui);
		System.out.println("Vi: "+vi);
		System.out.println("Hinh dang: "+hinhdang);
	}
	
}
