
public class TipoSubscripcionCerrada implements TipoDeSuscripcion {

	@Override
	public void subscribir(Miembro miembro, ListaDeCorreo listaDeCorreo) {
		listaDeCorreo.agregarMiembroPendiente(miembro);
	}

}
