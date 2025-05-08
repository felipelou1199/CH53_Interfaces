package com.generation.classes;

public class Cuadrado implements FiguraGeometrica {
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	
	
	//forma de hacer 2
	//private double lado;
//	public cuadrado(String nombre,double lado) {
//		this.nombre = nombre;
//		this.lado = lado;
//	}
	public Cuadrado(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor 
	
	public double calcularArea() {
		return Math.pow(getLado(),2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return getLado()*4;
	}//calcularPerimetro
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString
	
	

}//class Cuadrado
