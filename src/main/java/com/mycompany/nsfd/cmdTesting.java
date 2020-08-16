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
public class cmdTesting {
    
    public static void main(String args[]) {
    
    ProcessBuilder test1 = new ProcessBuilder();
    
    String cmd ="netsh WLAN show interface ";
    //shosw current network interface information
    
    test1.command("cmd.exe", "/C", cmd);
    
    try{
        Process processTest = test1.start();
        
        StringBuilder output = new StringBuilder();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(processTest.getInputStream()));
        
        String line;
        
        while ((line = reader.readLine()) != null){
            //now chck if the line is security related
           String reason; 
           if(line.contains("Radio type")){
               reason = "The standards that govern the protocol for your WiFi, "
                       + "most importantly for security. The common are 802.11n "
                       + "or 802.11ac. If you have a differnt sresult see the "
                       + "website for further information. ";
               output.append(line + "\n"); 
               output.append(reason + "\n" + "\n");
           }else if(line.contains("Authentication")){
               reason = "";
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
    }catch(IOException e){
        e.printStackTrace();
    }catch(InterruptedException e){
        e.printStackTrace();
    }

    
                
   }
    
}
