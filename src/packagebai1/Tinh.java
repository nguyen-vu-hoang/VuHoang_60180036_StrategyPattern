package packagebai1;

public class Tinh{
	private ITinh tinhtoan ;
	private float a, b;
	public Tinh(float _a, float _b) {
		a = _a;
		b = _b;
	}

	public void setTinhtoan(ITinh tinhtoan) {
		this.tinhtoan = tinhtoan;
	}

	public float ketQua() {
		return	tinhtoan.tinh(a,b);
	}
}
