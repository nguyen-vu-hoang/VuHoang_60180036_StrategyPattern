package packagebai2;

import java.util.ArrayList;

public class GioHang {
	private IThanhToan hinhThucTT ;
	private ArrayList<HangHoa> gioHangHoa = new ArrayList<HangHoa>();
	
	
	
	public GioHang(IThanhToan _hinhThucTT) {
		hinhThucTT = _hinhThucTT;
		}
	
	
	public ArrayList<HangHoa> getGioHangHoa() {
		return gioHangHoa;
	}

	
	
	public double thanhToan() {
		double sum = 0;
		for (HangHoa hangHoa : gioHangHoa) {			
			sum += hinhThucTT.thanhToan(hangHoa.getGia());
		}
		return sum;
	}
	
	
}
