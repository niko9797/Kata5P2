/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5P2.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReaderBBDD;

/**
 *
 * @author Entrar
 */
public class Kata5P2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    public static void main(String[] args) throws Exception {
        Kata5P2 kata5 = new Kata5P2();
        kata5.execute();
        
    }
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    
    private void execute () throws Exception {
        input();
        process();
        output();
    }
    
    private void input() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        mailList = MailListReaderBBDD.read();
    }
    
    private void process() throws Exception {
        histogram = MailHistogramBuilder.build(mailList);
    
    }
    
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    
    
    }
    
}
