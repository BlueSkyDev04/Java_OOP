package thunghiem;

import java.util.Scanner;

public class SinhVIen {
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	//setter and getter 
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	
	//constructor có tham số 
	public SinhVIen(String tenSV, int maSV, float diemToan, float diemHoa, float diemLy) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;
	}
	//constructor không có tham số
	public SinhVIen() {
		
	}
	//business method
	public void nhapDl(Scanner sc) {
		System.out.println("Nhập tên sinh viên");
		this.tenSV = sc.nextLine(); 
		System.out.println("Nhập mã số sinh viên :");
		this.maSV=Integer.parseInt(sc.nextLine()); 
		System.out.println("Nhập điểm toán :");
		this.diemToan=Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm Hóa :");
		this.diemHoa=Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm Lý :");
		this.diemLy=Float.parseFloat(sc.nextLine());
	}
	public void thongtin() {
		System.out.println("Tên sinh viên : "+this.tenSV+"\n"+
							"mã số sinh viên: "+this.maSV+"\n"+
							"Điểm toán :"+this.diemToan+"\n"+
							"Điểm lý :"+this.diemLy+"\n"+
							"Điểm hóa :"+this.diemHoa+"\n"+
							"điểm trung bình: "+this.tinhDTB()+"\n"+
							"loại :"+this.xepLoai());
	}
	public float tinhDTB() { 
		return (long)((getDiemHoa() + getDiemLy() + getDiemToan())/3);
	}
	public String xepLoai() {
		if (tinhDTB() < 4) {
			return "Yếu";
		}else if (tinhDTB() < 6 ) {
			return "Trung Bình";
		}else if (tinhDTB() < 8) {
			return "Khá";
		}else {
			return"Giỏi";
		}
	}
}