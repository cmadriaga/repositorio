package ejersicio_clase6;

import java.util.Scanner;

public class Clase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				float rest = 0;
				String oper;
				boolean comprobacion = false;
		do {
			
		String  numero1;
		do {
			System.out.println("\n ingresar el primer numero de la operacion : ");
			numero1 = sc.nextLine();
				}while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
		
		float nume1 = Float.parseFloat(numero1);
		float n1 = Float.parseFloat(numero1);
			do {
				System.out.println("\n Que operacion desea realizar ? (coloque solo un signo) : ");
				System.out.println("\n Teniendo en cuenta que \n + = suma \n - = resta \n x = multiplicar \n / = dividir\n ");
				oper = sc.nextLine();
				if(oper.equals("+")||oper.equals("-")|| oper.equals( "x") || oper.equals("/")) {
				comprobacion = true;	
				}else {
					comprobacion = false;
				}
				
			}while(comprobacion!=true);
			
			String numero2;
		do {
				System.out.println("\n ingresar el segundo numero de la operacion : ");
				numero2 = sc.nextLine();	
			}while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
			float nume2 = Float.parseFloat(numero2);
			float n2 = Float.parseFloat(numero2);
			System.out.println("el valor numero 2 es "+ n2+"  "+comprobacion);
			// fin de la verificacion de los datos puestos por el usuario
		
		do {
				comprobacion = true;
				switch(oper) {
					case "+":
						rest = n1 + n2;
						System.out.println("valor de rest : "+ rest);
						break;
					case "-":
						rest = n1 - n2;
						break;
					case "x" :
						rest = n1 * n2;
						break;
					case "/":
						// para evitar la division por 0 , vemos de consulta
						
						while(n2 == 0) {
							
									do {
								System.err.println("En el denominador se encuentra \n "
							+ "un cero , para evitar errores colocar otro numero.");
								numero2 = sc.nextLine();
										}while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
							//float nume2 = Float.parseFloat(numero2);
							//4float n2 = Float.parseFloat(numero2);
							
										}
						
						rest = n1 / n2;
						break;
				
				}
			}while (comprobacion != true);
			System.out.println("(" + numero1 + ") " + oper + " (" + numero2 + ")" + " = " + rest);
	        System.out.println("\n ¿Desea hacer alguna otra operación? \n");
	        System.out.println(" [s/n]");
	        do{
	            comprobacion = true;
	            oper = sc.nextLine();

	            switch (oper) {
	                case "s":
	                case "S":
	                case "n":
	                case "N":
	                    break;
	                default:
	                    System.err.println("\n Error, ponga un literal valido. \n");
	                    comprobacion = false;
	            }
	        }while(comprobacion != true);
	    }while(oper.equals("s") || oper.equals("S"));
			
		
	

	}

}
