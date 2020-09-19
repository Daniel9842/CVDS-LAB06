package edu.eci.cvds.servlet;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.eci.cvds.servlet.*;
import edu.eci.cvds.servlet.model.Todo;
import java.util.*;
import java.io.*;
import java.net.*;

@WebServlet(
    urlPatterns = "/webappServlet"
)
public class httpServlet extends HttpServlet{
    static final long serialVersionUID = 35L;
    ArrayList<Todo> datos = new ArrayList<Todo>();

    @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Writer responseWriter = resp.getWriter();
       try{
       	       Optional<String> optNumberId = Optional.ofNullable(req.getParameter("numberId"));
	       Integer numberId = (Integer.parseInt(optNumberId.get()));
	       Todo varT = Service.getTodo(numberId); 
               datos.add(varT);
               resp.setStatus(HttpServletResponse.SC_OK);
               responseWriter.write(Service.todosToHTMLTable(datos));
               responseWriter.flush();
	}catch(FileNotFoundException e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("no encontrado");
	}catch(NumberFormatException e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("requerimiento inválido");
	}catch(MalformedURLException e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("error interno en el servidor");
	}catch(Exception e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("error interno en el servidor");
	}
   }
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
   	Writer responseWriter = resp.getWriter();
       try{
       	       Optional<String> optNumberId = Optional.ofNullable(req.getParameter("numberId"));
	       Integer numberId = (Integer.parseInt(optNumberId.get()));
	       Todo varT = Service.getTodo(numberId); 
               datos.add(varT);
               resp.setStatus(HttpServletResponse.SC_OK);
               responseWriter.write(Service.todosToHTMLTable(datos));
               responseWriter.flush();
	}catch(FileNotFoundException e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("no encontrado");
	}catch(NumberFormatException e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("requerimiento inválido");
	}catch(MalformedURLException e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("error interno en el servidor");
	}catch(Exception e){
	       resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	       responseWriter.write("error interno en el servidor");
	}
   }	
}