package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;


import Modelo.Asignado_a;
import Vista.Vista;

public class ControladorAsignadoA implements ActionListener {
	private Asignado_a asignadoA;
	private Vista vista;
	
	public ControladorAsignadoA(Asignado_a asignadoA, Vista vista) {
		this.asignadoA=asignadoA;
		this.vista=vista;
		this.vista.boton_create_asignado_a.addActionListener(this);
		this.vista.boton_delete_asignado_a.addActionListener(this);
		this.vista.boton_read_asignado_a.addActionListener(this);
		this.vista.boton_update_asignado_a.addActionListener(this);
		this.vista.boton_borrar_asignado_a.addActionListener(this);
		this.vista.boton_salir_asignado_a.addActionListener(this);
		this.vista.boton_guardar_asignado_a.addActionListener(this);
		this.vista.boton_guardar1_asignado_a.addActionListener(this);
		this.vista.cientificoButton.addActionListener(this);
		this.vista.proyectoButton.addActionListener(this);
		this.vista.asignadoAButton.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent evento) {
		if (vista.asignadoAButton == evento.getSource()) {
			vista.vista_cientifico.setVisible(false);
			vista.vista_proyecto.setVisible(false);
			vista.vista_asignado_a.setVisible(true);

			vista.cientificoButton.setVisible(false);
			vista.proyectoButton.setVisible(false);
			vista.asignadoAButton.setVisible(false);
			
			vista.boton_create_asignado_a.setVisible(true);
			vista.boton_update_asignado_a.setVisible(true);
			vista.boton_read_asignado_a.setVisible(true);
			vista.boton_delete_asignado_a.setVisible(true);
		}
		
		if(vista.boton_create_asignado_a == evento.getSource()) {
			try {
				vista.vista_create_asignado_a.setVisible(true);
				vista.vista_delete_asignado_a.setVisible(false);
				vista.vista_update_asignado_a.setVisible(false);
				vista.vista_read_asignado_a.setVisible(false);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.boton_delete_asignado_a == evento.getSource()) {
			try {
				vista.vista_create_asignado_a.setVisible(false);
				vista.vista_delete_asignado_a.setVisible(true);
				vista.vista_update_asignado_a.setVisible(false);
				vista.vista_read_asignado_a.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_update_asignado_a == evento.getSource()) {
			try {
				vista.vista_create_asignado_a.setVisible(false);
				vista.vista_delete_asignado_a.setVisible(false);
				vista.vista_update_asignado_a.setVisible(true);
				vista.vista_read_asignado_a.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_read_asignado_a == evento.getSource()) {
			try {
				vista.textAreaAsignadoA.setText(null);
				
				vista.vista_create_asignado_a.setVisible(false);
				vista.vista_delete_asignado_a.setVisible(false);
				vista.vista_update_asignado_a.setVisible(false);
				vista.vista_read_asignado_a.setVisible(true);
				ArrayList<String> text = this.asignadoA.read();
				for (int i = 0; i < text.size(); i++) {
					vista.textAreaAsignadoA.append(text.get(i)+"\n");
				}
				
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_salir_create_asignado == evento.getSource()) {
			vista.vista_create_asignado_a.setVisible(false);
			vista.vista_asignado_a.setVisible(true);
		}
		
		if(vista.boton_salir_update_asignado == evento.getSource()) {
			vista.vista_update_asignado_a.setVisible(false);
			vista.vista_asignado_a.setVisible(true);
		}
		
		if(vista.boton_salir_delete_asignado == evento.getSource()) {
			vista.vista_delete_asignado_a.setVisible(false);
			vista.vista_asignado_a.setVisible(true);
		}
		
		if(vista.boton_salir_asignado_a == evento.getSource()) {
			vista.vista_read_asignado_a.setVisible(false);
			vista.vista_asignado_a.setVisible(true);
		}
		
		if(vista.boton_guardar_asignado_a == evento.getSource()) {
			String cientifico_id,proyecto_id;
			
			proyecto_id=this.vista.createProyectoIdField.getText();
			cientifico_id=this.vista.createCientificoDniField.getText();
			try {
				this.asignadoA.create(cientifico_id, proyecto_id);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_create_asignado_a.setVisible(false);
		}
		
		if(vista.boton_guardar1_asignado_a == evento.getSource()) {
			
			String cientifico_id,proyecto_id,cientifico_id_antiguo,proyecto_id_antiguo;
			
			
			cientifico_id=this.vista.editCientificoDniField.getText();
			proyecto_id=this.vista.editProyectoIdField.getText();
			
			cientifico_id_antiguo=this.vista.dni_cientifico_antiguo.getText();
			proyecto_id_antiguo=this.vista.id_proyecto_antiguo.getText();
			
			try {
				this.asignadoA.update("cientifico_dni",cientifico_id,cientifico_id_antiguo,"cientifico_dni","proyecto_id",proyecto_id_antiguo);
				this.asignadoA.update("proyecto_id",proyecto_id,cientifico_id_antiguo,"cientifico_dni","proyecto_id",proyecto_id_antiguo);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.vista.vista_update_asignado_a.setVisible(false);
		}
		
		if(vista.boton_borrar_asignado_a == evento.getSource()) {
			
			String cientifico_id,proyecto_id;
		
			cientifico_id=this.vista.deleteCientificoDniField.getText();
			proyecto_id=this.vista.deleteProyectoIdField.getText();
			try {
				this.asignadoA.deleteAsignadoA("cientifico_dni", "proyecto_id", cientifico_id, proyecto_id);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_delete_asignado_a.setVisible(false);
		}
	}
}