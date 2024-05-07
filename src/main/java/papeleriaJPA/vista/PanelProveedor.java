package papeleriaJPA.vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

import papeleriaJPA.controllers.ControladorProveedor;
import papeleriaJPA.models.Proveedor;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelProveedor extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfCif;
	private JFormattedTextField jtfFechaAlta;
	private JComboBox<String> jcbNacionalidad;
	private JCheckBox jchkActivo;
	private ButtonGroup grupoOpciones = new ButtonGroup();
	private JPanel panelJRadio;
	private Proveedor proveedor;
	
	/**
	 * Create the panel.
	 */
	public PanelProveedor(Proveedor p) {
		proveedor = p;
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnNewButton.setIcon(new ImageIcon(PanelProveedor.class.getResource("/res/guardar.png")));
		toolBar.add(btnNewButton);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{94, 91, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 48, 47};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 4.9E-324};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Gestión del proveedor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CIF: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfCif = new JTextField();
		GridBagConstraints gbc_jtfCif = new GridBagConstraints();
		gbc_jtfCif.gridwidth = 2;
		gbc_jtfCif.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCif.gridx = 1;
		gbc_jtfCif.gridy = 2;
		panel.add(jtfCif, gbc_jtfCif);
		jtfCif.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nacionalidad:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jcbNacionalidad = new JComboBox<String>();
		GridBagConstraints gbc_jcbNacionalidad = new GridBagConstraints();
		gbc_jcbNacionalidad.gridwidth = 2;
		gbc_jcbNacionalidad.insets = new Insets(0, 0, 5, 5);
		gbc_jcbNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbNacionalidad.gridx = 1;
		gbc_jcbNacionalidad.gridy = 3;
		panel.add(jcbNacionalidad, gbc_jcbNacionalidad);
		
		JLabel lblNewLabel_4 = new JLabel("Activo:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jchkActivo = new JCheckBox("");
		GridBagConstraints gbc_jchkActivo = new GridBagConstraints();
		gbc_jchkActivo.anchor = GridBagConstraints.WEST;
		gbc_jchkActivo.insets = new Insets(0, 0, 5, 5);
		gbc_jchkActivo.gridx = 1;
		gbc_jchkActivo.gridy = 4;
		panel.add(jchkActivo, gbc_jchkActivo);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de alta: ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfFechaAlta = getJFormattedTextFieldDatePersonalizado();
		GridBagConstraints gbc_jtfFechaAlta = new GridBagConstraints();
		gbc_jtfFechaAlta.gridwidth = 2;
		gbc_jtfFechaAlta.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFechaAlta.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaAlta.gridx = 1;
		gbc_jtfFechaAlta.gridy = 5;
		panel.add(jtfFechaAlta, gbc_jtfFechaAlta);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de IVA: ");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridheight = 2;
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		panelJRadio = new JPanel();
		GridBagConstraints gbc_panelJRadio = new GridBagConstraints();
		gbc_panelJRadio.gridheight = 2;
		gbc_panelJRadio.gridwidth = 2;
		gbc_panelJRadio.insets = new Insets(0, 0, 5, 5);
		gbc_panelJRadio.fill = GridBagConstraints.BOTH;
		gbc_panelJRadio.gridx = 1;
		gbc_panelJRadio.gridy = 6;
		panel.add(panelJRadio, gbc_panelJRadio);
		
		
		
		inicializarNacionalidad();
		
		mostrarEntidad(proveedor);
	}
	private void inicializarNacionalidad() {
		jcbNacionalidad.removeAllItems();
		jcbNacionalidad.addItem("España");
		jcbNacionalidad.addItem("Extranjero");
	}
	
	
	public void mostrarEntidad(Proveedor p) {
		jtfId.setText("" + p.getId());
		jtfCif.setText(p.getCif());
		for (int i = 0; i < jcbNacionalidad.getItemCount(); i++) {
			if (jcbNacionalidad.getItemAt(i).toString().equals(p.getNacionalidad())) {
				jcbNacionalidad.setSelectedIndex(i);
			}
		}
		jchkActivo.setSelected(p.isActivo());
		jtfFechaAlta.setValue(p.getFechaAlta());
		
		String opciones[] = new String[]{"Exento","4","10","21"};
		
		for (int i = 0; i < opciones.length; i++) {
		    JRadioButton jrb;
		    if (i >= 1) {
		        jrb = new JRadioButton(opciones[i] + "%");
		    } else {
		        jrb = new JRadioButton(opciones[i]);
		        if (p.getIva() == 0) {
		            jrb.setSelected(true);
		        }
		    }
		    jrb.setActionCommand(opciones[i]); 
		    if (opciones[i].equals("" + p.getIva())) {
		        jrb.setSelected(true);
		    }
		    grupoOpciones.add(jrb);
		    panelJRadio.add(jrb);
		}

	}
		
	
	private void guardar() {
	    Proveedor p = new Proveedor();
	    p.setId(Integer.parseInt(jtfId.getText()));
	    p.setCif(jtfCif.getText());
	    p.setNacionalidad(jcbNacionalidad.getSelectedItem().toString());
	    p.setActivo(jchkActivo.isSelected());

	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
	    try {
	        date = sdf.parse(jtfFechaAlta.getText());
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

	    p.setFechaAlta(date);

	    String ivaSeleccionado = grupoOpciones.getSelection().getActionCommand();
	    p.setIva(Integer.parseInt(ivaSeleccionado));

	    ControladorProveedor.getInstance().actualizacion(p);
	    
	    
	}

	
	private JFormattedTextField getJFormattedTextFieldDatePersonalizado() {
		JFormattedTextField jtfFecha = new JFormattedTextField(new JFormattedTextField.AbstractFormatter() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			@Override
			public String valueToString(Object value) throws ParseException {
				if (value != null && value instanceof Date) {
					return sdf.format(((Date) value));
				}
				return "";
			}

			@Override
			public Object stringToValue(String text) throws ParseException {
				try {
					return sdf.parse(text);
				} catch (Exception e) {
					return null;
				}
			}
		});
		jtfFecha.setValue(new Date());
		return jtfFecha;
	}

}
