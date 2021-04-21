<%-- 
    Document   : index
    Created on : 20/04/2021, 9:36:54 p. m.
    Author     : by
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Animales</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Css/estilo.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <form action="ServletAnimal" method="POST" >
                <select class ="select-css" name="animal">
                    <option>Gato</option> 
                    <option>Conejo</option> 
                </select>
                <input type="submit" value="Consultar">
            </form>
        </div>
    </body>
</html>
