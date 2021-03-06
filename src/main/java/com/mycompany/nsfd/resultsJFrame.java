/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nsfd;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ellie
 */
public class resultsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form resultsJFrame
     */
    public resultsJFrame() {
        initComponents();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResults = new javax.swing.JTextArea();
        jLabelResults = new javax.swing.JLabel();
        jButtonWebLink = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaResults.setEditable(false);
        jTextAreaResults.setColumns(20);
        jTextAreaResults.setLineWrap(true);
        jTextAreaResults.setRows(5);
        jTextAreaResults.setText(Analysis());
        jTextAreaResults.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaResults);

        jLabelResults.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelResults.setText("Results:");

        jButtonWebLink.setText("Website");
        jButtonWebLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWebLinkActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonRestart.setText("Restart");
        jButtonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonWebLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRestart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResults, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResults, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWebLink)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonRestart))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonWebLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWebLinkActionPerformed
        // TODO add your handling code here:
        //open application website on instruction page
         try {
                     
                        Desktop.getDesktop().browse(new URI("https://networkscannerfordummies.wordpress.com/instructions/"));
                        //attempt to open link in browser
                     
                    } catch (IOException | URISyntaxException e1) {
                        //error message if link is broken
                            JOptionPane.showMessageDialog(null,
                                "Could not open the hyperlink. Error: " + e1.getMessage(),
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_jButtonWebLinkActionPerformed

    private void jButtonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestartActionPerformed
        // TODO add your handling code here:
        //opens a new frame which rereuns the analysis
        new resultsJFrame().setVisible(true);
            
        //closes current frame
        dispose();
    }//GEN-LAST:event_jButtonRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resultsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    private String Analysis() {
        StringBuilder output = null;
        ProcessBuilder test1 = new ProcessBuilder();
        
    
        String cmd ="netsh WLAN show interface ";
        //show current network interface information command
    
        test1.command("cmd.exe", "/C", cmd);
        //set format for command
    
        try{
        //attempt to run the command in shell
            Process processTest = test1.start();
        
            output = new StringBuilder();
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(processTest.getInputStream()));
            //read the output from the shell
        
            String line;
        
            while ((line = reader.readLine()) != null){
            //now check if the line is security related, and returns reasons with line if true
                String reason; 
                if(line.contains("Radio type")){
                    reason = "The standards that govern the protocol for your WiFi, "
                            + "most importantly for security. The common are 802.11n "
                            + "or 802.11ac. If you have a differnt result see the "
                            + "website for further information. ";
                    output.append(line + "\n"); 
                    output.append(reason + "\n" + "\n");
                }else if(line.contains("Authentication")){
                    reason = "The type of athentication method used can effect your "
                            + "security, as some are more secure than others, as "
                            + "well as effecting other settings that can be enabled."
                            + " WPA2 is the most common current standard, but are "
                            + "acceptible as well. If you network has no authentication, "
                            + "anyone can connect to the network which means anyone "
                            + "can access your data on the network.";
                    output.append(line + "\n"); 
                    output.append(reason + "\n" + "\n");
                }else if(line.contains("Cipher")){
                    reason = "The encryption protocol for the network, effecting "
                            + "data privacy, integrity and authentication. Should "
                            + "be CCMP if the Authentication is WPA2 as they work "
                            + "together other wise there could be breach in your "
                            + "security. Privacy, authenticity and integrity are "
                            + "the pillars of network security.";
                    output.append(line + "\n"); 
                    output.append(reason + "\n" + "\n");
                }else if(line.contains("Channel")){
                    reason = "Although not directly a security feature, if your "
                            + "network is slow you may want to change the channel "
                            + "rather than downloading unknown software from the "
                            + "internet claiming to speed up your network.";
                    output.append(line + "\n"); 
                    output.append(reason + "\n" + "\n");
                }
            }
        /*
            //used to print results to console and break during method testing
            int exitval = processTest.waitFor();
            if (exitval ==0){
                System.out.println("Command exists");
                System.out.print(output);
                System.exit(0);
            }
            */
        }catch(IOException e){
            e.printStackTrace();
        }
        
            return output.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRestart;
    private javax.swing.JButton jButtonWebLink;
    private javax.swing.JLabel jLabelResults;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResults;
    // End of variables declaration//GEN-END:variables
    //jTextArea - where the results of the analysis on the network are displayed
   
}

    
    
