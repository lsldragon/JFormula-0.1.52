/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Elliot-VS
 */
public class FileUtil {

    private static StringBuffer fileContent = new StringBuffer();

    public FileUtil() {

    }

    public static String readFile(String file) throws Exception {

        fileContent.delete(0, fileContent.length());

        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = bReader.readLine()) != null) {
            fileContent.append(line + ConstantsUI.LINE_SEPARATOR);
        }
        bReader.close();
        return new String(fileContent);

    }

    public static String readFile(File file) throws Exception {

        fileContent.delete(0, fileContent.length());

        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = bReader.readLine()) != null) {
            fileContent.append(line + ConstantsUI.LINE_SEPARATOR);
        }
        bReader.close();
        return new String(fileContent);

    }
}
