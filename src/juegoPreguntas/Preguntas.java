package juegoPreguntas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Oscar_Regino
 *
 */
public class Preguntas {
	ArrayList<Pregunta> nivel1 = new ArrayList<Pregunta>();
	ArrayList<Pregunta> nivel2 = new ArrayList<Pregunta>();
	ArrayList<Pregunta> nivel3 = new ArrayList<Pregunta>();
	ArrayList<Pregunta> nivel4 = new ArrayList<Pregunta>();
	ArrayList<Pregunta> nivel5 = new ArrayList<Pregunta>();
	ArrayList<ArrayList> listaPreguntas = new ArrayList<ArrayList>();
	Scanner sc = new Scanner(System.in);
	Pregunta pregunta = null;

	public ArrayList EscribirPreguntas() {

		

		/*
		 * A traves de estos blucles se almacenan las preguntas y las respuestas correctas. 
		 * for (int b = 1; b <= 5; b++) {
		 * 
		 * for (int i = 1; i <= 5; i++) { System.out.println("Escriba la pregunta " + i
		 * + " del nivel " + b); String pregunta = sc.nextLine();
		 * System.out.println("Escriba la respuesta " + i + " del nivel " + b); String
		 * respuesta = sc.nextLine();
		 * 
		 * if (b == 1) { nivel1.add(new Pregunta(pregunta, respuesta,b)); } else if (b
		 * == 2) { nivel2.add(new Pregunta(pregunta, respuesta,b)); } else if (b == 3) {
		 * nivel3.add(new Pregunta(pregunta, respuesta,b)); } else if (b == 4) {
		 * nivel4.add(new Pregunta(pregunta, respuesta,b)); } else if (b == 5) {
		 * nivel5.add(new Pregunta(pregunta, respuesta,b)); } } }
		 * listaPreguntas.add(nivel1);
		   listaPreguntas.add(nivel2);
		   listaPreguntas.add(nivel3);
		   listaPreguntas.add(nivel4);
		   listaPreguntas.add(nivel5);
		   return listaPreguntas;
		 */

		// ---------------------------------------------------------------------------------

		nivel1.add(new Pregunta("¿De que color es la sangre?", "Rojo", 1));
		nivel1.add(new Pregunta("¿De que color es picolo?", "Verde", 1));
		nivel1.add(new Pregunta("¿Cuantos jugadores hay en un partido de futbol?", "22", 1));
		nivel1.add(new Pregunta("¿Cual es el rio mas grande del mundo?", "Amazonas", 1));
		nivel1.add(new Pregunta("¿cuantos dias tiene un año bisiesto?", "366", 1));

		nivel2.add(new Pregunta("¿Cual es el organo mas grande del cuerpo humano?", "La piel", 2));
		nivel2.add(new Pregunta("¿Cual es el hueso mas largo del cuerpo humano?", "fémur", 2));
		nivel2.add(new Pregunta("¿Que elemento representa la letra K en la tabla periodica?", "Potasio", 2));
		nivel2.add(new Pregunta("¿Cual es el primer elemento de la tabla periodica?", "Hidrogeno", 2));
		nivel2.add(new Pregunta("¿Cuantos jugadores hay jugando en un equipo de beisbol?", "9", 2));

		nivel3.add(new Pregunta("¿Cual es el porcentaje de agua del que esta compuesto el cuerpo humano?", "60", 3));
		nivel3.add(new Pregunta("¿En que año murio cristobal colon?", "1506", 3));
		nivel3.add(new Pregunta("¿Cuantas son las esferas del dragon?", "7", 3));
		nivel3.add(new Pregunta("¿Cuantos ojos tiene yamcha en dragon ball?", "2", 3));
		nivel3.add(new Pregunta("¿Cuantos numeros primos hay del 1 al 100?", "25", 3));

		nivel4.add(new Pregunta("¿Que transporta los globulos rojos?", "Oxigeno", 4));
		nivel4.add(new Pregunta("¿Cual es el elemento mas abundante en la tierra?", "Agua", 4));
		nivel4.add(new Pregunta("¿Cual es el planeta mas cerca del sol?", "Mercurio", 4));
		nivel4.add(new Pregunta("Cuando yo tenia 6 años mi hermano tenia la mitad, hoy tengo 40 ¿cuantos años tiene mi hermano?", "37", 4));
		nivel4.add(new Pregunta("¿cual de estas bases nitrogenadas no componen el arn?", "Timina ", 4));

		nivel5.add(new Pregunta("¿Cuantas lunas tiene Jupiter?", "79", 5));
		nivel5.add(new Pregunta("¿En que año comenzo la revolucion francesa?", "1789", 5));
		nivel5.add(new Pregunta("¿En que año termino la segunda guerra mundial?", "1945", 5));
		nivel5.add(new Pregunta("¿Cual es el nombre del olor que se produce al caer la lluvia en los suelos secos?", "Petricor", 5));
		nivel5.add(new Pregunta("¿Que celulas son las responsable que veamos de color?", "Conos", 5));

		listaPreguntas.add(nivel1);
		listaPreguntas.add(nivel2);
		listaPreguntas.add(nivel3);
		listaPreguntas.add(nivel4);
		listaPreguntas.add(nivel5);
		return listaPreguntas;

	}

