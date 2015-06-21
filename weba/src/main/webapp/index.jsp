<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingresa tus datos</h1>
        
                <!-- ESTO RECONOCE EL CODIGO JAVA DENTRO DEL HTML <% %>    -->
        <%  
            int edad=23;
            out.println("tu edad es:   " + edad);
            %>
        
        
            <form action="autenticar" method="post"> 
            login<br>   <!--etiqueta-->
            <input type="text" name ="login"> <br>  <!--cuadro de texto-->
            <p>Password.</p>
            <input type="password" name="password"><br>
            <input type="submit" value="ingresar">  <!--boton-->
        </form>
    </body>
</html>
