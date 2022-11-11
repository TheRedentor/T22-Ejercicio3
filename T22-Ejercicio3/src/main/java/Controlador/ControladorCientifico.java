package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;


import Modelo.Cientifico;
import Vista.Vista;

public class ControladorCientifico implements ActionListener {
	private Cientifico cientifico;
	private Vista vista;
	
	public ControladorCientifico(Cientifico cientifico, Vista vista) {
		this.cientifico=cientifico;
		this.vista=vista;
		this.vista.boton_create_cientifico.addActionListener(this);
		this.vista.boton_delete_cientifico.addActionListener(this);
		this.vista.boton_read_cientifico.addActionListener(this);
		this.vista.boton_update_cientifico.addActionListener(this);
		this.vista.boton_borrar_cientifico.addActionListener(this);
		this.vista.boton_salir_cientifico.addActionListener(this);
		this.vista.boton_guardar_cientifico.addActionListener(this);
		this.vista.boton_guardar1_cientifico.addActionListener(this);
		this.vista.cientificoButton.addActionListener(this);
		this.vista.proyectoButton.addActionListener(this);
		this.vista.asignadoAButton.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent evento) {
		if (vista.cientificoButton == evento.getSource()) {
			vista.vista_cientifico.setVisible(true);
			vista.vista_proyecto.setVisible(false);
			vista.vista_asignado_a.setVisible(false);

			vista.cientificoButton.setVisible(false);
			vista.proyectoButton.setVisible(false);
			vista.asignadoAButton.setVisible(false);
			
			vista.boton_create_cientifico.setVisible(true);
			vista.boton_update_cientifico.setVisible(true);
			vista.boton_read_cientifico.setVisible(true);
			vista.boton_delete_cientifico.setVisible(true);
		}
		
		if(vista.boton_create_cientifico == evento.getSource()) {
			try {
				vista.vista_create_cientifico.setVisible(true);
				vista.vista_delete_cientifico.setVisible(false);
				vista.vista_update_cientifico.setVisible(false);
				vista.vista_read_cientifico.setVisible(false);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.boton_delete_cientifico == evento.getSource()) {
			try {
				vista.vista_create_cientifico.setVisible(false);
				vista.vista_delete_cientifico.setVisible(true);
				vista.vista_update_cientifico.setVisible(false);
				vista.vista_read_cientifico.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_update_cientifico == evento.getSource()) {
			try {
				vista.vista_create_cientifico.setVisible(false);
				vista.vista_delete_cientifico.setVisible(false);
				vista.vista_update_cientifico.setVisible(true);
				vista.vista_read_cientifico.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_read_cientifico == evento.getSource()) {
			try {
				vista.textAreaCientifico.setText(null);
				
				vista.vista_create_cientifico.setVisible(false);
				vista.vista_delete_cientifico.setVisible(false);
				vista.vista_update_cientifico.setVisible(false);
				vista.vista_read_cientifico.setVisible(true);
				ArrayList<String> text = this.cientifico.read();
				for (int i = 0; i < text.size(); i++) {
					vista.textAreaCientifico.append(text.get(i)+"\n");
				}
				
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_guardar_cientifico == evento.getSource()) {
			String dni,nom_apels;
			
			dni=this.vista.createDniField.getText();
			nom_apels=this.vista.createNomApelsField.getText();
			try {
				this.cientifico.create(dni, nom_apels);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_create_cientifico.setVisible(false);
		}
		
		if(vista.boton_guardar1_cientifico == evento.getSource()) {
			
			String dni,nom_apels;
			
			dni=this.vista.editDniField.getText();
			nom_apels=this.vista.editNomApelsField.getText();
			
			try {
				this.cientifico.update("nom_apels",nom_apels,dni,"dni");
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.vista.vista_update_cientifico.setVisible(false);
		}
		
		if(vista.boton_borrar_cientifico == evento.getSource()) {
			
			String dni;
		
			dni=this.vista.deleteDniField.getText();
			try {
				this.cientifico.delete(dni,"dni");
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_delete_cientifico.setVisible(false);
		}
	}
}
