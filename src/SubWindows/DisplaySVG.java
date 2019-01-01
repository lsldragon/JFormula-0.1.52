/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubWindows;

import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.JSVGScrollPane;
import org.apache.batik.swing.svg.GVTTreeBuilderAdapter;
import org.apache.batik.swing.svg.GVTTreeBuilderEvent;
import org.apache.batik.swing.svg.GVTTreeBuilderListener;

/**
 *
 * @author Elliot
 */
public class DisplaySVG {

    JFrame svgFrame = null;
    JSVGCanvas svgCanvas = null;
    JSVGScrollPane scrollPane = null;

    public DisplaySVG(File file) throws Exception {

        String svString = file.toURI().toURL().toString();

        svgFrame = new BaseJFrame();
        svgFrame.setTitle(svString);
        svgCanvas = new JSVGCanvas();
        scrollPane = new JSVGScrollPane(svgCanvas);

        svgFrame.add(scrollPane);

        svgCanvas.setURI(svString);

        svgCanvas.addGVTTreeBuilderListener(CreatBuilderListener());

    }

    private GVTTreeBuilderListener CreatBuilderListener() {
        final GVTTreeBuilderListener gVTTreeBuilderListener = new GVTTreeBuilderAdapter() {

            @Override
            public void gvtBuildCompleted(GVTTreeBuilderEvent gvttbe) {
                svgFrame.pack();
            }

            @Override
            public void gvtBuildFailed(GVTTreeBuilderEvent gvttbe) {
                JOptionPane.showMessageDialog(null, "unknown error", "ERROE", JOptionPane.WARNING_MESSAGE);
            }
        };

        return gVTTreeBuilderListener;
    }
}
