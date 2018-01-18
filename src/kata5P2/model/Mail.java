/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5P2.model;

/**
 *
 * @author niko
 */
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    
    public String getdomain() {
        String[] splitted = mail.split("@");
        return splitted[1];
    }
    
}
