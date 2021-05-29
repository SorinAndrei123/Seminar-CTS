package ro.ase.cts.singleton.lazy;


public class ReceptieHotel {
	private String numeReceptioner;
	private int etaj;
	private String numeHotel;
	private static ReceptieHotel receptie=null;
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
	
	public static  synchronized ReceptieHotel getReceptie() {
		if(receptie==null) {
			receptie=new ReceptieHotel("dorel",10,"asdad");
		}
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
	