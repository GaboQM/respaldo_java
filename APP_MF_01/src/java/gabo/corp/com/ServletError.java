/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabo.corp.com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 *
 * @author gaboqm
 */
@WebServlet(name = "ServletError", urlPatterns = {"/ServletError"})
public class ServletError extends GenericServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        public ServletError(){
            super();
        }



    /**
     * Returns a short description of the servlet.
     *
     * @param req
     * @param res
     * @return a String containing servlet description
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
   

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
            String cE = req.getParameter("codigoError");
            if(cE.equals("104")){
                res.setContentType("text/html;charset=UTF-8");
                res.getWriter().print("Ingrese los datos en user");
                
            }
    }

}
