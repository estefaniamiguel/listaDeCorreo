
public class Mensaje {
	Miembro usuario;
	String titulo;
	String texto;
	public Mensaje(Miembro usuario, String titulo, String texto) {
		this.usuario = usuario;
		this.titulo = titulo;
		this.texto = texto;
	}
	public String getCorreo() {
		return usuario.getCorreoPrincipal();
	}
	
	public String getTexto() {
		return texto;
	}
	
	public String getTelefono() {
		return usuario.getTelefono();
	}
}
