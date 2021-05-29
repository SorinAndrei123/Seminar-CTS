package ro.ase.cts.builder;

public class MainBuilder {

	public static void main(String[] args) {
	
	Rezervare rezervare1 =new Rezervare(1,true,false,true,true,"mozart");
	Rezervare rezervare2=new BuilderRezervare(111).setAreMancareInclusa(true).build();
	System.out.println(rezervare1.toString());
	System.out.println(rezervare2.toString());
	
//builder face shallow copy daca vrem sa creem mai multe obiecte de tip rezervare cu un singur builder
	
	
	
	BuilderRezervareV2 builderRezervareV2=new BuilderRezervareV2();
	builderRezervareV2.setAreBauturaInclusa(true).setAreMancareInclusa(true).setAreScaunErgonomic(true);
	
	Rezervare rezervare3=builderRezervareV2.setCodRezervare(4).build();
	Rezervare rezervare4=builderRezervareV2.setCodRezervare(10).build();
	System.out.println(rezervare3.toString());
	System.out.println(rezervare4.toString());

	}

}
