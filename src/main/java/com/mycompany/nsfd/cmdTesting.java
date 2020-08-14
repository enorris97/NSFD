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
            output.append(line + "\n");  
        }
        
        int exitval = processTest.waitFor();
        if (exitval ==0){
            System.out.print("Command exists");
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
