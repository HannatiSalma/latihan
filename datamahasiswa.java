import java.util.Scanner;
import java.util.*;
import java.text.*;
class datamahasiswa{
	public static void main (String[]args)
	{
	int ulangi;
		Scanner scan = new Scanner (System.in);
		String nama;
		String nim,kode_matkul;
		double mandiri1,terstruktur1,uts1,uas1,nilaiakhir;
		int angkamutu,angkakredit;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("                     Rifa Mardiana Sofa                        ");
		System.out.println("                      1137050185                           ");
		System.out.println("-----------------------------------------------------------");
		System.out.print("NIM			: ");
		nim = scan.nextLine();
		mahasiswa mhs = new mahasiswa();
		mhs.getmahasiswa (nim);
		System.out.println("Nama Mahasiswa		: "+mhs.getmahasiswa(nim,1));
		System.out.print("Kode matkul		: ");
		kode_matkul=scan.nextLine();
		perkuliahan pkl = new perkuliahan(kode_matkul,0);
		pkl.getmatkul(kode_matkul,0);
		System.out.println("nama matkul		: "+pkl.getmatkul(kode_matkul,1));
		System.out.println("sks			: "+pkl.getMinimal(kode_matkul));
		System.out.print("mandiri			: ");
		mandiri1= scan.nextDouble();
		System.out.print("terstruktur		: ");
		terstruktur1= scan.nextDouble();
		System.out.print("UTS			: ");
		uts1= scan.nextDouble();
		System.out.print("UAS			: ");
		uas1= scan.nextDouble();
		System.out.println("nilai akhir :"+pkl.nilaiakhir(mandiri1,terstruktur1,uts1,uas1,kode_matkul));
		System.out.println("huruf mutu :"+pkl.hurufmutu(pkl.nilaiakhir(mandiri1,terstruktur1,uts1,uas1,kode_matkul)));
		System.out.println("angka mutu :"+pkl.angkamutu(pkl.hurufmutu(pkl.nilaiakhir(mandiri1,terstruktur1,uts1,uas1,kode_matkul))));
		System.out.println("angka kredit :"+pkl.angkakredit(pkl.getMinimal(kode_matkul),pkl.angkamutu(pkl.hurufmutu(pkl.nilaiakhir(mandiri1,terstruktur1,uts1,uas1,kode_matkul)))));
		System.out.println("\n-----------------------------------------------------------");
	}
}