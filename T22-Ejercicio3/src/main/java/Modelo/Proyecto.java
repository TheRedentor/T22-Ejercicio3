package Modelo;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexion.Conexion;

public class Proyecto {
	private String id, nombre;
	private int horas;
	private Conexion conexion = new Conexion();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public void create(String id, String nombre, int horas) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.insertData("T22_3","INSERT INTO Proyecto (id, nombre, horas) VALUES('"+id+"', '"+nombre+"', '"+horas+"')");
		conexion.closeConnection();
	}
	
	public ArrayList<String> read() throws SQLException, FileNotFoundException {
		conexion.create_connection();
		ArrayList<String> text = conexion.readDataProyecto("T22_3","Proyecto");
		conexion.closeConnection();
		return text;
	}
	
	public void update(String campo, String campo_cambiado, String condicion) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.updateData("T22_3","Proyecto",campo,campo_cambiado,condicion);
		conexion.closeConnection();
	}
	
	public void delete(String id, String primarykey) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.deleteData("T22_3","Proyecto", primarykey, Integer.parseInt(id));
		conexion.closeConnection();
	}
	
	public void createDB() throws FileNotFoundException, SQLException {
		
		conexion.create_connection();
		conexion.createDB("T22_3");
		conexion.createTable("T22_3", "CREATE TABLE Proyecto (id CHAR(4) PRIMARY KEY, nombre CHAR(255), horas INT)");
		conexion.closeConnection();

	}
}
