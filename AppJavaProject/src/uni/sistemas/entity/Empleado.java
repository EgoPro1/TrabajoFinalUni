/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.entity;

/**
 *
 * @author EQUIPO
 */
public class Empleado {

    private String codigo;
    private String nombre;
    private String apellido;
    private String cargo;
    private String area;

    private double sueldoT;
    private double sueldoN;
    private double descuento;

    public Empleado(String codigo, String nombre, String apellido, String cargo, String area, double sueldoT, double sueldoN, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.area = area;
        this.sueldoT = sueldoT;
        this.sueldoN = sueldoN;
        this.descuento = descuento;
    }

    public Empleado() {

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setSueldoT(double sueldoT) {
        this.sueldoT = sueldoT;
    }

    public void setSueldoN(double sueldoN) {
        this.sueldoN = sueldoN;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public String getArea() {
        return area;
    }

    public double getSueldoT() {
        return sueldoT;
    }

    public double getSueldoN() {
        return sueldoN;
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return  codigo + "," + nombre + "," + apellido + "," + cargo + "," + area + "," + sueldoT + "," + sueldoN + "," + descuento + "\n";

    }

}
