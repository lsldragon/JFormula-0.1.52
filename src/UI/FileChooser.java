/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Elliot-VS
 */
public class FileChooser extends JFileChooser {

    public FileChooser() {
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("image file(.svg)", ".svg");
        FileNameExtensionFilter jftFilter = new FileNameExtensionFilter("text file(.jft)", ".jft");
        FileNameExtensionFilter pngFilter = new FileNameExtensionFilter("image file(.png)", ".png");
        
        setFileFilter(imageFilter);
        setFileFilter(jftFilter);
        setFileFilter(pngFilter);
    }
    

}
