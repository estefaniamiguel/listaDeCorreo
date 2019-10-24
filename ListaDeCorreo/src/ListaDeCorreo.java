import java.util.List;


public class ListaDeCorreo {
	private List<Miembro> miembros;
	private Cartero cartero;
	private TipoDeLista tipo;
	private TipoDeSuscripcion tipoDeSubscripcion;
	private Miembro administrador;
	private List<Miembro> miembrosPendientes;
	private List<Observador> observadores;
	public void enviarMensaje(Mensaje mensaje) {
		tipo.enviarMensaje(mensaje, this);
		observadores.forEach(observador -> observador.mailEnviado(mensaje, this));
	}
	
	public void agregarObservador(Observador observador) {
		observadores.add(observador);
	}

	public void enviarATodos(Mensaje mensaje) {
		miembros.forEach(miembro -> cartero.enviarMensaje(mensaje, miembro));
	}

	public boolean esMiembro(String correo) {
		return miembros.stream().anyMatch(miembro -> miembro.tengoMail(correo));
	}
	
	public void subscribir(Miembro miembro) {
		tipoDeSubscripcion.subscribir(miembro, this);
	}

	public void agregarMiembroPendiente(Miembro miembro) {
		miembrosPendientes.add(miembro);
		Mensaje mensaje = new Mensaje(administrador, "Nueva subscripcion", "Tenes un nuevo miembro para revisar");
		cartero.enviarMensaje(mensaje, administrador);
	}

	public void agregarMiembro(Miembro miembro) {
		miembros.add(miembro);
	}

	public void mensajeConMalaPalabra(Mensaje mensaje) {
		cartero.enviarMensaje(mensaje, administrador);
	}

	public void bloquear(String correo) {
		Miembro miembroABloquear = miembros.stream().filter(miembro -> miembro.tengoMail(correo)).findFirst().get();
		//aca debemos definir como se bloqueara el miembro
	}
	
	
}
