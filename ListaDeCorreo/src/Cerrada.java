
public class Cerrada implements TipoDeLista {

	@Override
	public void enviarMensaje(Mensaje mensaje, ListaDeCorreo listaDeCorreo) {
		if (listaDeCorreo.esMiembro(mensaje.getCorreo())) {
			listaDeCorreo.enviarATodos(mensaje);
		} else {
			throw new NoPerteneceALaLista("El mail ingresado no pertenece a la lista");
		}
	}

}
