/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5P2.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;

/**
 *
 * @author niko
 */
public class MailListReaderBBDD {
    public static List<Mail> read() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
    
        List<Mail> mailList = new ArrayList<>();
        String mail;
            
        
        Class.forName("org.sqlite.JDBC"); 
        Connection con = DriverManager.getConnection("jdbc:sqlite:/home/niko/Escritorio/KATA5");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from MAIL");
    
    
        while (rs.next()) {
            mail = rs.getString("mail");
            if (mail.indexOf('@')==-1) {
            //No hacemos nada si el correo no contiene "@"
            
            } else {
            //Añadimos el correo a la lista
            mailList.add(new Mail(mail));
                System.out.println(mail);
            }
        }

        return mailList;
    }
    
}
