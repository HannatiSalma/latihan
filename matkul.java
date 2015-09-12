import java.util.Scanner;
class matkul{
public String kode_matkul;
int i;
String nilai;
double  nilaiakhir;
static String[][] DataMatkul = {

		{"IF8201","Basis Data","0.2", "0.2","0.2", "0.2" },
		{"IF8307", "Grafika komputer", "0.25", "0.25","0.25","0.25"},
		{"IF8303","Organisasi & arsitektur komputer","0.2", "0.2","0.3","0.3"},
		{"IF8202", "Pemrograman Berorientasi Objek","0.25", "0.25","0.2","0.3"},
		{"IF8101L", "Praktikum Basis data","0.3","0.2","0.2","0.3"}
	};
	protected String nama ="" ;
	protected int Minimal;
	protected double mandiri=0, terstruktur=0, uts=0, uas=0;
	
	public String getmatkul(String kode_matkul, int code)
	{
		int indeks=-1;
		for(i=0;i<4;i++)
		{
			if(kode_matkul.equals(DataMatkul[i][0]))
			{
				indeks=i;
				break;
			}
		}
		return DataMatkul[indeks][code];
	}

	public int getMinimal(String kode_matkul)
	{
		int min=0;
		for(i=0;i<4;i++)
		{
			if(kode_matkul.equals(DataMatkul[i][0]))
			{
				min=Integer.parseInt(kode_matkul.substring(3,4));
				break;
			}
		}
		return min;
	}
}