package retorno_valor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Transporte t = new Transporte(500);
			int valor = 0;
			valor = t.precio();
			System.out.println("retorno de mi valor es " + valor);
	}

}
