  

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GrupaFixture {

	private Grupa grupa;
	
	@Before
	public void setup() {
		this.grupa = new Grupa(1078);
		for(int i = 0; i < 35; i++) {
			Student student = new Student();
			for (int j = 0; j < 7; j++) {
				student.adaugaNota(9);	
			}
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout=500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}