import java.util.List;


public class Miembro {
	String mailPredeterminado;
	List<String> mailsAlternativos;
	String telefono;
	public boolean tengoMail(String correo) {
		return mailsAlternativos.stream().anyMatch(mail -> mail.equals(correo));
	}
	public String getCorreoPrincipal() {
		return mailPredeterminado;
	}
	public String getTelefono() {
		return telefono;
	}
}
