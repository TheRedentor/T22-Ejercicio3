package mainApp;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import Controlador.ControladorCientifico;
import Controlador.ControladorProyecto;
import Controlador.ControladorAsignadoA;
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
    	
    	ControladorCientifico controlador_cientifico = new ControladorCientifico(cientifico, vista);
    	ControladorProyecto controlador_proyecto = new ControladorProyecto(proyecto, vista);
    	ControladorAsignadoA controlador_asignado_a = new ControladorAsignadoA(asignado_a, vista);
	}

}
