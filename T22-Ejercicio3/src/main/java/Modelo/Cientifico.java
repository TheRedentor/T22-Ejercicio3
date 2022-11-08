package Modelo;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexion.Conexion;

public class Cientifico {
	private String dni, nom_apels;
	private Conexion conexion = new Conexion();

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom_apels() {
		return nom_apels;
	}

	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}
	
	public void create(String dni, String nom_apels) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.insertData("T22_3","INSERT INTO Cientifico (dni, nom_apels) VALUES('"+dni+"', '"+nom_apels+"')");
		conexion.closeConnection();
	}
	
	public ArrayList<String> read() throws SQLException, FileNotFoundException {
		conexion.create_connection();
		ArrayList<String> text = conexion.readDataCientifico("T22_3","Cientifico");
		conexion.closeConnection();
		return text;
	}
	
	public void update(String campo, String campo_cambiado, String condicion) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.updateData("T22_3","Cientifico",campo,campo_cambiado,condicion);
		conexion.closeConnection();
	}
	
	public void delete(String dni, String primarykey) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.deleteData("T22_3","Cientifico", primarykey, Integer.parseInt(dni));
		conexion.closeConnection();
	}
	
	public void createDB() throws FileNotFoundException, SQLException {
		
		conexion.create_connection();
		conexion.createDB("T22_3");
		conexion.createTable("T22_3", "CREATE TABLE Cientifico (dni CHAR(8) PRIMARY KEY, nom_apels CHAR(255))");
		conexion.closeConnection();

	}
}
