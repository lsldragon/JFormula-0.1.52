package Util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import static UI.SettingsPanel.fg;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneratePng {

    public GeneratePng() {
    }

    public static void savePng(String formula, String path, float size) throws IOException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TeXFormula tf = new TeXFormula(formula);
                    TeXIcon ti = tf.createTeXIcon(TeXConstants.STYLE_DISPLAY, size);
                    BufferedImage bimg = new BufferedImage(ti.getIconWidth(), ti.getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);
                    
                    Graphics2D g2d = bimg.createGraphics();
                    
                    JLabel jl = new JLabel();
                    jl.setForeground(fg);
                    ti.paintIcon(jl, g2d, 0, 0);
                    
                    File out = new File(path);
                    ImageIO.write(bimg, "png", out);
                    
                } catch (IOException ex) {
                    Logger.getLogger(GeneratePng.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        },"save as png").start();
    }
}
