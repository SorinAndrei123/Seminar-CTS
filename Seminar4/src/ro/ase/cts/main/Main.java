package ro.ase.cts.main;

import ro.ase.cts.singleton.lazy.Papagal;
import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Main {

	public static void main(String[] args) {
	//	ReceptieHotel receptie1=ReceptieHotel.getReceptie();
	//	ReceptieHotel receptie2=ReceptieHotel.getReceptie();
	//	System.out.println(receptie1.toString());
	//	System.out.println(receptie2.toString());
		//receptie1.setNumeReceptioner("Costelus");
	//	receptie2.setEtaj(100);
		
		
		Papagal papagal1=Papagal.getInstanta("piticu", 2, 2.4f);
		papagal1.setNume("Costel");
		Papagal papagal2=Papagal.getInstanta("asda", 4, 10.4f);
		papagal2.setVarsta(12);
		
		System.out.println(papagal1.toString());
		System.out.println(papagal2.toString());

	}

}
