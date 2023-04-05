
package carrito_de_compra;
import java.util.HashMap;
import java.util.ArrayList;


	public class Producto {
	public int idProducto;
	public String Descripcion;
	public double Preciounitario;
	int item;
	String nombre;
	double preciounit;
	
	HashMap< String,Integer > datos1 = new HashMap< String,Integer >();
	HashMap<String, Double > datos2= new HashMap<String , Double >();
	
	public Producto(int item, String nombre, double preciounit) {
		this.item = item;
		this.nombre = nombre;
		this.preciounit = preciounit; 
		datos1.put("cocacola",10);
		datos1.put( "levite", 20);
		datos1.put("cerveza_patagonia",30);
		datos1.put("vino",40);
		datos2.put("cocacola", 850.0);
		datos2.put("levite", 750.0);
		datos2.put("cerveza_patagonia", 1250.0);
		datos2.put("vino", 4250.0);
		 
		if(datos2.containsKey(nombre)) {
			preciounit = datos2.getOrDefault(nombre,preciounit );
			System.out.println("el valor del precio unitario es :  "+ preciounit);
			Preciounitario = preciounit;
		}
	}
	
/*	public int getitem() {
		return item;
	}
	public void setitem(int item) {
		this.item = item;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getpreciounit() {
		return Preciounitario;
	}
	public void setpreciounit(double Preciounitario) {
		this.preciounit = Preciounitario;
		
	}	
	*/
	
	
	
}
	
	