package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;


import Modelo.Proyecto;
import Vista.Vista;

public class ControladorProyecto implements ActionListener {
	private Proyecto proyecto;
	private Vista vista;
	
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
		this.vista.boton_salir_update_proyecto.addActionListener(this);
		this.vista.boton_salir_create_proyecto.addActionListener(this);
		this.vista.boton_salir_delete_proyecto.addActionListener(this);
		this.vista.boton_volver_proyecto.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent evento) {
		if (vista.proyectoButton == evento.getSource()) {
			vista.vista_cientifico.setVisible(false);
			vista.vista_proyecto.setVisible(true);
			vista.vista_asignado_a.setVisible(false);
			
			
			//TODOS LOS BOTONES EN TRUE
			vista.boton_create_proyecto.setVisible(true);
			vista.boton_delete_proyecto.setVisible(true);
			vista.boton_read_proyecto.setVisible(true);
			vista.boton_update_proyecto.setVisible(true);
			
			vista.boton_volver_proyecto.setVisible(true);
			
			//Los principales en false
			vista.cientificoButton.setVisible(false);
			vista.proyectoButton.setVisible(false);
			vista.asignadoAButton.setVisible(false);
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
		
		if(vista.boton_volver_proyecto == evento.getSource()) {
		    vista.vista_proyecto.setVisible(false);

		    //TODOS LOS BOTONES EN FALSE
		    vista.boton_create_proyecto.setVisible(false);
		    vista.boton_delete_proyecto.setVisible(false);
		    vista.boton_read_proyecto.setVisible(false);
		    vista.boton_update_proyecto.setVisible(false);
		    vista.boton_volver_proyecto.setVisible(false);

		    //Los principales en true
		    vista.cientificoButton.setVisible(true);
		    vista.proyectoButton.setVisible(true);
		    vista.asignadoAButton.setVisible(true);
		}
		
		if(vista.boton_salir_create_proyecto == evento.getSource()) {
			vista.vista_create_proyecto.setVisible(false);
			vista.vista_proyecto.setVisible(true);
		}
		
		if(vista.boton_salir_update_proyecto == evento.getSource()) {
			vista.vista_update_proyecto.setVisible(false);
			vista.vista_proyecto.setVisible(true);
		}
		
		if(vista.boton_salir_delete_proyecto == evento.getSource()) {
			vista.vista_delete_proyecto.setVisible(false);
			vista.vista_proyecto.setVisible(true);
		}
		
		if(vista.boton_salir_proyecto == evento.getSource()) {
			vista.vista_read_proyecto.setVisible(false);
			vista.vista_proyecto.setVisible(true);
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
			String nombre,id;
			int horas;
			
			nombre=this.vista.createNombreField.getText();
			horas=Integer.parseInt(this.vista.createHorasField.getText());
			id=this.vista.createIdField.getText();

			try {
				this.proyecto.create(id,nombre, horas);
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_create_proyecto.setVisible(false);
		}
		
		if(vista.boton_guardar1_proyecto == evento.getSource()) {
			
			String nombre,id;
			int horas;
			
			nombre=this.vista.createNombreField.getText();
			horas=Integer.parseInt(this.vista.createHorasField.getText());
			id=this.vista.createIdField.getText();
			
			try {
				this.proyecto.update("nombre",nombre,id,"id");
				this.proyecto.update("horas",String.valueOf(horas),id,"id");
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.vista.vista_update_proyecto.setVisible(false);
		}
		
		if(vista.boton_borrar_proyecto == evento.getSource()) {
			
			String id;
		
			id=this.vista.deleteIdField.getText();
			try {
				this.proyecto.delete(id,"id");
			} catch (FileNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.vista.vista_delete_proyecto.setVisible(false);
		}
	}
}
