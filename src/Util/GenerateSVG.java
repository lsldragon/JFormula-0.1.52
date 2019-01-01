/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Dimension;
import java.awt.Insets;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JLabel;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.scilab.forge.jlatexmath.DefaultTeXFont;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import org.scilab.forge.jlatexmath.cyrillic.CyrillicRegistration;
import org.scilab.forge.jlatexmath.greek.GreekRegistration;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import static UI.SettingsPanel.fg;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.batik.svggen.SVGGraphics2DIOException;

/**
 *
 * @author apache batik
 */
public class GenerateSVG {

    public static void saveSVG(String latex, String file, float size) throws IOException {

        new Thread(new Runnable() {
            @Override
            public void run() {

                FileOutputStream svgs = null;
                try {
                    DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
                    String svgNS = "http://www.w3.org/2000/svg";
                    Document document = domImpl.createDocument(svgNS, "svg", null);
                    SVGGeneratorContext ctx = SVGGeneratorContext.createDefault(document);
                    SVGGraphics2D g2 = new SVGGraphics2D(ctx, true);
                    DefaultTeXFont.registerAlphabet(new CyrillicRegistration());
                    DefaultTeXFont.registerAlphabet(new GreekRegistration());
                    TeXFormula formula = new TeXFormula(latex);
                    TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, size);
                    icon.setInsets(new Insets(5, 5, 5, 5));
                    g2.setSVGCanvasSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
                    JLabel jl = new JLabel();
                    jl.setForeground(fg);
                    icon.paintIcon(jl, g2, 0, 0);
                    boolean useCSS = true;
                    svgs = new FileOutputStream(file);
                    Writer out = new OutputStreamWriter(svgs, "UTF-8");
                    g2.stream(out, useCSS);
                    svgs.flush();
                    svgs.close();

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GenerateSVG.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(GenerateSVG.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SVGGraphics2DIOException ex) {
                    Logger.getLogger(GenerateSVG.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(GenerateSVG.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        svgs.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GenerateSVG.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }, "save as svg").start();

    }
}
