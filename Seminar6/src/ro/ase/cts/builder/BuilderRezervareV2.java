package ro.ase.cts.builder;

public class BuilderRezervareV2  implements AbstractBuilderRezervare{
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public BuilderRezervareV2() {
		this.codRezervare=0;
		this.areBauturaInclusa=false;
		this.areMancareInclusa=false;
		this.areMuzicaAmbientala=false;
		this.areScaunErgonomic=false;
		this.genMuzica=null;
	}
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare,areMancareInclusa,areBauturaInclusa,areScaunErgonomic,areMuzicaAmbientala,genMuzica);
		
	}

	public BuilderRezervareV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public BuilderRezervareV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	

}
