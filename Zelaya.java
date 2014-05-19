import java.util.Scanner;
public class Zelaya {

	public static void main(String[] args){
	Scanner s = new Scanner (System.in);
	System .out.print("The Hangover");
	/*Orientar al usuario con las opciones*/
	System.out.println ("Ingrese una calificacion)(1,2,3,4,5)");
	/*Declaracion de variables en este caso caracter por solo ocupar una*/
	int calificacion = s.nextInt();
	/*Se coloca el switch para que si el usuario ingrese la valoracion el programa busque el caso y muestre mensaje en pantalla*/
	
	switch (calificacion)
	{
	case 1: 
		System.out.println("Pesima");
	break;
	case 2:
		System.out.println("Mala");
		break;
	case 3:
		System.out.print("Regular");
	break;
	case 4:
		System.out.print("Buena");
		break;
	case 5:
		System.out.print("Excelente");
		break;
		
	}
	}
	
	
	
	
	}
