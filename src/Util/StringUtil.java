/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Elliot-VS
 */
public class StringUtil {
    
    // windows os works
    public static String broswerPathString(String uri) {

        String[] subStrings = uri.split("\\\\");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < subStrings.length - 1; i++) {
            sb.append(subStrings[i] + "/");
        }
        sb.append(subStrings[subStrings.length - 1]);
        return new String(sb);
    }

}
