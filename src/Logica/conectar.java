/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
/**public class Conexion {
    public String db="dbcentroagricola";
    public String url="jdbc:mysql://localhost:3306/"+db;
    public String user="root";
    public String pass="";

    public Conexion() 
    {
        
    }
    
    
    public Connection conectar()
    {
        Connection link=null;
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url,this.user,this.pass);
            
        }catch(ClassNotFoundException | SQLException e){
        
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return link;
        
    }*/
    
    
   
    public class conectar
{
        Connection conect=null;
        
        public Connection conexion()
        {
            try{
               Class.forName("org.gjt.mm.mysql.Driver"); 
                conect=DriverManager.getConnection("jdbc:mysql://localhost/dbcentroagricola","root","");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"EROR"+e);
            }
            return conect;
        }
}

