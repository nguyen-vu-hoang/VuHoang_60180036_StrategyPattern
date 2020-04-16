package packagebai1;

public class Strategy59CNTT2Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tinh tinhToan1 = new Tinh(75 , 12) ;
		tinhToan1.setTinhtoan(new Cong());
		System.out.println("Kết quả: 75 + 12 = " + tinhToan1.ketQua());
		Tinh tinhToan2 = new Tinh(54 , 78) ;
		tinhToan2.setTinhtoan(new Tru());
		System.out.println("Kết quả: 54 -78 = " + tinhToan2.ketQua());
	}

}
