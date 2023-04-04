package retorno_valor;

public class Transporte {

	int precio = 0;
	
	public Transporte(int precio) {
		System.out.println("se creo un objeto del tipo transporte " + precio );
		this.precio = precio;
	}
	
	public int precio() {
		return precio / 20;
	}
	
}
