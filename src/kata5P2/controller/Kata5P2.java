/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5P2.controller;

import java.io.IOException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;

/**
 *
 * @author Entrar
 */
public class Kata5P2 {

    /**
     * @param args the command line arguments
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
    
    private void input() throws IOException {
        filename = "/home/niko/NetBeansProjects/Kata5P2/src/kata5P2/controller/emails.txt";
        mailList = MailListReader.read(filename);
    }
    
    private void process() throws Exception {
        histogram = MailHistogramBuilder.build(mailList);
    
    }
    
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    
    
    }
    
}
