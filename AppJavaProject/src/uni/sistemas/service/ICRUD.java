/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.service;

import java.util.List;

/**
 *
 * @author EQUIPO
 */
public interface ICRUD<T> {

    void Create(T obj) throws Exception;

    List<T> Read() throws Exception;
        List<T> Read2() throws Exception;

    void Update(T obj) throws Exception;

    void Delete(T obj) throws Exception;

   T Find(String c) throws Exception;

}
