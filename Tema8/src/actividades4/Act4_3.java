package actividades4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act4_3 extends JFrame {

	public static void main(String[] args) {
		
		new Act4_3();
		
	}
	
	private JCheckBox chkBilletes;
	private JCheckBox chkTransporte;
	private JCheckBox chkHotel;
	private JCheckBox chkCompleto;
	
	private int precioBilletes = 120;
	private int precioTransporte = 0;
	private int precioHotel = 0;
	private int precioCompleto = 0;
	
	private JLabel lblPrecio;
	
	public Act4_3() {
		
		super("Viajes Gorrión");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblOpciones = new JLabel("Opciones:               ");
		
		chkBilletes = new JCheckBox("Billetes de avión", true);
		chkTransporte = new JCheckBox("Transporte aeropuerto");
		chkHotel = new JCheckBox("Estancia en el hotel");
		chkCompleto = new JCheckBox("Pensión completa");
		
		lblPrecio = new JLabel("Precio total: 120€");
		
		chkBilletes.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (chkBilletes.isSelected()){
					precioBilletes = 120;
				} else if (!chkBilletes.isSelected()) {
					precioBilletes = 0;
				}
				
				lblPrecio.setText("Precio total: " + (precioBilletes+precioTransporte+precioHotel+precioCompleto) + "€");
			}
		});
		
		chkTransporte.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (chkTransporte.isSelected()){
					precioTransporte = 20;
				} else if (!chkTransporte.isSelected()) {
					precioTransporte = 0;
				}
				
				lblPrecio.setText("Precio total: " + (precioBilletes+precioTransporte+precioHotel+precioCompleto) + "€");
			}
		});
		
		chkHotel.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (chkHotel.isSelected()){
					precioHotel = 80;
				} else if (!chkHotel.isSelected()) {
					precioHotel = 0;
				}
				
				lblPrecio.setText("Precio total: " + (precioBilletes+precioTransporte+precioHotel+precioCompleto) + "€");
			}
		});
		
		chkCompleto.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (chkCompleto.isSelected()){
					precioCompleto = 50;
				} else if (!chkCompleto.isSelected()) {
					precioCompleto = 0;
				}
				
				lblPrecio.setText("Precio total: " + (precioBilletes+precioTransporte+precioHotel+precioCompleto) + "€");
			}
		});
		
		add(lblOpciones);
		
		add(chkBilletes);
		add(chkTransporte);
		add(chkHotel);
		add(chkCompleto);
		
		add(lblPrecio);
		
		setVisible(true);
		
	}
	
}
