package ro.ase.cts.builder;

public class BuilderRezervare implements AbstractBuilderRezervare {

	private Rezervare rezervare;
	
	
	public BuilderRezervare() {
		super();
		this.rezervare=new Rezervare(0,false,false,false,false,"nimic");
		
	}
	public BuilderRezervare(int cod) {
		this.rezervare=new Rezervare(cod,false,false,false,false,"nimic");
	}
	

	@Override
	public Rezervare build() {
		return this.rezervare;
	}
	public BuilderRezervare setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);  
		return this;
	}
	public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public BuilderRezervare setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public BuilderRezervare setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	

}
