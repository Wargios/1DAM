
public class Pagina {
	private Fecha fecha;
	private Hora hora;
	private String paginaWeb;

	public Pagina(String pagWeb, Fecha fecha, Hora hora) {
		this.fecha = fecha;
		paginaWeb = pagWeb;
		this.hora = hora;
	}
	

	public Fecha getFecha() {
		return fecha;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}
	
	public Hora getHora() {
		return hora;
	}
}
