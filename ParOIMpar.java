package ejercicio1;
import java.util.Scanner;
public class ParOIMpar {
	//lee el texto que pasa el usuario y lo trata
	public static int leerNumero() {
		Scanner keyboard = new Scanner(System.in);
		int numero =  0;
		System.out.println("Introduce un número");
		//comprobamos que es un número entero
		try {
			String text = keyboard.nextLine();
			text = text.replace(" ", "");
			numero = Integer.parseInt(text);
			
		
		}catch( java.lang.NumberFormatException e) {
			System.out.println("El número introducido no es un entero");
		}
		keyboard.close();
		return numero;
	}
	
	//método main
	public static void main(String[] args) {
		int numero;
		numero = leerNumero();
		// resta 2 a todos los números (tanto pares como impares)
		for(int i=0;numero>=0;i++) {
			System.out.println(numero);
			numero-=2;
		}
	}

}
