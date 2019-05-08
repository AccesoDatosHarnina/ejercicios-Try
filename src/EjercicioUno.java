import java.util.Scanner;

public class EjercicioUno {
	// Todas las excepciones son de runtime por eso puedo usar un único
	// catch comun
	public static void main(String[] args) {
		String hola = new String("hola");
		try {
			// hola.charAt(6);
			Scanner leer = null;
			// leer.nextLine();
			String.class.getName();
			int tamano = -9;
			char[] letras = new char[tamano];
		} catch (RuntimeException e) {
			if (e.getClass().equals(StringIndexOutOfBoundsException.class))
				System.out.println("soy un fuera de rango de string");
			else if (e.getClass().equals(NullPointerException.class))
				System.out.println("Accediendo a un objeto nulo");
			else if (e.getClass().equals(ArrayIndexOutOfBoundsException.class))
				System.out.println("fallo en el array");
			else
				System.out.println("fallo no reconocido " + e.getClass().getName());
		}

	}
}
