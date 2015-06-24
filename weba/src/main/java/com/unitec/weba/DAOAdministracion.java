/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class DAOAdministracion {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
   static{
        factory = HibernateUtilidades.getSessionFactory();
                    session = factory.openSession();
                    tranza = session.beginTransaction();
    }
    
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
                
    }
    
    public DAOAdministracion(){
        
        
    }
    
    
    //Creamo el insert
    
    public void  guardar(Administracion u) throws Exception{
    //aqui poner el codifo de tu guardado
        //despues invocas el metodo cerrarTodo
      
        session.save(u);
        cerrarTodo();
              
        
    }
    
    
    
    //Creamos el update
    public void actualizar(Administracion u)throws Exception{
        
       
        
    }
    
    //creamos el buscar todos
    public  List<Administracion> buscarTodos () throws Exception{
        return null;
    }
    
    
    //creamos el buscar por id
    public Administracion buscarPorId (Integer id) throws Exception{
        return null;
        
    }
    
    //creamos el autenticar

    
    public boolean autenticar (Administracion u)throws Exception{
        
        return false;
    }
}
