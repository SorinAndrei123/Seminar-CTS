package ro.ase.cts.singleton.eager;

public class ReceptieHotel {
	private String numeReceptioner;
	private int etaj;
	private String numeHotel;
	private static final ReceptieHotel receptie=new ReceptieHotel("receptie1",1,"Hilton");
	private ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
		super();
		this.numeReceptioner = numeReceptioner;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}
	public String getNumeReceptioner() {
		return numeReceptioner;
	}
	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}
	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}
	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}
	
	public static ReceptieHotel getReceptie() {
		return receptie;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceptieHotel [nume receptioner=");
		builder.append(numeReceptioner);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeHotel=");
		builder.append(numeHotel);
		builder.append("]");
		return builder.toString();
	}
	

}
