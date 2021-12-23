package juegoPreguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conectar_BDD {

	public Conectar_BDD(String nombre, String documento, int puntos) {

		try {
			// Conexion a la base de datos.
			Connection miConexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/juego_preguntas?useTimezone=true&serverTimezone=UTC", "root", "");

			Statement miStatement = miConexion.createStatement();

			String sentenciaSQL = "INSERT INTO jugadores (nombre,documento,puntos) VALUES ('" + nombre + "','" + documento
					+ "'," + puntos + ")";			

			miStatement.execute(sentenciaSQL);

			System.out.println("Datos insertados correctamente en la base de datos");

		} catch (Exception e) {

			System.out.println("Se estan presentando problemas en la conexion.");
			e.printStackTrace();
		}
	}

}
