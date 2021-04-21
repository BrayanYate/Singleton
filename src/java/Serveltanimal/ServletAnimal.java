package Serveltanimal;

import Logica.Animal;
import Logica.Gato;
import Logica.Conejo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletAnimal", urlPatterns = {"/ServletAnimal"})
public class ServletAnimal extends HttpServlet {
    
    static Animal a;
    public static void liscov(Animal animal){
      a = animal;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        if(request.getParameter("animal").equals("Gato")){
            Gato gato = Gato.getSingleton();
            liscov(gato);
        }else if(request.getParameter("animal").equals("Conejo")){
            Conejo conejo = Conejo.getSingleton();
            liscov(conejo);
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Animal</title>");  
            out.println("<link href=\"Css/estilo2.css\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<img src=\"img/" +a.getImg()+".jpeg\"align=\"left\">");
            out.println("<h>Genero  :" +a.getGenero() + "</h>");
            out.println("<br>");
            out.println("<br>");
            out.println("<h>Habitat :" +a.getHabitat() + "</h>");
            out.println("<br>");
            out.println("<br>");
            out.println("<h>Color   :" +a.getColor() + "</h>");
            out.println("<br>");
            out.println("<br>");
            out.println("<h>Comportamiento  :" +a.getComportamiento()+ "</h>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}