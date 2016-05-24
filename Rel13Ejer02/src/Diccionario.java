import java.util.LinkedList;

public class Diccionario {
	private LinkedList<Palabra> diccionario;
	private String idioma;

	public Diccionario(String idioma) {
		diccionario = new LinkedList<Palabra>();
		this.idioma = idioma;
	}

	public LinkedList<Palabra> getDiccionario() {
		return diccionario;
	}

	public String getIdioma() {
		return idioma;
	}
	
	public void addPalabra(String pIdioma, String pEspannol){
		if (diccionario.contains(pIdioma)) {
			
		}
	}
}
