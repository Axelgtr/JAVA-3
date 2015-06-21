/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;//clases de java empresarial
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class ServletAutenticar extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)//Por el request sale toda la info.
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //aqui seguiria la capa model, donde nos indica si la autenticacion fue exitosa.
        
        
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        
        //Creamos un model.
        Usuario u=new Usuario();
        //Ajustamos su login y password
        u.setLogin(login);
        u.setPassword(password);
        //Redireccionamineto del servlet
        ModeloAutenticar modelo=new ModeloAutenticar();
        if(modelo.autenticar(u)){
            RequestDispatcher despachador=request.getRequestDispatcher("/bienvenido.jsp");// ruta que se va a despachar
        despachador.forward(request, response);//ya se despacha
        }else{
            RequestDispatcher despachador=request.getRequestDispatcher("/error.jsp");// ruta que se va a despachar
        despachador.forward(request, response);
        }
    }
}