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
public class Alumno extends persona {
   private String NumeroCuenta;
   private String Carrera;
   private int Semestre;

    public Alumno() {
    }

    public Alumno(String NumeroCuenta, String Carrera, int semestre,
           String Nombre,int Edad, int Genero, float Altura){
        super(Nombre, Edad,Genero,Altura);
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
        this.Semestre = semestre;
    }

    public Alumno(String NumeroCuenta, String Carrera, int Semestre) {
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
        this.Semestre = Semestre;   
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "NumeroCuenta=" + NumeroCuenta + ", Carrera=" + Carrera + ", Semestre=" + Semestre + '}';
    }
    
}
    
   