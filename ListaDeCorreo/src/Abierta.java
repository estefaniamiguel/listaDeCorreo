
public class Abierta implements TipoDeLista {

	@Override
	public void enviarMensaje(Mensaje mensaje, ListaDeCorreo listaDeCorreo) {
		listaDeCorreo.enviarATodos(mensaje);
	}

}
