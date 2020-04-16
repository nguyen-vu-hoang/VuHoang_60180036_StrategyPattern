package packagebai2;

public class Strategy59cnttBai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GioHang gHang1 = new GioHang(new ThanhToanOnline());
		GioHang gHang2 = new GioHang(new ThanhToanCOD());

		gHang1.getGioHangHoa().add(new HangHoa("Bàn", 500, "chuyển phát nhanh"));
		gHang1.getGioHangHoa().add(new HangHoa("ghế", 250, "chuyển phát nhanh"));
		gHang2.getGioHangHoa().add(new HangHoa("Nồi cơm điện", 225, "Hàng dễ vỡ"));
		gHang2.getGioHangHoa().add(new HangHoa("Chảo chống dính", 125, "cho xem hàng"));
		
		
		System.out.println("Danh sách hàng mua trong giỏ 1: ");
		for (HangHoa hangHoa : gHang1.getGioHangHoa()) {
			System.out.println("Tên hàng: " + hangHoa.getTenHH());
			System.out.println("Giá: "+ hangHoa.getGia());
		}
		System.out.println("Tiền khách phải trả: " + gHang1.thanhToan());
		System.out.println("Danh sách hàng mua trong giỏ 2: ");
		for (HangHoa hangHoa : gHang2.getGioHangHoa()) {
			System.out.println("Tên hàng: " + hangHoa.getTenHH());
			System.out.println("Giá: "+ hangHoa.getGia());
		}
		System.out.println("Tiền khách phải trả: " + gHang2.thanhToan());
		
		
	}

}
