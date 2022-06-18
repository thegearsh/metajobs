/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

/**
 * Web application lifecycle listener.
 *
 * @author Lungh
 * 
 * 
 */
  
        
@WebListener()
public class JobServletListener implements ServletContextListener {
    

    @Override
   
      public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        String url = sc.getInitParameter("url");
        String username = sc.getInitParameter("username");
        String password = sc.getInitParameter("password");
        String database = sc.getInitParameter("database");

        BasicDataSource datasource = new BasicDataSource();
        datasource.setUrl(url + database);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setMinIdle(50);
        datasource.setMaxIdle(200);
        sc.setAttribute("joblisting", datasource);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
