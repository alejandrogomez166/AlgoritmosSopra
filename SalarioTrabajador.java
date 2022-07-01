package ejercicio3;

import java.util.Scanner;

public class SalarioTrabajador {
	//devuelve las horas trabajadas
	public static int leerHorasTrabajadas(Scanner keyboard) {
		int horas =0;
		try {
		System.out.println("Introduce el número de horas trabajadas");
		horas  = Integer.parseInt(keyboard.nextLine());
		while(horas <0) {
			System.out.println("Valor introducido no valido");
			System.out.println("Introduce el número de horas trabajadas");
			horas  = Integer.parseInt(keyboard.nextLine());
		}
		}catch( java.lang.NumberFormatException e) {
			System.out.println("Valor introducido no valido");
			return leerHorasTrabajadas(keyboard);
		}
		return horas;
	}
	//devuelve la tarifa (mismo metodo que leerHorasTrabajadas)
	public static float leerTarifa(Scanner keyboard) {
		float tarifa = 0;
		try {
			System.out.println("Introduce la tarifa");
			tarifa = Float.parseFloat(keyboard.nextLine());
			while(tarifa <0) {
				System.out.println("Valor introducido no valido");
				System.out.println("Introduce el número de horas trabajadas");
				tarifa  =  Float.parseFloat(keyboard.nextLine());
			}
		}catch( java.lang.NumberFormatException e){
			System.out.println("Valor introducido no valido");
			return leerTarifa(keyboard);
		}
		return tarifa;
		
		
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int horasTrabajadas;
		float tarifa;
		float resultado;
		
		horasTrabajadas = leerHorasTrabajadas(keyboard);
		tarifa = leerTarifa(keyboard);
		
		if(horasTrabajadas <= 40) {
			resultado = horasTrabajadas * tarifa;
		}
		else {
			resultado = (float) ((40 * tarifa) + (horasTrabajadas-40) * (tarifa * 0.5 + tarifa));
			
		}
		System.out.println("Salario => " +resultado);
		keyboard.close();

	}

}
