package Vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane, vista_escoger;
	
	public JPanel vista_create_cientifico, vista_update_cientifico, vista_read_cientifico, vista_delete_cientifico;
	
	public JPanel vista_create_proyecto, vista_update_proyecto, vista_read_proyecto, vista_delete_proyecto;
	
	public JPanel vista_create_asignado_a, vista_update_asignado_a, vista_read_asignado_a, vista_delete_asignado_a;
	
	public JTextField editDniField, editNomApelsField;
	public JTextField createDniField, createNomApelsField;
	public JTextField deleteDniField;
	
	public JTextField editIdField, editNombreField, editHorasField;
	public JTextField createIdField, createNombreField, createHorasField;
	public JTextField deleteIdField;
	
	public JTextField editCientificoDniField, editProyectoIdField;
	public JTextField createCientificoDniField, createProyectoIdField;
	public JTextField deleteCientificoDniField, deleteProyectoIdField;;
	
	public JButton boton_borrar_cientifico, boton_guardar_cientifico, boton_salir_cientifico, boton_guardar1_cientifico;
	
	public JButton boton_update_cientifico, boton_read_cientifico, boton_create_cientifico, boton_delete_cientifico;
	
	public JButton boton_borrar_proyecto, boton_guardar_proyecto, boton_salir_proyecto, boton_guardar1_proyecto;
	
	public JButton boton_update_proyecto, boton_read_proyecto, boton_create_proyecto, boton_delete_proyecto;
	
	public JButton boton_borrar_asignado_a, boton_guardar_asignado_a, boton_salir_asignado_a, boton_guardar1_asignado_a;

	public JButton boton_update_asignado_a, boton_read_asignado_a, boton_create_asignado_a, boton_delete_asignado_a;
	
	public JButton cientificoButton, proyectoButton, asignadoAButton;
	
	public JTextArea textAreaCientifico;
	public JTextArea textAreaProyecto;
	public JTextArea textAreaAsignadoA;
	
	public JPanel vista_cientifico;
	public JPanel vista_proyecto;
	public JPanel vista_asignado_a;

	public Vista() {
		
		setTitle("Registro clientes");
		setLocationRelativeTo(null);
		setBounds(100, 100, 643, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		vista_escoger = new JPanel();
		vista_escoger.setBounds(0, 0, 627, 529);
		contentPane.add(vista_escoger);
		vista_escoger.setLayout(null);
		vista_proyecto = new JPanel();
		
		
		
		
		
		//ELEMENTOS VISTA UPDATE PROYECTO
		
		vista_update_proyecto = new JPanel();
		//vista_update.setVisible(false);
		vista_update_proyecto.setLayout(null);
		vista_update_proyecto.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update_proyecto.setBounds(0, 0, 627, 529);
		vista_proyecto.add(vista_update_proyecto);
		
		editIdField = new JTextField();
		editIdField.setBounds(373, 56, 86, 20);
		vista_update_proyecto.add(editIdField);
		editIdField.setColumns(10);
		
		JLabel label15 = new JLabel("ID");
		label15.setBounds(373, 31, 46, 14);
		vista_update_proyecto.add(label15);
		
		editNombreField = new JTextField();
		editNombreField.setBounds(373, 112, 86, 20);
		vista_update_proyecto.add(editNombreField);
		editNombreField.setColumns(10);
		
		JLabel label16 = new JLabel("Nombre");
		label16.setBounds(373, 87, 46, 14);
		vista_update_proyecto.add(label16);
		
		editHorasField = new JTextField();
		editHorasField.setBounds(373, 168, 86, 20);
		vista_update_proyecto.add(editHorasField);
		editHorasField.setColumns(10);
		
		JLabel label17 = new JLabel("Horas");
		label17.setBounds(373, 143, 46, 14);
		vista_update_proyecto.add(label17);
		
		boton_guardar1_proyecto = new JButton("Guardar");
		boton_guardar1_proyecto.setBounds(427, 300, 147, 73);
		vista_update_proyecto.add(boton_guardar1_proyecto);
		
		vista_update_proyecto.setVisible(false);
		
		
		
		
		/// ELEMENTOS VISTA_READ PROYECTO
		
		vista_read_proyecto = new JPanel();
		//vista_read.setVisible(false);
		vista_read_proyecto.setLayout(null);
		vista_read_proyecto.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_read_proyecto.setBounds(0, 0, 627, 529);
		vista_proyecto.add(vista_read_proyecto);
		
		textAreaProyecto = new JTextArea();
		textAreaProyecto.setBounds(290, 23, 315, 289);
		vista_read_proyecto.add(textAreaProyecto);
		
		boton_salir_proyecto = new JButton("Salir");
		boton_salir_proyecto.setBounds(367, 322, 147, 73);
		vista_read_proyecto.add(boton_salir_proyecto);
		
		vista_read_proyecto.setVisible(false);
		
		
		
		//// ELEMENTOS VISTA_DELETE PROYECTO
		
		
		vista_delete_proyecto = new JPanel();
		//vista_delete.setVisible(false);
		vista_delete_proyecto.setLayout(null);
		vista_delete_proyecto.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete_proyecto.setBounds(0, 0, 627, 529);
		vista_proyecto.add(vista_delete_proyecto);
		
		JLabel label_id_12 = new JLabel("ID");
		label_id_12.setBounds(485, 31, 46, 14);
		vista_delete_proyecto.add(label_id_12);
		
		deleteIdField = new JTextField();
		deleteIdField.setColumns(10);
		deleteIdField.setBounds(485, 56, 86, 20);
		vista_delete_proyecto.add(deleteIdField);
		
		boton_borrar_proyecto = new JButton("Borrar");
		boton_borrar_proyecto.setBounds(386, 300, 147, 73);
		vista_delete_proyecto.add(boton_borrar_proyecto);
		
		vista_delete_proyecto.setVisible(false);
		
		
		
		
		
		
		
		
		// ELEMENTOS VISTA CREATE PROYECTO
		
		vista_create_proyecto = new JPanel();
		vista_create_proyecto.setLayout(null);
		vista_create_proyecto.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_create_proyecto.setBounds(0, 0, 627, 529);
		vista_proyecto.add(vista_create_proyecto);
		
		createIdField = new JTextField();
		createIdField.setBounds(378, 83, 86, 20);
		vista_create_proyecto.add(createIdField);
		createIdField.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("ID");
		lblNewLabel_12.setBounds(378, 58, 46, 14);
		vista_create_proyecto.add(lblNewLabel_12);
		
		createNombreField = new JTextField();
		createNombreField.setBounds(378, 151, 86, 20);
		vista_create_proyecto.add(createNombreField);
		createNombreField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Nombre");
		lblNewLabel_13.setBounds(378, 126, 46, 14);
		vista_create_proyecto.add(lblNewLabel_13);
		
		createHorasField = new JTextField();
		createHorasField.setBounds(378, 219, 86, 20);
		vista_create_proyecto.add(createHorasField);
		createHorasField.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Horas");
		lblNewLabel_14.setBounds(378, 200, 46, 14);
		vista_create_proyecto.add(lblNewLabel_14);
		
		boton_guardar_proyecto = new JButton("Guardar");
		boton_guardar_proyecto.setBounds(395, 376, 124, 46);
		vista_create_proyecto.add(boton_guardar_proyecto);
		
		JLabel lblNewLabel_15 = new JLabel("Nuevo proyecto");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_15.setBounds(442, 25, 91, 14);
		vista_create_proyecto.add(lblNewLabel_15);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBounds(311, 11, 40, 406);
		vista_create_proyecto.add(separator1);
		separator1.setOrientation(SwingConstants.VERTICAL);
		
		vista_create_proyecto.setVisible(false);
		
		
		// BOTONES PANEL GENERAL PROYECTO
		
		boton_update_proyecto = new JButton("Actualizar proyecto");
		boton_update_proyecto.setBounds(48, 149, 117, 23);
		vista_proyecto.add(boton_update_proyecto);
		boton_update_proyecto.setVisible(false);
		
		boton_read_proyecto = new JButton("Mostrar registro");
		boton_read_proyecto.setBounds(48, 200, 109, 23);
		vista_proyecto.add(boton_read_proyecto);
		boton_read_proyecto.setVisible(false);
		
		boton_delete_proyecto = new JButton("Eliminar proyecto");
		boton_delete_proyecto.setBounds(48, 312, 107, 23);
		vista_proyecto.add(boton_delete_proyecto);
		boton_delete_proyecto.setVisible(false);
		
		boton_create_proyecto = new JButton("Crear proyecto");
		boton_create_proyecto.setBounds(48, 254, 97, 23);
		vista_proyecto.add(boton_create_proyecto);
		boton_create_proyecto.setVisible(false);
		
		asignadoAButton = new JButton("Asignado a");
		asignadoAButton.setBounds(271, 280, 89, 23);
		vista_escoger.add(asignadoAButton);
		
		
		// BOTONES ESCOGER
		
		cientificoButton = new JButton("Científico");
		cientificoButton.setBounds(271, 149, 89, 23);
		vista_escoger.add(cientificoButton);
		
		proyectoButton = new JButton("Proyecto");
		proyectoButton.setBounds(271, 210, 89, 23);
		vista_escoger.add(proyectoButton);
		
		JLabel lblNewLabel_9 = new JLabel("Opciones: ");
		vista_proyecto.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("REGISTRO DE PROYECTOS");
		vista_proyecto.add(lblNewLabel_10);
		
		vista_proyecto.setBounds(0, 0, 627, 529);
		vista_escoger.add(vista_proyecto);
		vista_proyecto.setLayout(null);
		
		vista_cientifico = new JPanel();
		
		
		
		
		
		
		// BOTONES PANEL GENERAL CIENTIFICO
		
		boton_update_cientifico = new JButton("Actualizar científico");
		boton_update_cientifico.setBounds(48, 149, 117, 23);
		vista_cientifico.add(boton_update_cientifico);
		boton_update_cientifico.setVisible(false);
		
		boton_read_cientifico = new JButton("Mostrar registro");
		boton_read_cientifico.setBounds(48, 200, 109, 23);
		vista_cientifico.add(boton_read_cientifico);
		boton_read_cientifico.setVisible(false);
		
		boton_delete_cientifico = new JButton("Eliminar científico");
		boton_delete_cientifico.setBounds(48, 312, 107, 23);
		vista_cientifico.add(boton_delete_cientifico);
		boton_delete_cientifico.setVisible(false);
		
		boton_create_cientifico = new JButton("Crear científico");
		boton_create_cientifico.setBounds(48, 254, 97, 23);
		vista_cientifico.add(boton_create_cientifico);
		boton_create_cientifico.setVisible(false);
		
		
		
		//// ELEMENTOS VISTA_DELETE CIENTIFICO
		
		
		vista_delete_cientifico = new JPanel();
		//vista_delete.setVisible(false);
		vista_delete_cientifico.setLayout(null);
		vista_delete_cientifico.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete_cientifico.setBounds(0, 0, 627, 529);
		vista_cientifico.add(vista_delete_cientifico);
		
		JLabel label_id_2 = new JLabel("DNI");
		label_id_2.setBounds(487, 34, 46, 14);
		vista_delete_cientifico.add(label_id_2);
		
		deleteDniField = new JTextField();
		deleteDniField.setColumns(10);
		deleteDniField.setBounds(487, 59, 86, 20);
		vista_delete_cientifico.add(deleteDniField);
		
		boton_borrar_cientifico = new JButton("Borrar");
		boton_borrar_cientifico.setBounds(388, 303, 147, 73);
		vista_delete_cientifico.add(boton_borrar_cientifico);
		
		vista_delete_cientifico.setVisible(false);
		
		
		
		
		/// ELEMENTOS VISTA_READ CIENTIFICO
		
		vista_read_cientifico = new JPanel();
		//vista_read.setVisible(false);
		vista_read_cientifico.setLayout(null);
		vista_read_cientifico.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_read_cientifico.setBounds(0, 0, 627, 529);
		vista_cientifico.add(vista_read_cientifico);
		
		textAreaCientifico = new JTextArea();
		textAreaCientifico.setBounds(289, 23, 315, 289);
		vista_read_cientifico.add(textAreaCientifico);
		
		boton_salir_cientifico = new JButton("Salir");
		boton_salir_cientifico.setBounds(366, 322, 147, 73);
		vista_read_cientifico.add(boton_salir_cientifico);
		
		vista_read_cientifico.setVisible(false);
		
		
		
		
		
		//ELEMENTOS VISTA UPDATE CIENTIFICO
		
		vista_update_cientifico = new JPanel();
		//vista_update.setVisible(false);
		vista_update_cientifico.setLayout(null);
		vista_update_cientifico.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update_cientifico.setBounds(0, 0, 627, 529);
		vista_cientifico.add(vista_update_cientifico);
		
		editDniField = new JTextField();
		editDniField.setBounds(371, 56, 86, 20);
		vista_update_cientifico.add(editDniField);
		editDniField.setColumns(10);
		
		JLabel label1 = new JLabel("DNI");
		label1.setBounds(371, 31, 46, 14);
		vista_update_cientifico.add(label1);
		
		editNomApelsField = new JTextField();
		editNomApelsField.setBounds(371, 112, 86, 20);
		vista_update_cientifico.add(editNomApelsField);
		editNomApelsField.setColumns(10);
		
		JLabel label2 = new JLabel("Nom_Apels");
		label2.setBounds(371, 87, 46, 14);
		vista_update_cientifico.add(label2);
		
		boton_guardar1_cientifico = new JButton("Guardar");
		boton_guardar1_cientifico.setBounds(425, 300, 147, 73);
		vista_update_cientifico.add(boton_guardar1_cientifico);
		
		vista_update_cientifico.setVisible(false);
		
		// ELEMENTOS VISTA CREATE CIENTIFICO
		
		vista_create_cientifico = new JPanel();
		vista_create_cientifico.setLayout(null);
		vista_create_cientifico.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_create_cientifico.setBounds(0, 0, 627, 529);
		vista_cientifico.add(vista_create_cientifico);
		
		createDniField = new JTextField();
		createDniField.setBounds(377, 85, 86, 20);
		vista_create_cientifico.add(createDniField);
		createDniField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(377, 60, 46, 14);
		vista_create_cientifico.add(lblNewLabel);
		
		createNomApelsField = new JTextField();
		createNomApelsField.setBounds(377, 153, 86, 20);
		vista_create_cientifico.add(createNomApelsField);
		createNomApelsField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom_Apels");
		lblNewLabel_1.setBounds(377, 128, 46, 14);
		vista_create_cientifico.add(lblNewLabel_1);
		
		boton_guardar_cientifico = new JButton("Guardar");
		boton_guardar_cientifico.setBounds(394, 378, 124, 46);
		vista_create_cientifico.add(boton_guardar_cientifico);
		
		JLabel lblNewLabel_6 = new JLabel("Nuevo científico");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(441, 27, 91, 14);
		vista_create_cientifico.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(308, 18, 40, 406);
		vista_create_cientifico.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		vista_create_cientifico.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("Opciones: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(452, 50, 57, 14);
		vista_cientifico.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("REGISTRO DE CIENTÍFICOS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(242, 33, 143, 16);
		vista_cientifico.add(lblNewLabel_5);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(452, 50, 57, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(242, 33, 143, 16);
		
		vista_cientifico.setBounds(0, 0, 627, 529);
		vista_escoger.add(vista_cientifico);
		vista_cientifico.setLayout(null);
		vista_asignado_a = new JPanel();
		
		boton_create_asignado_a = new JButton("Crear asignado");
		boton_create_asignado_a.setBounds(48, 254, 97, 23);
		vista_asignado_a.add(boton_create_asignado_a);
		boton_create_asignado_a.setVisible(false);
		
		boton_read_asignado_a = new JButton("Mostrar registro");
		boton_read_asignado_a.setBounds(48, 200, 109, 23);
		vista_asignado_a.add(boton_read_asignado_a);
		boton_read_asignado_a.setVisible(false);
		
		boton_delete_asignado_a = new JButton("Eliminar asignado");
		boton_delete_asignado_a.setBounds(48, 312, 107, 23);
		vista_asignado_a.add(boton_delete_asignado_a);
		boton_delete_asignado_a.setVisible(false);
		
		
		// BOTONES PANEL GENERAL ASIGNADO_A
		
		boton_update_asignado_a = new JButton("Actualizar asignado");
		boton_update_asignado_a.setBounds(48, 149, 117, 23);
		vista_asignado_a.add(boton_update_asignado_a);
		boton_update_asignado_a.setVisible(false);
		
		
		
		//// ELEMENTOS VISTA_DELETE ASIGNADO_A
		
		
		vista_delete_asignado_a = new JPanel();
		//vista_delete.setVisible(false);
		vista_delete_asignado_a.setLayout(null);
		vista_delete_asignado_a.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete_asignado_a.setBounds(0, 0, 627, 529);
		vista_asignado_a.add(vista_delete_asignado_a);
		
		JLabel label_id_13 = new JLabel("DNI Científico");
		label_id_13.setBounds(461, 44, 46, 14);
		vista_delete_asignado_a.add(label_id_13);
		
		deleteCientificoDniField = new JTextField();
		deleteCientificoDniField.setColumns(10);
		deleteCientificoDniField.setBounds(461, 69, 86, 20);
		vista_delete_asignado_a.add(deleteCientificoDniField);
		
		JLabel label_id_14 = new JLabel("ID Proyecto");
		label_id_14.setBounds(461, 103, 46, 14);
		vista_delete_asignado_a.add(label_id_14);
		
		deleteProyectoIdField = new JTextField();
		deleteProyectoIdField.setColumns(10);
		deleteProyectoIdField.setBounds(461, 128, 86, 20);
		vista_delete_asignado_a.add(deleteProyectoIdField);
		
		boton_borrar_asignado_a = new JButton("Borrar");
		boton_borrar_asignado_a.setBounds(362, 313, 147, 73);
		vista_delete_asignado_a.add(boton_borrar_asignado_a);
		
		vista_delete_asignado_a.setVisible(false);
		
		
		
		
		/// ELEMENTOS VISTA_READ ASIGNADO_A
		
		vista_read_asignado_a = new JPanel();
		//vista_read.setVisible(false);
		vista_read_asignado_a.setLayout(null);
		vista_read_asignado_a.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_read_asignado_a.setBounds(0, 0, 627, 529);
		vista_asignado_a.add(vista_read_asignado_a);
		
		textAreaAsignadoA = new JTextArea();
		textAreaAsignadoA.setBounds(288, 24, 315, 289);
		vista_read_asignado_a.add(textAreaAsignadoA);
		
		boton_salir_asignado_a = new JButton("Salir");
		boton_salir_asignado_a.setBounds(365, 323, 147, 73);
		vista_read_asignado_a.add(boton_salir_asignado_a);
		
		vista_read_asignado_a.setVisible(false);
		
		
		
		
		
		//ELEMENTOS VISTA UPDATE ASIGNADO_A
		
		vista_update_asignado_a = new JPanel();
		//vista_update.setVisible(false);
		vista_update_asignado_a.setLayout(null);
		vista_update_asignado_a.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update_asignado_a.setBounds(0, 0, 627, 529);
		vista_asignado_a.add(vista_update_asignado_a);
		
		editCientificoDniField = new JTextField();
		editCientificoDniField.setBounds(361, 55, 86, 20);
		vista_update_asignado_a.add(editCientificoDniField);
		editCientificoDniField.setColumns(10);
		
		JLabel label18 = new JLabel("DNI Científico");
		label18.setBounds(361, 30, 46, 14);
		vista_update_asignado_a.add(label18);
		
		editProyectoIdField = new JTextField();
		editProyectoIdField.setBounds(361, 111, 86, 20);
		vista_update_asignado_a.add(editProyectoIdField);
		editProyectoIdField.setColumns(10);
		
		JLabel label19 = new JLabel("ID Proyecto");
		label19.setBounds(361, 86, 46, 14);
		vista_update_asignado_a.add(label19);
		
		boton_guardar1_asignado_a = new JButton("Guardar");
		boton_guardar1_asignado_a.setBounds(415, 299, 147, 73);
		vista_update_asignado_a.add(boton_guardar1_asignado_a);
		
		vista_update_asignado_a.setVisible(false);
		
		
		
		
		
		// ELEMENTOS VISTA CREATE ASIGNADO_A
		
		vista_create_asignado_a = new JPanel();
		vista_create_asignado_a.setLayout(null);
		vista_create_asignado_a.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_create_asignado_a.setBounds(0, 0, 627, 529);
		vista_asignado_a.add(vista_create_asignado_a);
		
		createCientificoDniField = new JTextField();
		createCientificoDniField.setBounds(387, 83, 86, 20);
		vista_create_asignado_a.add(createCientificoDniField);
		createCientificoDniField.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("DNI Científico");
		lblNewLabel_16.setBounds(387, 58, 46, 14);
		vista_create_asignado_a.add(lblNewLabel_16);
		
		createProyectoIdField = new JTextField();
		createProyectoIdField.setBounds(387, 151, 86, 20);
		vista_create_asignado_a.add(createProyectoIdField);
		createProyectoIdField.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("ID Proyecto");
		lblNewLabel_17.setBounds(387, 126, 46, 14);
		vista_create_asignado_a.add(lblNewLabel_17);
		
		boton_guardar_asignado_a = new JButton("Guardar");
		boton_guardar_asignado_a.setBounds(404, 376, 124, 46);
		vista_create_asignado_a.add(boton_guardar_asignado_a);
		
		JLabel lblNewLabel_18 = new JLabel("Nuevo asignado");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_18.setBounds(451, 25, 91, 14);
		vista_create_asignado_a.add(lblNewLabel_18);
		
		JSeparator separator2 = new JSeparator();
		separator2.setBounds(320, 11, 40, 406);
		vista_create_asignado_a.add(separator2);
		separator2.setOrientation(SwingConstants.VERTICAL);
		
		vista_create_asignado_a.setVisible(false);
		
		JLabel lblNewLabel_11 = new JLabel("Opciones: ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(452, 50, 57, 14);
		vista_asignado_a.add(lblNewLabel_11);
		
		JLabel lblNewLabel_24 = new JLabel("REGISTRO DE ASIGNADOS");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24.setBounds(242, 33, 143, 16);
		vista_asignado_a.add(lblNewLabel_24);
		
		vista_asignado_a.setBounds(0, 0, 627, 529);
		vista_escoger.add(vista_asignado_a);
		vista_asignado_a.setLayout(null);
		
		
	}
}
