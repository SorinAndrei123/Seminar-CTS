package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;

	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afiseazaStatutsPeProiect(Proiect proiect){
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Aplicantul ").append(this.nume).append(" ").append(this.prenume);
		stringBuilder.append(punctaj>proiect.getPragAcceptare() ? " a fost acceptat":"nu a fost acceptat");
			System.out.println(stringBuilder.toString());
		}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	public String[] getDenumireProiect() {
		return denumireProiect;
	}
	public void setDenumireProiect(String[] denumireProiect,int nrProiecte) {
		this.denumireProiect = denumireProiect;
		this.nr_proiecte=nrProiecte;
	}
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}
	
	public abstract void afisareSumaFinantata();
	public  String compunereStringSumaFinantata(int suma,String tipAplicant) {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(tipAplicant);
		stringBuilder.append(getNume());
		stringBuilder.append(" ");
		stringBuilder.append(getPrenume());
		stringBuilder.append(" primeste");
		stringBuilder.append(suma);
		stringBuilder.append(" Euro/zi in proiect.");
		return stringBuilder.toString();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nr_proiecte=");
		builder.append(nr_proiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		builder.append("]");
		return builder.toString();
	}
	

}
