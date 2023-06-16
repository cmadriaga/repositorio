package Ordenadormum;
import java.util.Arrays;
//import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		int n=0;
		int m=0;
		String separador =",";
		String dato = datonum1;
		// se va a crear un array dato1
		String[] dato1 = dato.split(separador);
		for(int i=0; i < datonum1.length(); i++) {
			
			
			
			if(datonum1.charAt(i) == ',') {
				n = n+1;
				m=n + 1;
			}
			
		}
		for(int i=0 ; i < m; i++) {
		
		//.............................................................................................
			
			
			String[] separatedStrings = datonum1.split(",");
		        int[] intArray = new int[m];
		        
		        for (int i1 = 0; i1 < m; i1++) {
		            
		            try {
		                intArray[i1] = Integer.parseInt(separatedStrings[i1]);
		            } catch (Exception e) {
		                System.out.println("Unable to parse string to int: " + e.getMessage());
		            }
		        }
		        
		        System.out.println(Arrays.toString(intArray));
			
		//.............................................................................................	
		
		System.out.println(" se evalua los datos :" + dato1[i]);
		
		
		}
		
		
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
		
		
		}
	
	
	}



