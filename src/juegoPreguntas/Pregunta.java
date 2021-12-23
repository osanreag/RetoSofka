package juegoPreguntas;

public class Pregunta {

	private String pregunta;

	private String respuesta;

	private int nivel;

	public Pregunta(String pregunta, String respuesta, int nivel) {

		this.respuesta = respuesta;

		this.pregunta = pregunta;

		this.nivel = nivel;

	}

	public String getPregunta() {
		return pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public int getNivel() {
		return nivel;
	}

}