	public Pregunta EscogerPregunta(int nivel) {

		Pregunta pregunta = new Pregunta(null, null, 0);
		int num = (int) (Math.random() * 5);

		if (nivel == 1) {
			ArrayList<Pregunta> nivel_1 = listaPreguntas.get(0);
			pregunta = nivel_1.get(num);
		} else if (nivel == 2) {
			ArrayList<Pregunta> nivel_2 = listaPreguntas.get(1);
			pregunta = nivel_2.get(num);
		} else if (nivel == 3) {
			ArrayList<Pregunta> nivel_3 = listaPreguntas.get(2);
			pregunta = nivel_3.get(num);
		} else if (nivel == 4) {
			ArrayList<Pregunta> nivel_4 = listaPreguntas.get(3);
			pregunta = nivel_4.get(num);
		} else if (nivel == 5) {
			ArrayList<Pregunta> nivel_5 = listaPreguntas.get(4);
			pregunta = nivel_5.get(num);
		}
		return pregunta;
	}

	public String RespuestasIncorrectas(int nivel) {
		String preguntaYRespuestas = "";
		Pregunta preguntaNivel = null;
		ArrayList preguntasTodas= EscribirPreguntas();

		if (nivel == 1) {
			preguntaNivel = EscogerPregunta(1);
		} else if (nivel == 2) {
			preguntaNivel = EscogerPregunta(2);
		} else if (nivel == 3) {
			preguntaNivel = EscogerPregunta(3);
		} else if (nivel == 4) {
			preguntaNivel = EscogerPregunta(4);
		} else if (nivel == 5) {
			preguntaNivel = EscogerPregunta(5);
		} else {
			System.out.println("El valor ingresado supera el nivel");
		}

		/*
		 * System.out.println(preguntaNivel.pregunta);
		 * System.out.println("Escriba una opcion incorrecta"); String opcion1 =
		 * sc.nextLine(); System.out.println("Escriba una opcion incorrecta"); String
		 * opcion2 = sc.nextLine(); System.out.println("Escriba una opcion incorrecta");
		 * String opcion3 = sc.nextLine();
		 * 
		 * preguntaYRespuestas = preguntaNivel.pregunta + "\n" + "a) " + preguntaNivel.respuesta + "\n" + "b) " + opcion1
				+ "\n" + "c) " + opcion2 + "\n" + "d) " + opcion3;

		   return preguntaYRespuestas;
		 */
		String opcion1 = "";
		String opcion2 = "";
		String opcion3 = "";

		switch (preguntaNivel.getNivel()) {

		case 1:
			ArrayList<Pregunta> nivel1 = listaPreguntas.get(0);		
			if(preguntaNivel==nivel1.get(0)) {
				opcion1 = "Amarillo"; opcion2 = "Rosa";	opcion3 = "Lila";
			}else if(preguntaNivel==nivel1.get(1)) {
				opcion1 = "Negro"; opcion2 = "Azul";	opcion3 = "Rojo";
			}else if(preguntaNivel==nivel1.get(2)) {
				opcion1 = "11"; opcion2 = "18";	opcion3 = "24";
			}else if(preguntaNivel==nivel1.get(3)) {
				opcion1 = "Nilo"; opcion2 = "Cauca";	opcion3 = "San jorge";
			}else if(preguntaNivel==nivel1.get(4)) {
				opcion1 = "365"; opcion2 = "364";	opcion3 = "367";
			}
			
			preguntaYRespuestas = "Pregunta #1 "+preguntaNivel.getPregunta() + "\n" + "a) " + preguntaNivel.getRespuesta() + "\n" + "b) "
					+ opcion1 + "\n" + "c) " + opcion2 + "\n" + "d) " + opcion3;
			break;

		case 2:
			ArrayList<Pregunta> nivel2 = listaPreguntas.get(1);		
			if(preguntaNivel==nivel2.get(0)) {
				opcion1 = "Higado"; opcion2 = "Corazon";	opcion3 = "Ojo";
			}else if(preguntaNivel==nivel2.get(1)) {
				opcion1 = "Tibia"; opcion2 = "Perone";	opcion3 = "Martillo";
			}else if(preguntaNivel==nivel2.get(2)) {
				opcion1 = "Sodio"; opcion2 = "Fosforo";	opcion3 = "Hidrogeno";
			}else if(preguntaNivel==nivel2.get(3)) {
				opcion1 = "Sodio"; opcion2 = "Fosforo";	opcion3 = "Oxigeno";
			}else if(preguntaNivel==nivel2.get(4)) {
				opcion1 = "7"; opcion2 = "10";	opcion3 = "8";
			}
			preguntaYRespuestas = "Pregunta #2 "+preguntaNivel.getPregunta() + "\n" + "a) " + opcion1 + "\n" + "b) "
					+ preguntaNivel.getRespuesta() + "\n" + "c) " + opcion2 + "\n" + "d) " + opcion3;
			break;

		case 3:
			ArrayList<Pregunta> nivel3 = listaPreguntas.get(2);		
			if(preguntaNivel==nivel3.get(0)) {
				opcion1 = "70"; opcion2 = "80";	opcion3 = "90";
			}else if(preguntaNivel==nivel3.get(1)) {
				opcion1 = "1560"; opcion2 = "1995";	opcion3 = "1493";
			}else if(preguntaNivel==nivel3.get(2)) {
				opcion1 = "9"; opcion2 = "8";	opcion3 = "6";
			}else if(preguntaNivel==nivel3.get(3)) {
				opcion1 = "1"; opcion2 = "3";	opcion3 = "4";
			}else if(preguntaNivel==nivel3.get(4)) {
				opcion1 = "50"; opcion2 = "27";	opcion3 = "30";
			}


			preguntaYRespuestas ="Pregunta #3 "+ preguntaNivel.getPregunta() + "\n" + "a) " + opcion2 + "\n" + "b) " + opcion1 + "\n"
					+ "c) " + preguntaNivel.getRespuesta() + "\n" + "d) " + opcion3;
			break;

		case 4:
			ArrayList<Pregunta> nivel4 = listaPreguntas.get(3);		
			if(preguntaNivel==nivel4.get(0)) {
				opcion1 = "Hidrogeno"; opcion2 = "Helio";	opcion3 = "Agua";
			}else if(preguntaNivel==nivel4.get(1)) {
				opcion1 = "Aire"; opcion2 = "Tierra";	opcion3 = "Fuego";
			}else if(preguntaNivel==nivel4.get(2)) {
				opcion1 = "Venus"; opcion2 = "Tierra";	opcion3 = "Jupiter";
			}else if(preguntaNivel==nivel4.get(3)) {
				opcion1 = "20"; opcion2 = "6";	opcion3 = "30";
			}else if(preguntaNivel==nivel4.get(4)) {
				opcion1 = "Adenina "; opcion2 = "Citosina ";	opcion3 = "Guanina ";
			}

			preguntaYRespuestas ="Pregunta #4 "+ preguntaNivel.getPregunta() + "\n" + "a) " + opcion3 + "\n" + "b) "
					+ opcion1 + "\n" + "c) " + opcion2 + "\n" + "d) " + preguntaNivel.getRespuesta() ;
			break;

		case 5:
			ArrayList<Pregunta> nivel5 = listaPreguntas.get(4);		
			if(preguntaNivel==nivel5.get(0)) {
				opcion1 = "1"; opcion2 = "2";	opcion3 = "3";
			}else if(preguntaNivel==nivel5.get(1)) {
				opcion1 = "1798"; opcion2 = "1700";	opcion3 = "1800";
			}else if(preguntaNivel==nivel5.get(2)) {
				opcion1 = "1954"; opcion2 = "1950";	opcion3 = "1990";
			}else if(preguntaNivel==nivel5.get(3)) {
				opcion1 = "Giste"; opcion2 = "Vagido";	opcion3 = "Fosfeno";
			}else if(preguntaNivel==nivel5.get(4)) {
				opcion1 = "Celulas madre"; opcion2 = "Plastos";	opcion3 = "Eosinófilos";
			}
			preguntaYRespuestas = "Pregunta #5 "+preguntaNivel.getPregunta() + "\n" + "a) " + preguntaNivel.getRespuesta() + "\n" + "b) "
					+ opcion1 + "\n" + "c) " + opcion2 + "\n" + "d) " + opcion3;
			break;
		}

		return preguntaYRespuestas;
	}

