package Ordenadormum;
//import java.lang.reflect.Array;
import java.util.Scanner;
//import java.util.Arrays;
//import java.util.List;



public class Main {

	public static void main(String[] args) {
		
		recibirstring();
		String datonum2 = null;
		datonum2 = recibirstring();
		ordenar(datonum2);	
		
		
		
	}

	
	private static void ordenar(String datonum1) {
		// TODO Auto-generated method stub
		// lo voy a pasar como lista
		String separador =",";
		String dato = datonum1;
		String[] dato1 = dato.split(separador);
		
		System.out.println(dato1[0]);
		//List<String> orden = Array.asList(daton.split("\\s*,\\s*"));
	/*	for(String dato2:dato1) {
			System.out.println(dato1[0]);
			//System.out.println(dato2);
		}
		*/
		
	}

	private static String recibirstring() {
		// TODO Auto-generated method stub
		int n=0;
		
		
		Scanner datonum = new Scanner(System.in);
		System.out.println(" ingresar lista de numeros a ordenar :  ");
		String datonum1 = datonum.nextLine();
		System.out.println(" los numeros ingresados son :  "+ datonum1);
		return  datonum1;
		
		/*
		for(int i=0; i<datonum1.length(); i++) {
			
			
			
			if(datonum1.charAt(i) == ' ' || datonum1.charAt(i) == ',') {
				n = n+1;
				
			}
			else {
				
			}
			*/
		}
	//	System.out.println(" la cantidad de blancos son :  "+n);
	
	
	}



