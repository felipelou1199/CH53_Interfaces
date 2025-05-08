package com.generation.classes;

public class Trapecio  implements FiguraGeometrica{
	private String nombre;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	private double lado;
	public Trapecio(String nombre, double baseMenor, double baseMayor, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
		this.lado = lado;
	}

	public double calcularArea() {
		return (getBaseMayor()*getBaseMenor()*getAltura()/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getBaseMenor()+getBaseMayor())+(getLado()*2));
	}//calcularPerimetro
	
	

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getBaseMenor() {
		return baseMenor;
	}//getBaseMenor

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor

	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor

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
		return "Trapecio [nombre=" + nombre + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura="
				+ altura + ", lado=" + lado + "]";
	}//toString
	
}//class Trapecio
