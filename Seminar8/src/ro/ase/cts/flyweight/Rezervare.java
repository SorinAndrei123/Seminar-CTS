package ro.ase.cts.flyweight;

public class Rezervare {
	private int nrMasa;
	private String oraRezervarii;
	private int nrPersoane;
	public Rezervare(int nrMasa, String oraRezervarii, int nrPersoane) {
		super();
		this.nrMasa = nrMasa;
		this.oraRezervarii = oraRezervarii;
		this.nrPersoane = nrPersoane;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", oraRezervarii=");
		builder.append(oraRezervarii);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append("]");
		return builder.toString();
	}
	

}
