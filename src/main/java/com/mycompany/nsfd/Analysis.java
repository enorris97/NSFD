/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nsfd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ellie
 */
public class Analysis {
    //run all of the anaylsis components from here
    
    public String Analysis(){
        ProcessBuilder test1 = new ProcessBuilder();
        
    
        String cmd ="netsh WLAN show interface ";
    //show current network interface information
    
        test1.command("cmd.exe", "/C", cmd);
    
        try{
            Process processTest = test1.start();
        
            output = new StringBuilder();
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(processTest.getInputStream()));
        
            String line;
        
            while ((line = reader.readLine()) != null){
            //now check if the line is security related, and returns why
                String reason; 
                if(line.contains("Radio type")){
                    reason = "The standards that govern the protocol for your WiFi, "
                            + "most importantly for security. The common are 802.11n "
                            + "or 802.11ac. If you have a differnt result see the "
                            + "website for further information. ";
                    output.append(line + "\n"); 
                    output.append(reason + "\n" + "\n");
                }else if(line.contains("Authentication")){
                    reason = "The type of aithentication used can effect your security. X is the standard that should be here";
                    output.append(line + "\n"); 
                     output.append(reason +"\n");
                }else if(line.contains("Cipher")){
                    reason = "";
                    output.append(line + "\n"); 
                    output.append(reason +"\n");;
                }else if(line.contains("Connection mode")){
                    reason = "";
                    output.append(line + "\n"); 
                    output.append(reason +"\n");
                }else if(line.contains("Channel")){
                    reason = "";
                    output.append(line + "\n"); 
                    output.append(reason +"\n");
                }
                }
        
            int exitval = processTest.waitFor();
            if (exitval ==0){
                System.out.println("Command exists");
                System.out.print(output);
                System.exit(0);
            }
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
        
            return output.toString();
    }
    
    
    StringBuilder output;
}
