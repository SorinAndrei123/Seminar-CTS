package ro.ase.cts.memento;

public class MeciJucat {
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int nrBilete;
	private int nrSpectatori;
	private int numarJandarmi;
	private int numarStewarzi;
	public MeciJucat(String numeEchipaGazda, String numeEchipaOaspeti, int nrBilete, int nrSpectatori,
			int numarJandarmi, int numarStewarzi) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrBilete = nrBilete;
		this.nrSpectatori = nrSpectatori;
		this.numarJandarmi = numarJandarmi;
		this.numarStewarzi = numarStewarzi;
	}
	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}
	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori; 
	}
	public void setNumarJandarmi(int numarJandarmi) {
		this.numarJandarmi = numarJandarmi;
	}
	public void setNumarStewarzi(int numarStewarzi) {
		this.numarStewarzi = numarStewarzi;
	}
	public Memento creareMemento() {
		Memento memento=new Memento(this.numeEchipaGazda, this.numeEchipaOaspeti, this.nrSpectatori);
		return memento;
	}
	public void setMemento(Memento memento) {
		this.numeEchipaGazda=memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti=memento.getNumeEchipaOaspeti();
		this.nrSpectatori=memento.getNrSpectatori(); 
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", numarJandarmi=");
		builder.append(numarJandarmi);
		builder.append(", numarStewarzi=");
		builder.append(numarStewarzi);
		builder.append("]");
		return builder.toString();
	}
	
	 

}
