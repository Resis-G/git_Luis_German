package tema4;

public class LoginUsuario {

	// atributos
	private String usuario = null;
	private String clave = null;
	// constructor
	public LoginUsuario(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}
	public LoginUsuario() {
		this.usuario = "";
		this.clave = "";
	}
	// getters y setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	//  metodos
	public boolean comprobarLogin(String miusuario, String miclave)
	{
	    if(miusuario.equals(this.usuario) && miclave.equals(this.clave))
	    {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	public void mostrarDatos() {
		System.out.println("tu usuario es -> " + this.usuario);
		System.out.println("tu clave es -> " + this.clave);
	}
	
}
