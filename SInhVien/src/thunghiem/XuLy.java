package thunghiem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class XuLy {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<SinhVIen>listdsSVIens= new ArrayList<SinhVIen>();
	doMenu(listdsSVIens);
}
public static void inMenu() {
	System.out.println("1.Thêm sinh viên"+"\n"+
						"2.Xuất sinh viên"+"\n"+
						"3.Tìm sinh viên bằng tên "+"\n"+
						"4.Tìm sinh viên bằng mã số sinh viên "+"\n"+
						"5.Xóa một sinh viên  "+"\n"+	
						"6.Tìm kiếm điểm trung bình của sinh viên "+"\n"+
						"0.Thoát");
}
public static void doMenu(ArrayList<SinhVIen> dssv) {
	Scanner sc= new Scanner(System.in);
	boolean flag = true;
	int luachon=0;
	do {
	inMenu();
	System.out.println("nhập lựa chọn :");
	luachon =Integer.parseInt(sc.nextLine());
	switch (luachon) {
	case 1: 
	SinhVIen sv = new SinhVIen();
	sv.nhapDl(sc);
	dssv.add(sv);
		break;
	case 2:
	for(SinhVIen xuatsv : dssv) {
	xuatsv.thongtin();
	}
		break;
	case 3:
		SinhVIen x = new SinhVIen();
	    System.out.println("Nhập tên sinh viên cần tìm:");
	    String tenSv = sc.nextLine();
	    boolean timSv = false;
	    for (SinhVIen a : dssv) {
	        if (a.getTenSV().equalsIgnoreCase(tenSv)) {
	            timSv = true;
	            x = a;
	            break;
	        }
	    }
	    if (timSv) {
	        System.out.println("Đã tìm thấy sinh viên có tên là " + tenSv);
	        x.thongtin();
	        
	    }else {
			System.out.println("Không tìm thấy sinh viên có tên là :"+tenSv);
		}
	    break;
	case 4: 
		SinhVIen masso = new SinhVIen();
		boolean timsvbangmaso = false;
		System.out.println("Nhập mã số sinh viên :");
		int mssv = Integer.parseInt(sc.nextLine());
		for(SinhVIen maso : dssv) {
			if (maso.getMaSV() == mssv) {
				timsvbangmaso = true;
				masso =maso;
				break;
			}
		}
		if (timsvbangmaso) {
			System.out.println("đã tìm thấy sinh viên có mã số :"+mssv);
			masso.thongtin();
			System.out.println("******************");
		}else {
			System.out.println("Không tìm thấy sinh viên có mã só :"+mssv);
			System.out.println("******************");
		}
		
		break;
		
	case 5:
		boolean tim = false;
		SinhVIen m = new SinhVIen();
	System.out.println("nhập ma sinh viên mà bạn muốn xóa :");
	int masv = Integer.parseInt(sc.nextLine());
	for(SinhVIen a :dssv) {
		if(a.getMaSV() == masv) {
			tim=true;
			m=a;
			break;
		}
		
	}
	if (tim==true) {
		dssv.remove(m);
	}else {
		System.out.println("Không có sinh viên nào mang mã số trên ");
	}
	break;
	case 6:
		int bodem = 0;
		boolean FoundScores =false;
		System.out.println("Nhập điểm trung bình bạn muốn tìm");
		float sreachdiem=Float.parseFloat(sc.nextLine());
		for(SinhVIen sreach :dssv) {
			if (sreach.tinhDTB() >= sreachdiem) {
				FoundScores = true;
				bodem+=1;
				break;
			}
		}
		if (FoundScores) {
			System.out.println("Đã tìm thấy sinh viên có điểm trung bình >="+sreachdiem+" là "+bodem+" sinh viên !");
			
		}else {
			System.out.println("Hiện tại không tìm thấy sinh viên có số điểm >="+sreachdiem);
		}
		break;
	case 0:
		
		System.out.println("Exit successfully");
		flag = false;
		break;
	}
	} while (flag);
}
}