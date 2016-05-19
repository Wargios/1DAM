import java.util.HashMap;

public class Club {
	private HashMap<String, Socio> Socios;
	
	public Club() {
		Socios = new HashMap<String, Socio>();
	}
	
	public HashMap<String, Socio> getSocios() {
		return Socios;
	}
	
	/**
	 * 
	 * @param nuevo
	 * @return Devuelve true si lo consigue introducir
	 */
	public boolean altaSocio (Socio nuevo){
		boolean resul = Socios.containsKey(nuevo.getDni());
		if (!resul) {
			Socios.put(nuevo.getDni(), nuevo);
		}
		return !resul;
	}
	
	/**
	 * 
	 * @param dni
	 * @return Devuelve true si lo consigue borrar
	 */
	public boolean bajaSocio (String dni){
		boolean resul = Socios.containsKey(dni);
		if (resul) {
			Socios.remove(dni);
		}
		return resul;
	}
	
	public boolean modificarSocio (String dni, String nombre, int telefono){
		boolean resul = Socios.containsKey(dni);
		Socio nuevoSocio = new Socio(dni, nombre, telefono);
		if (resul) {
			Socios.put(dni, nuevoSocio);
		}
		return resul;
	}
	
	public String consultarSocio (String dni){
		boolean resul = Socios.containsKey(dni);
		String texto;
		if (resul) {
			texto = Socios.get(dni).toString();
		}else
			texto = "Socio no encontrado";
		return texto;
	}
	
	
}
