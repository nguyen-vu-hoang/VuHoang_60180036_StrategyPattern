package packagebai3;

import java.util.Date;

public class SinhVien {
	private String hoTen;
	private Date ngaySinh;
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	private float diemTB;
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public SinhVien(String hoTen, Date date, float diemTB) {
		this.setHoTen(hoTen);
		this.ngaySinh = date;
		this.diemTB =diemTB;
	}
	public void setSinhVien(SinhVien sv) {
		// TODO Auto-generated constructor stub
		diemTB =sv.diemTB;
		hoTen=sv.hoTen;
		ngaySinh=sv.ngaySinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

}
