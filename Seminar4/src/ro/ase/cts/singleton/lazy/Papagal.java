package ro.ase.cts.singleton.lazy;

public class Papagal {
	private String nume;
	private int varsta;
	private float greutate;
	private static Papagal instanta = null;

	private Papagal(String nume, int varsta, float greutate) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.greutate = greutate;
	}

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public float getGreutate() {
		return greutate;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}

	public static synchronized Papagal getInstanta(String nume, int varsta, float greutate) {
		if (instanta == null) {
			instanta = new Papagal(nume, varsta, greutate);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Papagal [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", greutate=");
		builder.append(greutate);
		builder.append("]");
		return builder.toString();
	}

}
