package carrito_de_compra;
import java.util.ArrayList;

public class item_carrito {
	public int ideitem_carrito;
	public double  item_total;
	public double  cantidad;
	public item_carrito(int item_carrito, double item_total, double cantidad) {
	
		Producto pro = new Producto(1, "vino", 1);
		System.out.println("se va a escribir desde elproducto  "+pro.item );
		System.out.println("se va a escribir desde elproducto  "+pro.nombre );
		System.out.println("se va a escribir desde elproducto  "+pro.Preciounitario );
		
		//agregar al carrito
		ArrayList<String> persona1 = new ArrayList<String>();
		ArrayList<Integer> persona1cant = new ArrayList<Integer>();
		persona1.add("vino");
		persona1cant.add ( 4 );
		persona1.add("cocacola");
		persona1cant.add ( 2 );
		
		
		System.out.println("meracadera de persona1 : "+persona1);
		System.out.println("la cantidad de items son : "+ persona1.size());
		System.out.println(" como se llama mercaderia 1 : " + persona1.get(0));
		
	}

}
