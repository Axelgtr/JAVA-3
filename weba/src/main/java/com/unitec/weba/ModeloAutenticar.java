
package com.unitec.weba;

public class ModeloAutenticar {
    public boolean autenticar(Usuario u){
        boolean autenticado=false;
        //Autenticamos sin base de datos.
        if (u.getLogin().equals("axel")&&u.getPassword().equals("axel")){
            autenticado=true;
        }
        
        return autenticado;
    }
    
}
