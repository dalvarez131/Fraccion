import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class FraccionTest {

	@Test
	public void simplificar() {
		Fraccion fraccion = new Fraccion(15,12);
		assertEquals(fraccion.simplify().getNumerator(),5);
		assertEquals(fraccion.simplify().getDenominator(),4);
	}
	@Test
	public void sumaFraccionarios() {
		Fraccion fraccion = new Fraccion(1,1);
		Fraccion fraccion2 = new Fraccion(1,2);
		assertEquals(fraccion.plus(fraccion2).getNumerator(),3);
		assertEquals(fraccion.plus(fraccion2).getDenominator(),2);
	}
	public void restaFraccionarios() {
		Fraccion fraccion = new Fraccion(3,2);
		Fraccion fraccion2 = new Fraccion(1,2);
		assertEquals(fraccion.plus(fraccion2).getNumerator(),1);
		assertEquals(fraccion.plus(fraccion2).getDenominator(),1);
	}
	@Test
	public void multiplicaFraccionarios() {
		Fraccion fraccion = new Fraccion(3,1);
		Fraccion fraccion2 = new Fraccion(1,3);
		assertEquals(fraccion.times(fraccion2).getNumerator(),1);
		assertEquals(fraccion.times(fraccion2).getDenominator(),1);
	}
	@Test
	public void divideFraccionarios() {
		Fraccion fraccion = new Fraccion(2,3);
		Fraccion fraccion2 = new Fraccion(2,6);
		assertEquals(fraccion.divided(fraccion2).getNumerator(),2);
		assertEquals(fraccion.divided(fraccion2).getDenominator(),1);
	}



	
}
