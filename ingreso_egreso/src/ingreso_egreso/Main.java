package ingreso_egreso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Entrada();

	}

	private static void Entrada() {
		// TODO Auto-generated method stub
		System.out.println("ingresar el nombre");
		Scanner datin = new Scanner(System.in);
		
		String userName = datin.nextLine();
		System.out.println(" el nombre de usuario es : "+ userName);
		
		System.out.println("Se va a calcular el area de : ");
		System.out.println("1. Area del Circulo ..........");
		System.out.println("2. Area del cuadrado .............");
		System.out.println("3. Area del triangulo");
		
		System.out.println("ingresar numero :");
		String numing = datin.nextLine();
		int num1 = Integer.parseInt(numing);
		
		System.out.println("ingresar el valor de radio / lado :");
		String datoing = datin.nextLine();
		double num4 = Double.parseDouble(datoing);
		
		if(num1 == 1) {
			double num2 = 3.141516 * num4 * num4 ;
			System.out.println(userName + "El valor del circulo es  : " + num2);
		}else if (num1 == 2 ){
				double num2 =  num4 * num4;
				System.out.println(userName + "El valor del circulo es  : " + num2);
		} else if(num1 == 3) {
					double num2 = 0.5 * num4 * num4;
					System.out.println(userName + "El valor del circulo es  : " + num2);
				
				
			
			
		}
		
		
		
	}

}
