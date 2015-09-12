class perkuliahan extends matkul
{
	public perkuliahan (String kode_matkul, int code)
	{
		super.getmatkul(kode_matkul,code);
	}
	public double getmandiri(String kode_matkul, int code)
	{
		mandiri = Double.parseDouble(getmatkul(kode_matkul,2));
		return mandiri;
	}
	public double getterstruktur(String kode_matkul, int code)
	{
		terstruktur =  Double.parseDouble(getmatkul(kode_matkul,3));
		return terstruktur;
	}
	public double getuts(String kode_matkul, int code)
	{
		uts =  Double.parseDouble(getmatkul(kode_matkul,4));
		return uts;
	}
	public double getuas(String kode_matkul, int code)
	{
		uas =  Double.parseDouble(getmatkul(kode_matkul,5));
		return uas;
	}
	public double nilaiakhir (double mandiri1, double terstruktur1, double uts1, double uas1,String kode_matkul)
	{
		nilaiakhir=(mandiri1 * getmandiri(kode_matkul, 2))+(terstruktur1 * getterstruktur(kode_matkul, 3))+(uts1 * getuts(kode_matkul, 4))+(uas1 * getuas(kode_matkul,5));
		return nilaiakhir;
	}
	 public String hurufmutu ( double nilaiakhir){
			String hurufmutu="";
 			// nilaiakhir=Double.parseDouble(nilaiakhir);
 			if (nilaiakhir >=80 && nilaiakhir<=100)
 				hurufmutu="A";
 			else if (nilaiakhir>=70 && nilaiakhir<79) 
 				hurufmutu="B";
 			else if (nilaiakhir>=60 && nilaiakhir<69) 
 				hurufmutu="C";
 			else if (nilaiakhir>=50 && nilaiakhir<69) 
 				hurufmutu="D";
 			else
 				hurufmutu="E";
			return hurufmutu;
			}	
	public int angkamutu(String hurufmutu){
		int angkamutu;
		if (hurufmutu.equals("A"))
			angkamutu=4;
		else if(hurufmutu.equals("B"))
			angkamutu=3;
		else if (hurufmutu.equals("C"))
			angkamutu=2;
		else if (hurufmutu.equals("D"))
			angkamutu=1;
		else 
			angkamutu=0;
			return angkamutu;
	}
	
	public int angkakredit(int getMinimal , int angkamutu){
		int angkakredit;
		angkakredit = angkamutu*getMinimal;
		return angkakredit;
	}
	
	
}