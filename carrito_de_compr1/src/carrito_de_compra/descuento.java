package carrito_de_compra;

public class descuento {
	boolean dat = false;
	
	public descuento(String nombre , Integer idem, boolean dat) {
		if(nombre == "vino") {
			dat = true;
		}
	}

}
