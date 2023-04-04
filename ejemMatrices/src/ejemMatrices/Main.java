package ejemMatrices;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [3][3];
		
		for(int i =0; i<3; i++) {
			
			for(int j=0 ; j< 3; j++) {
				
				matriz[i][j] = 9;
			}
			
		}
		
			for(int i =0; i<3; i++) {
			
				for(int j=0 ; j< 3; j++) {
				
				System.out.println(matriz[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
