public class EjercicioCuatro {
	public void dividePorCero() throws ArithmeticException {
		int suma = 5 / 0;
	}

	public void fueraDeRango() throws ArrayIndexOutOfBoundsException {
		char[] letras = new char[4];
		char caracter = letras[4];
	}

	public void llamadorErrores() throws Exception {
		dividePorCero();
		fueraDeRango();
		// Cambialos de orden para que llame a los dos fallos
	}

	public static void main(String[] args) {
		EjercicioCuatro instancia = new EjercicioCuatro();
		try {
			instancia.llamadorErrores();
		} catch (ArithmeticException e) {
			System.out.println("Aritmetica");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("fuera de rango");
		 } catch (Exception e) {
		 System.out.println("Averigua cuales son los fallos");
		 }
	}
}
