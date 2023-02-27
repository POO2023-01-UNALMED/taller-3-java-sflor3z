package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(estado==true) {
			if(canal<120 && canal>=1) {
				this.canal++;
			}
		}
	}
	
	public void canalDown() {
		if(estado==true) {
			if(canal>1 && canal<=120) {
				this.canal--;
			}
		}
	}
	
	public void volumenUp() {
		if(estado==true) {
			if(volumen<7) {
				this.volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if(estado==true) {
			if(volumen>0) {
				this.volumen--;
			}
		}
	}
}
