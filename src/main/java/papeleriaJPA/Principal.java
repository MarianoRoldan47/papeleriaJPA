package papeleriaJPA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import papeleriaJPA.controllers.ControladorArticulo;
import papeleriaJPA.controllers.ControladorProveedor;
import papeleriaJPA.models.Articulo;
import papeleriaJPA.models.Proveedor;
import papeleriaJPA.vista.PanelProveedor;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfCodigo;
	private JTextField jtfDescripcion;
	private JTextField jtfStock;
	private JTextField jtfPrecio;
	private JTextField jtfColor;
	private JComboBox<Proveedor> jcbProveedor;
	JColorChooser jColorChooser;
	JPanel panel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarPrimero();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/res/gotostart.png")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarAnterior();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/res/previous.png")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarSiguiente();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/res/next.png")));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarUltimo();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/res/gotoend.png")));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Principal.class.getResource("/res/nuevo.png")));
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Principal.class.getResource("/res/guardar.png")));
		toolBar.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Principal.class.getResource("/res/eliminar.png")));
		toolBar.add(btnNewButton_6);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{119, 248, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_7 = new JLabel("Gestión de items de papelería");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.gridwidth = 3;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 0;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("Id: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Código: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfCodigo = new JTextField();
		GridBagConstraints gbc_jtfCodigo = new GridBagConstraints();
		gbc_jtfCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCodigo.gridx = 1;
		gbc_jtfCodigo.gridy = 2;
		panel.add(jtfCodigo, gbc_jtfCodigo);
		jtfCodigo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Descripción: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.gridwidth = 2;
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 1;
		gbc_jtfDescripcion.gridy = 3;
		panel.add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Unidades en stock: ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfStock = new JTextField();
		GridBagConstraints gbc_jtfStock = new GridBagConstraints();
		gbc_jtfStock.insets = new Insets(0, 0, 5, 5);
		gbc_jtfStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfStock.gridx = 1;
		gbc_jtfStock.gridy = 4;
		panel.add(jtfStock, gbc_jtfStock);
		jtfStock.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Precio: ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfPrecio = new JTextField();
		GridBagConstraints gbc_jtfPrecio = new GridBagConstraints();
		gbc_jtfPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_jtfPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPrecio.gridx = 1;
		gbc_jtfPrecio.gridy = 5;
		panel.add(jtfPrecio, gbc_jtfPrecio);
		jtfPrecio.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Color: ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 6;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfColor = new JTextField();
		GridBagConstraints gbc_jtfColor = new GridBagConstraints();
		gbc_jtfColor.insets = new Insets(0, 0, 5, 5);
		gbc_jtfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfColor.gridx = 1;
		gbc_jtfColor.gridy = 6;
		panel.add(jtfColor, gbc_jtfColor);
		jtfColor.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Selecciona un color");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaColor();
			}
		});
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 2;
		gbc_btnNewButton_7.gridy = 6;
		panel.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JLabel lblNewLabel_6 = new JLabel("Proveedor: ");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 7;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jcbProveedor = new JComboBox<Proveedor>();
		GridBagConstraints gbc_jcbProveedor = new GridBagConstraints();
		gbc_jcbProveedor.insets = new Insets(0, 0, 0, 5);
		gbc_jcbProveedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProveedor.gridx = 1;
		gbc_jcbProveedor.gridy = 7;
		panel.add(jcbProveedor, gbc_jcbProveedor);
		
		JButton btnNewButton_8 = new JButton("Gestión proveedor");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						JDialog dialogo = new JDialog();
						// El usuario no puede redimensionar el diálogo
						dialogo.setResizable(true);
						// título del díalogo
						dialogo.setTitle("Gestion Proveedor");
						// Introducimos el panel creado sobre el diálogo
						dialogo.setContentPane(new PanelProveedor((Proveedor) jcbProveedor.getSelectedItem()));
						// Empaquetar el di�logo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
						dialogo.pack();
						// El usuario no puede hacer clic sobre la ventana padre, si el Di�logo es modal
						dialogo.setModal(true);
						// Centro el di�logo en pantalla
						dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
								(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
						// Muestro el di�logo en pantalla
						dialogo.setVisible(true);
						dialogo.addWindowListener(new WindowAdapter() {
							public void windowClosing(WindowEvent e) {
								cargarProveedores();
								mostrarEntidad(ControladorArticulo.getInstance().find(Integer.parseInt(jtfId.getText())));
								
								recargar();
							}
							
						});
					}
				});
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.gridx = 2;
		gbc_btnNewButton_8.gridy = 7;
		panel.add(btnNewButton_8, gbc_btnNewButton_8);
		
		cargarProveedores();
		cargarPrimero();
	}
	
	private void seleccionaColor () {
		Color color = jColorChooser.showDialog(null, "Seleccione un Color", Color.gray);
		// Si el usuario pulsa sobre aceptar, el color elegido no será nulo
		if (color != null) {
			String strColor = "#"+Integer.toHexString(color.getRGB()).substring(2);
			this.jtfColor.setText(strColor);
			panel.setBackground(color);
		}
	}
	
	private void recargar() {
		this.revalidate();
		this.repaint();
	}
	
	@SuppressWarnings("unchecked")
	private void cargarProveedores() {
		List<Proveedor> p = (List<Proveedor>) ControladorProveedor.getInstance().findAll();
		
		jcbProveedor.removeAllItems();
		
		for (Proveedor proveedor : p) {
			jcbProveedor.addItem(proveedor);
		}
	}
	
	private void cargarPrimero() {
		mostrarEntidad((Articulo) ControladorArticulo.getInstance().findPrimero()); 
	}
	
	private void cargarAnterior() {
		mostrarEntidad((Articulo) ControladorArticulo.getInstance().findAnterior(Integer.parseInt(jtfId.getText())));
	}
	
	private void cargarSiguiente() {
		mostrarEntidad((Articulo)ControladorArticulo.getInstance().findSiguiente(Integer.parseInt(jtfId.getText())));
	}
	
	
	private void cargarUltimo() {
		mostrarEntidad((Articulo) ControladorArticulo.getInstance().findUltimo()); 
	}
	
	
	private void mostrarEntidad(Articulo a) {
		if(a != null) {
			jtfId.setText("" + a.getId());
			jtfCodigo.setText(a.getCodigo());
			jtfDescripcion.setText(a.getDescripcion());
			jtfStock.setText("" + a.getStock());
			jtfPrecio.setText("" + a.getPrecio());
			
			jtfColor.setText(a.getColor());
			if (a.getColor().length() == 7) {
				panel.setBackground(Color.decode(a.getColor()));
			}
			else {
				panel.setBackground(Color.WHITE);
			}
			
			
			for (int i = 0; i < jcbProveedor.getItemCount(); i++) {
				if (jcbProveedor.getItemAt(i).getId() == a.getProveedor().getId()) {
					jcbProveedor.setSelectedIndex(i);
				}
			}
		}
	}
	
	private void guardar() {
		Articulo a = new Articulo();
		a.setId(Integer.parseInt(jtfId.getText()));
		a.setCodigo(jtfCodigo.getText());
		a.setDescripcion(jtfDescripcion.getText());
		a.setStock(Integer.parseInt(jtfStock.getText()));
		a.setPrecio(Float.parseFloat(jtfPrecio.getText()));
		a.setColor(jtfColor.getText());
		a.setProveedor(((Proveedor)jcbProveedor.getSelectedItem()));
		
		ControladorArticulo.getInstance().actualizacion(a);
	}
	
}