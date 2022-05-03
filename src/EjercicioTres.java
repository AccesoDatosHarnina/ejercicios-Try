import java.util.Scanner;


public class EjercicioTres {
public static void main(String[] args) {
	System.out.println("da igual");
	Scanner leer=new Scanner(System.in);
	//con esta orden leemos solo la primera letra (la 0)
	char letra=leer.nextLine().charAt(0);
	try {
		int trampa=Integer.parseInt(Character.toString(letra));
		//si se puede analizar el valor de la letra por un integer es que
		//es un numero. Por eso no dará error y llegaremos a la siguiente
		//línea que convierte la letra en una 'a'
		letra='a';
	} catch (NumberFormatException e) {
		//en este caso el fallo quiere decir que esta bien, que era una letra
		//y no hacemos nada
		System.out.println("Era una letra");
	}
	System.out.println("la letra es "+letra);
}
}
