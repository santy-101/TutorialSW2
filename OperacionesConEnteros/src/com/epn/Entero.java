package com.epn;

public class Entero {
	
	private int x;
	private int y;
	
	
	public Entero(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int sumar()
	{
				
		return ( this.x+this.y);
		
	}
	
	public int restar()
	{
		return (this.x-this.y);
	}
	
	public int multiplicar()
	{
		return (this.x*this.y);
	}

}