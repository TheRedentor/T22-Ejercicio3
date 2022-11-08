package mainApp;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import Modelo.Asignado_a;
import Modelo.Cientifico;
import Modelo.Proyecto;
import Vista.Vista;

public class mainApp {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Cientifico cientifico = new Cientifico();
    	cientifico.createDB();
    	
    	Proyecto proyecto = new Proyecto();
    	proyecto.createDB();
    	
    	Asignado_a asignado_a = new Asignado_a();
    	asignado_a.createDB();
    	
    	Vista vista = new Vista();
    	vista.setVisible(true);
	}

}