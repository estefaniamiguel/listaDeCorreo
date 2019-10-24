import java.util.List;


public class ObservadorMalasPalabras implements Observador {
	private List<String> malasPalabras;

	@Override
	public void mailEnviado(Mensaje mensaje, ListaDeCorreo lista) {
		if (malasPalabras.stream().anyMatch(malaPalabra -> mensaje.getTexto().contains(malaPalabra))) {
			lista.mensajeConMalaPalabra(mensaje);
		}
	}
}
