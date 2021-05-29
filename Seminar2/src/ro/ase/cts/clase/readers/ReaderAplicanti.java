package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;
	
          public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}
		public abstract List<Aplicant>readAplicanti(String fileName) throws FileNotFoundException;
		public List<Aplicant> readAplicanti() throws FileNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}
		public void citesteAplicant(Scanner input,Aplicant aplicant) {
			String nume = input.next();
			String prenume = input.next();
			int varsta = input.nextInt();
			int punctaj = input.nextInt();
			int nr = input.nextInt();
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input.next();
			aplicant.setNume(nume);
			aplicant.setPrenume(prenume);
			aplicant.setPunctaj(punctaj);
			aplicant.setNr_proiecte(nr);
			aplicant.setPunctaj(punctaj);
			aplicant.setDenumireProiect(vect, nr);
			
		}
      
}
