package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;

import Modelo.Proyecto;
import Vista.Vista;

public class ControladorProyecto implements ActionListener {
	private Proyecto proyecto;
	private Vista vista;
	private JPanel vista_create_proyecto, vista_delete_proyecto, vista_update_proyecto, vista_read_proyecto;
	
	public ControladorProyecto(Proyecto proyecto, Vista vista) {
		this.proyecto=proyecto;
		this.vista=vista;
		this.vista.boton_create_proyecto.addActionListener(this);
		this.vista.boton_delete_proyecto.addActionListener(this);
		this.vista.boton_read_proyecto.addActionListener(this);
		this.vista.boton_update_proyecto.addActionListener(this);
		this.vista.boton_borrar_proyecto.addActionListener(this);
		this.vista.boton_salir_proyecto.addActionListener(this);
		this.vista.boton_guardar_proyecto.addActionListener(this);
		this.vista.boton_guardar1_proyecto.addActionListener(this);
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
		
		if(vista.boton_create_proyecto == evento.getSource()) {
			try {
				vista.vista_create_proyecto.setVisible(true);
				vista.vista_delete_proyecto.setVisible(false);
				vista.vista_update_proyecto.setVisible(false);
				vista.vista_read_proyecto.setVisible(false);
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.boton_delete_proyecto == evento.getSource()) {
			try {
				vista.vista_create_proyecto.setVisible(false);
				vista.vista_delete_proyecto.setVisible(true);
				vista.vista_update_proyecto.setVisible(false);
				vista.vista_read_proyecto.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_update_proyecto == evento.getSource()) {
			try {
				vista.vista_create_proyecto.setVisible(false);
				vista.vista_delete_proyecto.setVisible(false);
				vista.vista_update_proyecto.setVisible(true);
				vista.vista_read_proyecto.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_read_proyecto == evento.getSource()) {
			try {
				vista.textAreaProyecto.setText(null);
				
				vista.vista_create_proyecto.setVisible(false);
				vista.vista_delete_proyecto.setVisible(false);
				vista.vista_update_proyecto.setVisible(false);
				vista.vista_read_proyecto.setVisible(true);
				ArrayList<String> text = this.proyecto.read();
				for (int i = 0; i < text.size(); i++) {
					vista.textAreaProyecto.append(text.get(i)+"\n");
				}
				
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_guardar_proyecto == evento.getSource()) {
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
