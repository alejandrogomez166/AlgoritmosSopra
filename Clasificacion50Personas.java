package ejercicio2;
import java.util.Scanner;
public class Clasificacion50Personas {
	
	//devuelve la edad
	public static int leerPersonas(int i,Scanner keyboard) {
		int age = 0;
		try {
			System.out.println("Introduce la edad de la persona (0-99) " + (i+1));
			age = Integer.parseInt(keyboard.nextLine());
			while(age>99 || age < 0) {
				System.out.println("Valor introducido no valido");
				System.out.println("Introduce la edad de la persona (0-99) " + (i+1));
				age = Integer.parseInt(keyboard.nextLine());
			}
			
			
			}catch( java.lang.NumberFormatException e) {
				System.out.println("Valor introducido no valido");
				return leerPersonas(i,keyboard);
				}
		return age;
			}
		
	
	//reads 50 people
	public static void readPeople() {
		//variables declaradas
		Scanner keyboard = new Scanner(System.in);
		String sex;
		int mayorDeEdad = 0;
		int mayorDeEdadM = 0;
		int menorDeEdad = 0;
		int menorDeEdadF =0;
		float porMayor = 0;
		float porMujeres = 0;
		String[] sexos = new String[50];
		int [] ages = new int[50];
		int age;
		String[][] personas = new String[50][2];
		
		for(int i=0;i<personas.length;i++) {
			//sexo
			System.out.println("Introduce el sexo de la persona (M o F) " + (i+1));
			sex = keyboard.nextLine().toUpperCase();
			// mientras no sea ni m ni f
			while( !sex.toUpperCase().equals("M") && !sex.toUpperCase().equals("F")) {
				System.out.println("Dato introducido no valido");
				System.out.println("Introduce el sexo de la persona (M o F) " + (i+1));
				sex = keyboard.nextLine().toUpperCase();
			}
			//age
			age = leerPersonas(i,keyboard);
			personas[i][0]= sex;
			personas[i][1] =String.valueOf(age);
		}
		
		 for (int i=0;i<personas.length;i++){
	            for(int j=0;j<personas[0].length;j++){
	               sexos[i]= personas[i][0];
	                ages[i] = Integer.parseInt(personas[i][1]);
	           }
	      
		 }
		 for(int i=0;i<sexos.length;i++) {
			 if(sexos[i].equals("F")) {
				 porMujeres++;
			 }
			 if(ages[i]>=18) {
				 mayorDeEdad++;
				 if(sexos[i].equals("M")) {
					 mayorDeEdadM++;
				 }
			 }
			 else {
				 menorDeEdad++;
				 if(sexos[i].equals("F")) {
					 menorDeEdadF++;
				 }
			 }
			
		 }
		 porMujeres = porMujeres/sexos.length * 100;
		 porMayor = (float)mayorDeEdad / ages.length * 100;
		 //imprime los datos pedidos
		 System.out.println("Cantidad de personas mayores de edad (18 años o más) => " +mayorDeEdad);
		 System.out.println("Cantidad de personas menores de edad => " +menorDeEdad);
		 System.out.println("Cantidad de personas masculinas mayores de edad => " +mayorDeEdadM);
		 System.out.println("Cantidad de personas femeninas menores de edad => " +menorDeEdadF);
		 System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas => " +Math.round(porMayor*100)/100+"%" );
		 System.out.println("Porcentaje que representan las mujeres respecto al total de personas => " +Math.round(porMujeres*100)/100 +"%" );
	     
		 keyboard.close();     
		
		
	}
	//método main
	public static void main(String[] args) {
		readPeople();

	}

}
