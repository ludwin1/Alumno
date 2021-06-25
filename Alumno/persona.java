/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author Mireya
 */
public class persona {
    private String Nombre;
    private int Edad;
    private int Genero;
    private float Altura;

    public persona() {
    }

    public persona(String Nombre, int Edad, int Genero, float Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getGenero() {
        return Genero;
    }

    public void setGenero(int Genero) {
        this.Genero = Genero;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Genero=" + Genero + ", Altura=" + Altura + '}';
    }
    
    
    
}
