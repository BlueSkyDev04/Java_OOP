package Bo;

import java.util.ArrayList;
import java.util.Scanner;

public class DSBo {
ArrayList<Boo> DS= new ArrayList<Boo>();
public void nhapDSConBo(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhập danh sách bò: ");
	Boo y;
	String tt;
	do{
		y=new Boo();
		y.nhapDL();
		sc.nextLine();
		DS.add(y);
		System.out.println("Nhập end để kết thúc: ");
		tt=sc.nextLine();
	}while(!tt.equals("end"));
}
public void xuatDSBo(){
	System.out.println("Danh sách bò: ");
	for (Boo a: DS)
	{
		a.xuatTT();
	}
	System.out.println("Danh sách có: "+DS.size()+"Con bò");
	
}
public static void main(String[] args) {
	DSBo f = new DSBo();
	f.nhapDSConBo();
	f.xuatDSBo();
}
}
