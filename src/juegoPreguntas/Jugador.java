package juegoPreguntas;
public class Jugador {
	private String nombre;
	private String identificacion;

	public String getNombre() {
		return nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public Jugador(String nombre, String identificacion) {
		this.nombre = nombre;
		this.identificacion = identificacion;
	}
}
