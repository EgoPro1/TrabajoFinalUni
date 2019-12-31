/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import java.util.List;
import uni.sistemas.entity.Empleado;
import uni.sistemas.model.DaoCRUD;
import uni.sistemas.util.Constante;

/**
 *
 * @author EQUIPO
 */
public class Controller {

    Empleado e = new Empleado();
    DaoCRUD contr = new DaoCRUD();
   

    public void EmpleadoAgregar(  Empleado em) {
        try {
            e=em;
             contr.Create(e);
        } catch (Exception e) {
        }
       
        
    }

    public void EmpleadoActualizar( Empleado em) {
        try { 
            e=em;
              contr.Update(e); 
             
              
        } catch (Exception e) {
        }
      
    }

    public void EmpleadoEliminar( Empleado em) {
        try {
             e=em;
            contr.Delete(e);
        } catch (Exception e) {
        }
        
    }

    public List<Empleado> EmpleadoMostrar() {
        try {
              return contr.Read();
        } catch (Exception e) {
            return null;
        }
        
      
    }public List<Empleado> EmpleadoMostrar2() {
        try {
              return contr.Read2();
        } catch (Exception e) {
            return null;
        }
        
      
    }


    public static String Cargo(int n) {
        switch (n) {
            case 1:
               return "Director Ejecutivo";
              

            case 2:
                 return"Jefe de marca";
                
              
            case 3:
                return"Recepcionista";
                
            case 4:
                  return"Asistente personal";
                
                
            

            default:
                throw new AssertionError();
        }
    }

     public static double Sueldo(Double s)
    {
        if (s>1800) {
           return (s*(1-Constante.descuento));
        }
        return s;
    }
    public static double Descuento(Double s)
    {
        if (s>1800) {
           return (s*Constante.descuento);
        }
        return 0;
    }
    public Empleado existe(String s) throws Exception{
            {
                                
                return contr.Find(s);
            }
    }
    /*    public Controller() {*/    

    public void setE(Empleado e) {
        this.e = e;
    }

    public void setContr(DaoCRUD contr) {
        this.contr = contr;
    }

    public Empleado getE() {
        return e;
    }

    public DaoCRUD getContr() {
        return contr;
    }

}
