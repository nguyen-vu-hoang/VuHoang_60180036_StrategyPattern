package packagebai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Strategy59CNTT2Bai3 {

	public static void main(String[] args) throws ParseException {

		DateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		SinhVien sv1 = new SinhVien("Nguyễn Thị Vân", dFormat.parse("12-10-1998"), (float) 7.0);
		SinhVien sv2 = new SinhVien("Nguyễn Văn Thế", dFormat.parse("01-15-1999"), (float) 6.5);
		SinhVien sv3 = new SinhVien("Nguyễn Văn Hùng", dFormat.parse("12-08-1998"), (float) 8.0);
		
		System.out.println("\nDanh sách sinh viên sắp xếp theo điểm: ");
		QLSV qlsv1 = new QLSV();
		qlsv1.setSoSanh(new SoSanhTheoDiem());
		qlsv1.getDsSinhVien().add(sv1);
		qlsv1.getDsSinhVien().add(sv2);
		qlsv1.getDsSinhVien().add(sv3);
		qlsv1.sapXep();
		qlsv1.inDS();
		
		System.out.println("\nDanh sách sinh viên sắp xếp theo tên: ");
		QLSV qlsv2 = new QLSV();
		qlsv1.setSoSanh(new SoSanhTheoTen());
		qlsv2.getDsSinhVien().add(sv1);
		qlsv2.getDsSinhVien().add(sv2);
		qlsv2.getDsSinhVien().add(sv3);
		qlsv1.sapXep();
		qlsv1.inDS();
	
	}

}
