/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elliot-VS
 */
public class GenerateJft {

    public static void saveJft(String file, String content) throws Exception {

        new Thread(new Runnable() {
            @Override
            public void run() {
                
                BufferedWriter bw = null;
                try {
                    bw = new BufferedWriter(new FileWriter(file));
                    bw.write(content);
                    bw.flush();
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(GenerateJft.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GenerateJft.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        },"save as jft").start();
    }

}
