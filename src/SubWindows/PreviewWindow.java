/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubWindows;

import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JLabel;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import static UI.FormulaDisplayPanel.ta_formula;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static UI.SettingsPanel.fg;

/**
 *
 * @author Elliot-VS
 */
public class PreviewWindow extends javax.swing.JPanel {

    /**
     * Creates new form PreviewWindow
     */
    public PreviewWindow() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {

        try {
            String latex = ta_formula.getText().trim();

            TeXFormula formula = new TeXFormula(latex);

            TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 40);
            icon.setInsets(new Insets(5, 5, 5, 5));

//            g.drawRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
//            g.setColor(Color.BLUE);
//            g.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());

            JLabel jLabel = new JLabel();
            jLabel.setForeground(fg);
            icon.paintIcon(jLabel, g, 0, 0);

            formula = null;
            icon = null;
            jLabel = null;

        } catch (Exception e) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JOptionPane.showMessageDialog(getRootPane(), "ERROR:" + e.getMessage());
                }
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
