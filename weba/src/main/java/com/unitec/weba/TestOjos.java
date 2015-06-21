
package com.unitec.weba;
//falta la biblioteca de sesion y transaccion
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TestOjos {

       public static void main(String[] args)throws Exception{
       
           System.out.println("Probaremos todas las operaciones sql");
           //primer paso, crear el SessionFactory
           //------falta clase hibernateutilidades
           SessionFactory factory = HibernateUtilidades.getSessionFactory();
           
           //Obtenemos la apertura de sesion actual
           Session sesion = factory.openSession();
           
           //creamos la transaccion
            Transaction tranza=sesion.beginTransaction();
           
           //nos apuramos a hacer una transaccion
            
            Usuario u =new Usuario();
                u.setEmail("ax@gmail.com");
                u.setNombre("Mariana C");
                u.setLogin("mariana");
                u.setPassword("123456");
                
                DAOUsuario daou = new DAOUsuario();
                daou.guardar(u);
                
               //________________________ sesion.save(u);
                //Liberar la transaccion y cerrar la sesion
                //_______________________tranza.commit();
                //________________________sesion.close();
                 
              
              //________________________________________________________________
    /*UPDATE
       Usuario u=new Usuario();
       u.setIdUsuario(1);
       u.setLogin("raton");
       u.setNombre("Axel Hernandez");
       u.setEmail("ax@gmail.com");
       u.setPassword("123456");
       sesion.update(u);
       tranza.commit();
       sesion.close();
       
        System.out.println("Se actualizo correctamente");
       _________________________________________________________________
       */
       
         
            /*
       Usuario u = (Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
       
       tranza.commit();
       sesion.close();
           System.out.println("El usuario buscado tiene nombre: " +u.getNombre());
            
        */
            //enlista todo lo que va haber en la tabla
           
            
            /*
            
            List<Usuario> usuarios = sesion.createCriteria(Usuario.class).list();
             tranza.commit();
       sesion.close();
       for(Usuario usu:usuarios){
            System.out.println("Usuarios encontrados: " +usu.getNombre());
            
       }
    
       
       
       
       */
       
       }}
