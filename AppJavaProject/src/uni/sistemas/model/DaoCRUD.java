/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uni.sistemas.entity.Empleado;
import uni.sistemas.service.ICRUD;

/**
 *
 * @author EQUIPO
 */
public class DaoCRUD implements ICRUD<Empleado> {

    FileReader fr;
    FileWriter fw;
    File f;
    PrintWriter pw;

    BufferedReader br;
    String archivo = "Empleados.txt";
    List<Empleado> arr = new ArrayList<>();
    List<Empleado> del = new ArrayList<>();
    int cont = 0;
    int cont1 = 0;
    String dato = null;

    @Override
    public void Create(Empleado obj) throws Exception {

        cont++;
        obj.setCodigo("E00" + cont + "");

        System.out.println(obj.toString());
        arr.add(obj);
        System.out.println(arr.size());
    }

    @Override
    public List<Empleado> Read2() throws Exception {
     
        //crear objeto para leer datos
       
        return arr;
    }

    @Override
    public List<Empleado> Read() throws Exception {

        List<Empleado> lista = new ArrayList<>();

        //abrir archivo para lectura
        //return arr;
        try {
            //abrir archivo para lectura
            fr = new FileReader(archivo);
            //crear objeto para leer datos
            br = new BufferedReader(fr);
            // leer la primera linea
            dato = br.readLine();

            while (dato != null) {
                Empleado e = new Empleado();
                // objeto para partien en pedasos el dato
                StringTokenizer token = new StringTokenizer(dato, ",");
                //asignar valores al objeto alu
                e.setCodigo(token.nextToken());
                System.out.println(e.getCodigo());
                e.setNombre(token.nextToken());
                System.out.println(e.getNombre());
                e.setApellido(token.nextToken());
                System.out.println(e.getApellido());
                e.setCargo(token.nextToken());
                System.out.println(e.getCargo());
                e.setArea(token.nextToken());
                System.out.println(e.getArea());
                e.setSueldoT(Double.parseDouble(token.nextToken()));
                System.out.println(e.getSueldoT());
                e.setSueldoN(Double.parseDouble(token.nextToken()));
                System.out.println(e.getSueldoN());
                System.out.println(lista.size());
                e.setDescuento(Double.parseDouble(token.nextToken()));
                cont1++;
                System.out.println(cont1);
             

                //adicionar a la coleccion
                lista.add(e);
                //lee el siguiente dato
                dato = br.readLine();
            }   cont = cont1;
            br.close();
        } catch (IOException | NumberFormatException e) {
            throw e;
        } finally {
            fr.close();
        }
        return lista;

    }

    @Override
    public void Update(Empleado obj) throws Exception {
        // Find(obj.getCodigo());
        int index = 0;
        for (Empleado empleado : arr) {
  System.out.println(empleado.getCodigo());
            if (empleado.getCodigo().equals(obj.getCodigo())) {

                break;

            }
            index++;
        }
        System.out.println(index);
        System.out.println(obj.getNombre());

        arr.set(index, obj);

    }

    @Override
    public void Delete(Empleado obj) throws Exception {
        int index = -1;
        for (Empleado empleado : arr) {
            index++;
            if (empleado.getCodigo().equals(obj.getCodigo())) {
                del.add(empleado);
                break;
            }
        }
        System.out.println(index);
        System.out.println(obj.getNombre());

        arr.remove(index);

    }

    @Override
    public Empleado Find(String s) throws Exception {

        for (Empleado empleado : arr) {
            if (empleado.getCodigo().equals(s)) {
                return empleado;
            }
        }
        return null;
    }

    public List<Empleado> getArr() {
        return arr;
    }

    public void setArr(List<Empleado> arr) {
        this.arr = arr;
    }

}
