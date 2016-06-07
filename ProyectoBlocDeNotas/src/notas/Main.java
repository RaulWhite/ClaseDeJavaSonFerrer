package notas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main extends JFrame implements ListSelectionListener {

	private Libreta libreta;

	private JList lstTitulos;
	private DefaultListModel modeloLista;
	private JTextField txtTitulo;
	private JTextArea txtDescripcion;
	private JButton btnGuardar;

	public static void main(String[] args) {
		new Main();
	}

	public Main() {

		super("Bloc de notas");
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		modeloLista = new DefaultListModel<String>();

		// MEN�.
		JMenuBar barraMenu = new JMenuBar();

		JMenuItem itemNuevaNota = new JMenuItem("Nueva nota");
		itemNuevaNota.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				crearNota();
			}
		});

		JMenuItem itemBorrarNota = new JMenuItem("Borrar nota");
		itemBorrarNota.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				borrarNotaSeleccionada();
			}
		});
		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemNuevaNota);
		menuArchivo.addSeparator();
		menuArchivo.add(itemBorrarNota);
		menuArchivo.addSeparator();
		menuArchivo.add(itemSalir);

		barraMenu.add(menuArchivo);

		setJMenuBar(barraMenu);

		// PANEL CENTRAL-IZQUIERDO.
		JPanel panelIzquierdo = new JPanel();

		JLabel lblNota = new JLabel("Notas");

		lstTitulos = new JList(modeloLista);
		lstTitulos.addListSelectionListener(this);
		JScrollPane panelTitulos = new JScrollPane(lstTitulos);
		panelTitulos.setPreferredSize(new Dimension(280, 320));
		panelTitulos.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		panelIzquierdo.add(lblNota);
		panelIzquierdo.add(panelTitulos);

		panelIzquierdo.setBorder(new EmptyBorder(5, 5, 0, 0));

		// PANEL CENTRAL-DERECHO.
		JPanel panelDerecho = new JPanel();

		JLabel lblTitulo = new JLabel("T�tulo");
		txtTitulo = new JTextField();
		txtTitulo.setPreferredSize(new Dimension(280, 25));

		JLabel lblDescripcion = new JLabel("Descripci�n");
		txtDescripcion = new JTextArea();
		txtDescripcion.setPreferredSize(new Dimension(280, 269));
		txtDescripcion.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setWrapStyleWord(true);

		panelDerecho.add(lblTitulo);
		panelDerecho.add(txtTitulo);
		panelDerecho.add(lblDescripcion);
		panelDerecho.add(txtDescripcion);

		panelDerecho.setBorder(new EmptyBorder(5, 0, 0, 0));

		// PANEL CENTRAL-COMPLETO.
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new GridLayout(1, 2));

		panelCentral.add(panelIzquierdo);
		panelCentral.add(panelDerecho);

		// PANEL INFERIOR.
		JPanel panelInferior = new JPanel();
		panelInferior.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnGuardar = new JButton("Guardar");
		btnGuardar.setEnabled(false);
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarNotaSeleccionada();
			}
		});
		panelInferior.add(btnGuardar);

		// VENTANA COMPLETA
		add(panelCentral, BorderLayout.CENTER);
		add(panelInferior, BorderLayout.SOUTH);

		setVisible(true);

		libreta = new Libreta();

		cargarNotas();
	}

	public void cargarNotas() {
		Nota[] notas = libreta.getNotas();

		// modeloLista.clear();

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] != null) {
				modeloLista.addElement(notas[i].getTitulo());
			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		int notaSeleccionada = lstTitulos.getSelectedIndex();

		// Comprobamos que haya una nota seleccionada. Si no, nos podr�a dar un
		// error al recargar la lista o al borrar un elemento de la misma.
		if (notaSeleccionada >= 0) {
			txtTitulo.setText(libreta.getNotas()[notaSeleccionada].getTitulo());
			txtDescripcion.setText(libreta.getNotas()[notaSeleccionada].getDescripcion());
			btnGuardar.setEnabled(true);
		}

	}

	public void guardarNotaSeleccionada() {

		int notaSeleccionada = lstTitulos.getSelectedIndex();
		Nota[] notas = libreta.getNotas();
		notas[notaSeleccionada].setTitulo(txtTitulo.getText());
		notas[notaSeleccionada].setDescripcion(txtDescripcion.getText());

		// Actualizamos el JList
		modeloLista.set(lstTitulos.getSelectedIndex(), notas[notaSeleccionada].getTitulo());

		// Guardamos los cambios en el disco.
		libreta.guardarNotas();
	}

	public void crearNota() {

		// TODO: Crear nueva nota, a�adirla a la libreta y mostrar su t�tulo al
		// final del JList.
		// Seleccionar la nueva nota en el JList.
		// Borrar la casilla de t�tulo y pasarle el foco a la casilla de t�tulo.

	}

	public void borrarNotaSeleccionada() {
		// Guardamos la posici�n del elemento seleccionado del JList.
		int posNotaSeleccionada = lstTitulos.getSelectedIndex();
		if (posNotaSeleccionada < 0) {
			return;
		}

		// Borramos la nota de la libreta
		libreta.delNota(posNotaSeleccionada);

		// Borramos la nota del JList.
		modeloLista.remove(posNotaSeleccionada);

		// Borramos las casillas de t�tulo y descripci�n.
		txtTitulo.setText("");
		txtDescripcion.setText("");

		// Guardamos los cambios en el disco.
		libreta.guardarNotas();
	}
}
