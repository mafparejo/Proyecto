package g;

public class Persona implements Metodos{

	private String nombre;
	private String apellido;
	private String dire;
	
	public String getFrase(String n) {
		return n;
	}
	
	public int getNumero(int n) {
		return n;
	}
	
	public String getNombre() {
		return "Miguel Angel";
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDire() {
		return dire;
	}
	public void setDire(String dire) {
		this.dire = dire;
	}

	public String recuperar() {
		return "recupero string "+numero();
	}

	public int numero() {
		// TODO Auto-generated method stub
		return 12;
	}
	
}
