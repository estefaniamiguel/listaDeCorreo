import java.util.HashMap;


public class ObservadorSpammer implements Observador {
	
	HashMap<String, Integer> ranking;

	@Override
	public void mailEnviado(Mensaje mensaje, ListaDeCorreo lista) {
		Integer cantidad = ranking.get(mensaje.getCorreo());
		if (cantidad == null) {
			ranking.put(mensaje.getCorreo(), 1);
		} else {
			cantidad += 1;
			
			if (cantidad > 5) {
				lista.bloquear(mensaje.getCorreo());
			}
		}
		
	}
	
}
