package packagebai2;

public class HangHoa {
	private String tenHH;
	private int gia;
	public String getTenHH() {
		return tenHH;
	}

	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	private String moTa;
	
	public HangHoa(String _tenHH, int _gia, String _moTa) {
		tenHH = _tenHH;
		gia = _gia;
		moTa = _moTa;
	}
}
