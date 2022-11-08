package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;

import Modelo.Cientifico;
import Vista.Vista;

public class ControladorCientifico implements ActionListener {
	private Cientifico cientifico;
	private Vista vista;
	private JPanel vista_create_cientifico, vista_delete_cientifico, vista_update_cientifico, vista_read_cientifico;
	
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
		}
		
		if (vista.proyectoButton == evento.getSource()) {
			vista.vista_cientifico.setVisible(false);
			vista.vista_proyecto.setVisible(true);
			vista.vista_asignado_a.setVisible(false);
		}
		
		if (vista.cientificoButton == evento.getSource()) {
			vista.vista_cientifico.setVisible(false);
			vista.vista_proyecto.setVisible(false);
			vista.vista_asignado_a.setVisible(true);
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
			String nombre,apellido,fecha,direccion;
			int dni;
			
			dni=this.vista.createNombreField.getText();
			apellido=this.vista.createApellidoField.getText();
			direccion = this.vista.createDireccionField.getText();
			dni=Integer.parseInt(this.vista.createDniField.getText());
			fecha=this.vista.createFechaField.getText();
			try {
				this.modelo.create(nombre, apellido, direccion, dni, fecha);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_create.setVisible(false);
		}
		
		if(vista.boton_guardar1 == evento.getSource()) {
			
			String nombre,apellido,fecha,direccion,id;
			int dni;
			
			nombre=this.vista.editNombreField.getText();
			apellido=this.vista.editApellidoField.getText();
			direccion = this.vista.editDireccionField.getText();
			dni=Integer.parseInt(this.vista.editDniField.getText());
			fecha=this.vista.editFechaField.getText();
			id=this.vista.editIdField.getText();
			
			try {
				this.modelo.update("nombre",nombre,id);
				this.modelo.update("apellido",apellido,id);
				this.modelo.update("direccion",direccion,id);
				this.modelo.update("dni", String.valueOf(dni),id);
				this.modelo.update("fecha",fecha,id);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.vista.vista_update.setVisible(false);
		}
		
		if(vista.boton_borrar == evento.getSource()) {
			
			int id;
		
			id=Integer.parseInt(this.vista.deleteIdField.getText());
			try {
				this.modelo.delete(id,"id");
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_delete.setVisible(false);
		}
	}
}
