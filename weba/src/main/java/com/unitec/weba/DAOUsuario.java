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
public class DAOUsuario {
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
    
    public DAOUsuario(){
        
        
    }
    
    
    //Creamo el insert
    
    public void  guardar(Usuario u) throws Exception{
    //aqui poner el codifo de tu guardado
        //despues invocas el metodo cerrarTodo
      
        session.save(u);
        cerrarTodo();
              
        
    }
    
    
    
    //Creamos el update
    public void actualizar(Usuario u)throws Exception{
        
       
        
    }
    
    //creamos el buscar todos
    public  List<Usuario> buscarTodos () throws Exception{
        return null;
    }
    
    
    //creamos el buscar por id
    public Usuario buscarPorId (Integer id) throws Exception{
        return null;
        
    }
    
    //creamos el autenticar

    
    public boolean autenticar (Usuario u)throws Exception{
        
        return false;
    }
}
