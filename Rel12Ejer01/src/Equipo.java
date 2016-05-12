import java.util.HashSet;
import java.util.Iterator;

public class Equipo {
	private String nombre;
	private HashSet<Alumno> conjuntoAlumnos;

	public Equipo(String nombre) {
		this.nombre = nombre;
		conjuntoAlumnos = new HashSet<Alumno>();
	}

	public void añadirAlumno(Alumno alumno) throws AlumnoException {
		boolean e = conjuntoAlumnos.add(alumno);
		if (!e)
			throw new AlumnoException("No se pudo introducir el alumno.");
	}

	public void borrarAlumno(Alumno alumno) throws AlumnoException {
		boolean e = conjuntoAlumnos.remove(alumno);
		if (!e)
			throw new AlumnoException("No se pudo borrar el alumno.");
	}

	public void borrarAlumnoPorDni(String dni) throws AlumnoException {
		Iterator<Alumno> it = conjuntoAlumnos.iterator();
		Alumno alumnoBuscado = new Alumno("tusmuela", dni);
		boolean e = conjuntoAlumnos.remove(alumnoBuscado);
		if (!e)
			throw new AlumnoException("No se pudo borrar el alumno.");

	}

	// Esta accion ya la realiza el "conjuntoAlumnos.contains(alumno)"
	public boolean buscarAlumno(String alumno) {
		boolean encontrado = false;

		Iterator<Alumno> it = conjuntoAlumnos.iterator();

		while (it.hasNext() && !encontrado) {
			if (it.equals(alumno)) {
				encontrado = true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre del equipo: " + nombre);
		for (Alumno alumno : conjuntoAlumnos) {
			sb.append(alumno).append("\n");
		}
		return sb.toString();
	}

	public void unirEquipo(Equipo otro) {
		Equipo equipoUnido = new Equipo("Equipo unido");
		Iterator<Alumno> it1 = this.conjuntoAlumnos.iterator();
		Iterator<Alumno> it2 = otro.conjuntoAlumnos.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

			while (it2.hasNext()) {
				Alumno alumno = (Alumno) it2.next();

			}

		}
	}
}
