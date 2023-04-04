package funciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hola();
		
		int numero1 = 23;
		int numero2 = 32;
		
		//val = valordevuelto();
		//System.out.println(" el valor de val es : "+ val);
		
		int val = sumanumeros(numero1,numero2);
		System.out.println(" valor de la suma es : " + val);
		
	}
	
	public static void Hola() {
		System.out.println(" imprimir solamente ");
	}
	
	public static int valordevuelto() {
		return 5;
	}
	
	public static int sumanumeros(int a , int b) {
		
		return a + b;
	}

}
