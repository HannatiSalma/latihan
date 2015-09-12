class mahasiswa{
String id;
int indeks;
int i;
static String[][] DataMahasiswa = {

		{"13751", "Prima Permana", "08523298192"},
		{"13752", "Roni Pradana", "08857842837"},
		{"13753", "Salman Fahmi", "08993123784"},
		{"13754", "Solahudin Alfath", "08789123721"}};
String getmahasiswa(String id)
	{
		for(i=0;i<4;i++)
		{
			if(id.equals(DataMahasiswa[i][0]))
			{
				indeks=i;
				break;
			}
		}
		return DataMahasiswa[indeks][0];
	}
	String getmahasiswa(String id, int code)
	{
		for(i=0;i<4;i++)
		{
			if(id.equals(DataMahasiswa[i][0]))
			{
				indeks=i;
				break;
			}
		}
		return DataMahasiswa[indeks][code];
	}
	
}