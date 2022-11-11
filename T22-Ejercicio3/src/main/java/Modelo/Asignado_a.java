package Modelo;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexion.Conexion;

public class Asignado_a {
	private String cientifico_dni, proyecto_id;
	private Conexion conexion = new Conexion();
	public String getCientifico_dni() {
		return cientifico_dni;
	}
	public void setCientifico_dni(String cientifico_dni) {
		this.cientifico_dni = cientifico_dni;
	}
	public String getProyecto_id() {
		return proyecto_id;
	}
	public void setProyecto_id(String proyecto_id) {
		this.proyecto_id = proyecto_id;
	}
	
	public void create(String cientifico_dni, String proyecto_id) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.insertData("T22_3","INSERT INTO Asignado_a (cientifico_dni, proyecto_id) VALUES('"+cientifico_dni+"', '"+proyecto_id+"')");
		conexion.closeConnection();
	}
	
	public ArrayList<String> read() throws SQLException, FileNotFoundException {
		conexion.create_connection();
		ArrayList<String> text = conexion.readDataAsignadoA("T22_3","Asignado_a");
		conexion.closeConnection();
		return text;
	}
	
	public void update(String campo, String campo_cambiado, String condicion, String primaryKey, String secondPrimaryKey, String condicion2) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.updateDataAsignado("T22_3","Asignado_a",campo,campo_cambiado,condicion,primaryKey,secondPrimaryKey,condicion2);
		conexion.closeConnection();
	}
	
	public void deleteAsignadoA(String cientifico_dni, String proyecto_id, String primarykey1, String primarykey2) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.deleteDataAsignadoA("T22_3","Asignado_a", primarykey1, primarykey2, cientifico_dni, proyecto_id);
		conexion.closeConnection();
	}
	
	public void createDB() throws FileNotFoundException, SQLException {
		
		conexion.create_connection();
		conexion.createDB("T22_3");
		conexion.createTable("T22_3", "CREATE TABLE Asignado_a (cientifico_dni CHAR(8), proyecto_id CHAR(4), PRIMARY KEY (cientifico_dni, proyecto_id), FOREIGN KEY (cientifico_dni) REFERENCES Cientifico(dni) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (proyecto_id) REFERENCES Proyecto(id) ON DELETE CASCADE ON UPDATE CASCADE)");
		conexion.closeConnection();
		
	}
}
