
public class Palabra implements Comparable<Palabra>{
	private String palabraIdioma;
	private String palabraEspannol;

	public Palabra(String pIdioma,String pEspannol) {
		setPalabraEspannol(pEspannol);
		setPalabraIdioma(pIdioma);
	}

	public void setPalabraEspannol(String palabraEspannol) {
		this.palabraEspannol = palabraEspannol;
	}

	public void setPalabraIdioma(String palabraIdioma) {
		this.palabraIdioma = palabraIdioma;
	}

	public String getPalabraEspannol() {
		return palabraEspannol;
	}

	public String getPalabraIdioma() {
		return palabraIdioma;
	}

	@Override
	public int compareTo(Palabra o) {
		this.palabraIdioma.compareTo(o.palabraIdioma);
		return 0;
	}

}
