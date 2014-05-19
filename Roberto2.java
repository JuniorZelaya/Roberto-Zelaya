import java.util.Scanner;
public class Roberto2 {
	
	public static void main (String[] args){
		System.out.println("Ingrese un numero");
		Scanner S = new Scanner(System.in);
		int x; 
		x= S. nextInt();
		System.out.println("Ingrese un texto");
		String h;
		h= S.next();
		/*Utilizamos el while para repetir varias veces la variable que el usuario ingrese*/
		/*Creamos una varible contadora para repetir el texto*/
		int hola=0;
		while (hola<x)
		{	
			System.out.println(h);
		  hola++;
		}	

	}
}	

