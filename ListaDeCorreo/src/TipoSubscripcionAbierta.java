
public class TipoSubscripcionAbierta implements TipoDeSuscripcion {

	@Override
	public void subscribir(Miembro miembro, ListaDeCorreo listaDeCorreo) {
		listaDeCorreo.agregarMiembro(miembro);
	}

}
