package CongDan;

public class Date {
	int ngay, thang, nam;
	public Date(int ngay, int thang, int nam) {
		this.ngay=ngay;
		this.thang=thang;
		this.nam=nam;
		}
	public String XuatDate() {
		return this.ngay+"/"+this.thang+"/"+this.nam;
	}
}
