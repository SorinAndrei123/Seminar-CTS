package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantata=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder("Elev");
		stringBuilder.append(super.toString()).append("clasa:" ).append(this.clasa).append(", tutore:").append(this.tutore);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int finantare() {
		int s=30;
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return s;
	}
	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compunereStringSumaFinantata(this.sumaFinantata, "Elevul"));
		
	}
	
}
