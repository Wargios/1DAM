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
	
	public void addPalabra(String pIdioma, String pEspannol) throws DiccionarioException{
		Palabra nPalabra = new Palabra(pIdioma, pEspannol);
		if (diccionario.contains(nPalabra)) 
			throw new DiccionarioException("Ya se encuentra la palabra");
		diccionario.add(encontrarSuSitio(), nPalabra);
	}

	private int encontrarSuSitio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
