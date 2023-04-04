package conversion;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abcdario = "abcdefghijklmnñ1opqrstuvwz";
		String codi = "hola que tal";
		String [] cambio = null;
		cambio = abcdario.split("");
		String [] codigo = codi.split("");
		
	
			
		
		for (int i = 0; i< codi.length(); i++) {
			
			for(int j=0;j < abcdario.length(); j++) {
				//System.out.println(codigo[i]);
				//System.out.println(cambio[j]);
				if( Arrays.equals(codigo[i] ,cambio [j])) {
				codigo[i] = cambio[j+1]	;
				//System.out.println("son iguales ?"+codigo[i]+cambio[j]);
				
				}
				
				
				
				
			}
				 
				
			
			
		}
	 System.out.println(codigo);

	}


}
