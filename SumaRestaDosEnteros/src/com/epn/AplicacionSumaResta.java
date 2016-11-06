package com.epn;

import java.io.IOException;
import javax.swing.JOptionPane;

public class AplicacionSumaResta {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int x, y;
		x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer entero: "));
		y= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo entero: "));


		Entero numero1 = new Entero(x, y);
		JOptionPane.showMessageDialog(null, "La suma de: \n"+x+" + "+y+" = "+numero1.sumar());
		JOptionPane.showMessageDialog(null, "La resta de: \n"+x+" - "+y+" = "+numero1.restar());

	}
}