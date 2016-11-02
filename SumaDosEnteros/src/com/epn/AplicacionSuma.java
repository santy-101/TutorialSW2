package com.epn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplicacionSuma {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x, y;
		System.out.println("Ingrese el primer Entero:");
		x = Integer.parseInt( br.readLine());
		
		System.out.println("Ingrese el segundo Entero: ");
		y= Integer.parseInt( br.readLine());
		
		Entero numero1 = new Entero(x, y);
		
		System.out.println("El resultado de la suma de los dos enteros es: " + numero1.sumar());

	}

}