	public String hacerPregunta(int nivel) {
		EscribirPreguntas();
		String preguntaN = "";
		if (nivel == 1) {
			preguntaN = RespuestasIncorrectas(1);
		} else if (nivel == 2) {
			preguntaN = RespuestasIncorrectas(2);
		} else if (nivel == 3) {
			preguntaN = RespuestasIncorrectas(3);
		} else if (nivel == 4) {
			preguntaN = RespuestasIncorrectas(4);
		} else if (nivel == 5) {
			preguntaN = RespuestasIncorrectas(5);
		}

		return preguntaN;
	}

	public int iniciarJuego() {
		String seleccion = "";
		int puntaje = 0;
		int contador = 1;

		while (contador <= 5) {

			System.out.println(hacerPregunta(contador));
			seleccion = sc.nextLine();
			String resp [] = {"a","b","c","d","a"};
			if (seleccion.equals(resp[contador-1])){
				puntaje += 10 * 2;
				System.out.println("Quieres seguir jugando, escriba 'y' para si y 'n' para no");
				seleccion = sc.nextLine();
				if (seleccion.equalsIgnoreCase("y")) {
					System.out.println("Tu puntaje es: " + puntaje);
				} else if (seleccion.equalsIgnoreCase("n")) {
					System.out.println("Te has retirado, el total de puntos ganados es : " + puntaje);
					break;
				} else {
					System.out.println("Letra ingresada incorrecta, te damos la oportunidad de seguir jugando.");
				}
			} else {
				System.out.println("El juego finalizó, has perdido");
				puntaje = 0;
				break;
			}
			contador++;
		}
		if(puntaje == 5) {
			System.out.println("Felicidades, Contestaste todas las preguntas de forma correcta!!!!!! ");
		}
		return puntaje;
	}

}
