package juegoPreguntas;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.jfr.events.FileWriteEvent;

import java.io.FileWriter;
import java.io.IOException;

public class Juego {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		//------------------Guardar en archivo txt------------------------
		String ruta1 = "C:/Users/Oscar Regino/Desktop/fichero/datos.txt";		
		FileWriter fichero1 = new FileWriter(ruta1,true);
		//----------------------------------------------------------------

		Preguntas preguntas = new Preguntas();
		System.out.println("#-----------------------Quieres ser millornario ------------------------------#");		
		System.out.println("#---------------------------------------------- ------------------------------#");		
		String nombre = "";
		String identificacion="";
		System.out.println("Ingrese el nombre completo del jugador: ");
		nombre=sc.nextLine();
		System.out.println("Ingrese la identificacion del jugador: ");
		identificacion=sc.nextLine();
		Jugador jugador = new Jugador(nombre, identificacion); 
		
		int puntos = preguntas.iniciarJuego();
		
		String info = "El jugador "+ jugador.getNombre() + " con identificacion "+ jugador.getIdentificacion() + " obtuvo un puntaje de " + puntos + "\n";
		//System.out.println(info);
		
		Conectar_BDD almacenar = new Conectar_BDD(jugador.getNombre(),jugador.getIdentificacion(),puntos);
		
		fichero1.append(info);	
		fichero1.close();
	

	}
	
}
