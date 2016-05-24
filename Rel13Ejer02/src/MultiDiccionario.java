import java.util.HashMap;

public class MultiDiccionario {
	HashMap<String, Diccionario> multi;

	public MultiDiccionario() {
		multi = new HashMap<String, Diccionario>();
	}

	public void crearNuevoIdioma(String idioma) throws DiccionarioException {
		if (!multi.containsKey(idioma))
			multi.put(idioma, new Diccionario(idioma));
		else
			throw new DiccionarioException("Diccionario ya existente");
	}
	

}
