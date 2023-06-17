package Ordenadormum;
import java.util.Arrays;
//import java.lang.reflect.Array;
import java.util.Scanner;

//import java.util.List;



public class Main {

	public static void main(String[] args) {
		// este metodo busca traer un string leido del teclado
		recibirstring();
		String datonum2 = null;
		// en este se vuelve a traer el string pero se le asigna a un retorno
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
		        
		       
			
		//.............................................................................................	
		        
		// arreglar de menor a mayor los numeros
		//.......................................................
		 
		        for(int i2 = 0; i2 < intArray.length ; i2++){
		        	int[] intArray1 = new int[m];
		        	intArray1 = intArray;
		           int  menor = intArray1[0];

		            if (intArray1[i2] < menor){
		                menor = intArray1[i2];
		            }
		            else{
		                if (intArray1[i2] > menor){
		                 menor = menor;
		                }      
		            }
		        }
		        
		        
		//.......................................................
		        
		  //       System.out.println(Arrays.toString(intArray));
		
		// System.out.println(" se evalua  datos :" + dato1[i]);
		
		
		
		}
		
		
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



