/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nsfd;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;


/**
 *
 * @author Ellie
 */
public class Hyperlink extends JLabel {
    /*used to set up a hyperlink jLabelHyperlink to the webpage for the application providing 
      the user with instructions and access to further information
      https://networkscannerfordummies.wordpress.com/instructions/
    */
        private String url;
        private String html = "<html><a href=''>%s</a></html>";
        
        public Hyperlink(String text) {       
            this(text, null, null);
        }
     
        public Hyperlink(String text, String url) {
            this(text, url, null);
        }
        
        public void setURL(String url) {
            this.url = url;
        }
        
        public Hyperlink(String text, String url, String tooltip){
            super(text);
            this.url = url;
            setForeground(Color.BLUE.darker());
            setToolTipText(tooltip);
            //determines what is seen when you mouses over the created link
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            //changes the look of the cursor when you mouseover the link
            
            addMouseListener(new MouseAdapter() {
             
                public void mouseEntered(MouseEvent e) {
                    setText(String.format(html, text));
                }
             
                public void mouseExited(MouseEvent e) {
                    setText(text);
                }
             
                public void mouseClicked(MouseEvent e) {
                    try {
                     
                        Desktop.getDesktop().browse(new URI(Hyperlink.this.url));
                        //attempt to open link on browser
                     
                    } catch (IOException | URISyntaxException e1) {
                        //error message if link is broken
                            JOptionPane.showMessageDialog(Hyperlink.this,
                                "Could not open the hyperlink. Error: " + e1.getMessage(),
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }              
                }
            });
        }
    }
            
        
    

