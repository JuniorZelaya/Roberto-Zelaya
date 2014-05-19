import java.util.Scanner;
public class Junio3 {

	public static void main (String[] args){
		System.out.println("Bienvenido a Lord of Dead ");
		System.out.println("Iniciando juego...");
		/*Declaramos variable para que el usuario ingrese los datos*/
		System.out.println("Ingrese numero 1: ");
		Scanner S = new Scanner(System.in);
		int num1; 
		num1= S. nextInt();
		System.out.println("Ingrese numero 2: ");
		int num2;
		num2= S. nextInt();
		System.out.println("Ingrese numero 3: ");
		int num3;
		num3= S. nextInt();
		
		/*Usamos el if y el else if para que desarrolle la accion si se cumple la condicion*/
			if (num3<500)

				System.out.println("Game Over");

			else if (num3<700)	
				System.out.println("Suficiente");

			else if (num3<=1000)
				System.out.println("Bueno");

			else if (num3>1000)
				System.out.println("Excelente"); 
				System.out.println("Has ganado");
				{
		System.out.println("Fin del juego");
				}
	}
}





		
			
