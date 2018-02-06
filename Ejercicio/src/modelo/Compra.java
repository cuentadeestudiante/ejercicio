package modelo;

public class Compra {
	
	private static final float IVA = 1.21F;
	
	private String email;
	private String producto;
	private int unidades;
	private float total;
		
	public Compra() {}
	
	public Compra(String email, String producto, int unidades) {
		super();
		this.email = email;
		this.producto = producto;
		this.unidades = unidades;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public float getTotal() {
		
		int precio = 0;
		
		if(producto.equals("camisa")) precio = 10;
		if(producto.equals("pantalon")) precio = 15;
		if(producto.equals("calcetines")) precio = 30;
		
		return (precio * unidades) * IVA ;
		
	}
	
		

}
