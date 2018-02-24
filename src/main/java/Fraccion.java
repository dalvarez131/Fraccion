
public final class Fraccion {
	private int numerator;
	private int denominator;
	
	public Fraccion(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator can not be 0");
		}else {
			this.numerator = numerator;
			this.denominator = denominator;
		}
	}
	public Fraccion(int numerator) {
		Fraccion fraccion = new Fraccion(numerator,1);
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public static int mcd(int a, int b) {
		   return b == 0 ? a : mcd(b, a % b);
	}
	public static int mcm(int a, int b) {
		
		   return (a * b) / mcd(a, b);
	}

	public Fraccion simplify() {
		int numerator1 = this.numerator/(Fraccion.mcd(this.numerator,this.denominator));
		int denominator1 = this.denominator/(Fraccion.mcd(this.numerator,this.denominator));
		Fraccion fraccion = new Fraccion (numerator1, denominator1);
		return fraccion;
	}
	
	public Fraccion plus(Fraccion fraction2) {
		int denominator1 = this.getDenominator();
		int denominator2 = fraction2.getDenominator();
		int numerator1 = this.getNumerator();
		int numerator2 = fraction2.getNumerator();
		int mcm = mcm(denominator1, denominator2);
		int a = (mcm / denominator2) * numerator1;
		int b = (mcm / denominator1) * numerator2;

		return new Fraccion(a+b, mcm);
		}

	public Fraccion minus(Fraccion fraction2) {
		int denominator1 = this.getDenominator();
		int denominator2 = fraction2.getDenominator();
		int numerator1 = this.getNumerator();
		int numerator2 = fraction2.getNumerator();
		int mcm = mcm(denominator1, denominator2);
		int a = - (mcm / denominator2) * numerator1;
		int b = (mcm / denominator1) * numerator2;
		
		return new Fraccion(a+b, mcm);
		}

	public Fraccion times(Fraccion fraction2) {
		int denominator1 = this.getDenominator();
		int denominator2 = fraction2.getDenominator();
		int numerator1 = this.getNumerator();
		int numerator2 = fraction2.getNumerator();
		Fraccion fraccionExtendida = new Fraccion (numerator1 * numerator2,denominator1 * denominator2);
		Fraccion fraccionFinal = new Fraccion(fraccionExtendida.simplify().getNumerator(), fraccionExtendida.simplify().getDenominator());
		return fraccionFinal;
		}
	
	public Fraccion divided(Fraccion fraction2) {
		int denominator1 = this.getDenominator();
		int denominator2 = fraction2.getNumerator();
		int numerator1 = this.getNumerator();
		int numerator2 = fraction2.getDenominator();
		Fraccion fraccionExtendida = new Fraccion (numerator1 * numerator2,denominator1 * denominator2);
		Fraccion fraccionFinal = new Fraccion(fraccionExtendida.simplify().getNumerator(), fraccionExtendida.simplify().getDenominator());
		return fraccionFinal;
		}

	
}
