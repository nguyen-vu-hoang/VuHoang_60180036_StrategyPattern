package packagebai3;

import java.util.ArrayList;

public class QLSV {
	private ISoSanh soSanh;
	public void setSoSanh(ISoSanh soSanh) {
		this.soSanh = soSanh;
	}
	
	private ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
	
	
	public ArrayList<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}

	public void sapXep() {
		SinhVien tamSinhVien =new SinhVien(null, null, 0);
		for (int i = 0; i < dsSinhVien.size(); i++)
		{
			for (int j = i+1; j < dsSinhVien.size(); j++) 
				
				if (soSanh.soSanh(dsSinhVien.get(i), dsSinhVien.get(j))==1) {
					tamSinhVien.setSinhVien(dsSinhVien.get(i));
					dsSinhVien.get(i).setSinhVien(dsSinhVien.get(j));
					dsSinhVien.get(j).setSinhVien(tamSinhVien);
			}
			
		}
		
	}
	public void inDS() {
		System.out.println("Danh sách sinh viên: ");
		for (SinhVien sinhVien : dsSinhVien) {
			System.out.println("Tên sinh viên: " + sinhVien.getHoTen());
			System.out.println("Diểm trung binh: " + sinhVien.getDiemTB());
			System.out.println("Ngày sinh: " + sinhVien.getNgaySinh());
		}
	}
	
}
