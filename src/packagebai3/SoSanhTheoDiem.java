package packagebai3;

public class SoSanhTheoDiem implements ISoSanh{

	@Override
	public int soSanh(SinhVien o1, SinhVien o2) 
	{
		if (o1.getDiemTB() > o2.getDiemTB()) 
			return 1;
		else if (o1.getDiemTB() == o2.getDiemTB()) 
			return 0;
		else return -1;
	}
	
}
