/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import SubWindows.DisplaySVG;
import SubWindows.PreviewWindow;
import SubWindows.RenderFormula;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static UI.FormulaDisplayPanel.ta_formula;
import Util.ConstantsUI;
import Util.FileUtil;
import Util.GenerateJft;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.scilab.forge.jlatexmath.TeXFormula;
import Util.GeneratePng;
import Util.GenerateSVG;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Elliot-VS
 */
public class FunctionPanel extends javax.swing.JPanel {

    private FileChooser chooser;

    /**
     * Creates new form FunctionPanel
     */
    public FunctionPanel() {
        initComponents();
        chooser = new FileChooser();
    }

//    public static void disableButton(JButton bt, boolean tf) {
//        bt.setEnabled(tf);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_irr = new javax.swing.JLabel();
        formulaSizeCb = new javax.swing.JComboBox<>();
        bt_exit = new javax.swing.JButton();
        bt_generate = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();
        bt_preview = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bt_reRend = new javax.swing.JButton();
        bt_openFile = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lb_irr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_irr.setText("Formula Size:");

        formulaSizeCb.setEditable(true);
        formulaSizeCb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        formulaSizeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Media", "High", "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72" }));
        formulaSizeCb.setSelectedIndex(1);
        formulaSizeCb.setToolTipText("");

        bt_exit.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        bt_exit.setToolTipText("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        bt_generate.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        bt_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save file.png"))); // NOI18N
        bt_generate.setToolTipText("Genetare And Save Formula");
        bt_generate.setMaximumSize(new java.awt.Dimension(32, 32));
        bt_generate.setMinimumSize(new java.awt.Dimension(32, 32));
        bt_generate.setPreferredSize(new java.awt.Dimension(32, 32));
        bt_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_generateActionPerformed(evt);
            }
        });

        bt_clear.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        bt_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clear text.png"))); // NOI18N
        bt_clear.setToolTipText("Clear Text");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        bt_preview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/preview BT.png"))); // NOI18N
        bt_preview.setToolTipText("Preview");
        bt_preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_previewActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Open or Drag a file", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(51, 51, 255))); // NOI18N

        bt_reRend.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bt_reRend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/render.png"))); // NOI18N
        bt_reRend.setToolTipText("Restart Rendering Formula ");
        bt_reRend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reRendActionPerformed(evt);
            }
        });

        bt_openFile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bt_openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fileopen.png"))); // NOI18N
        bt_openFile.setToolTipText("Open a File or Drag a File");
        bt_openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_openFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_reRend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_openFile, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_reRend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(bt_openFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_irr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulaSizeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_preview)
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_clear, bt_exit, bt_generate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formulaSizeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_preview, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_exit))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_clear, bt_exit, bt_generate});

    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        // TODO add your handling code here:
        JOptionPane jp = new JOptionPane();
        Object[] options = {"Exit", "Cancel"};
        int option = jp.showOptionDialog(this, "Are you sure ??  The unsaved data won't be saved!!", "Exit", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (option == 0) {
            System.exit(0);
        }
        return;
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        // TODO add your handling code here:
        ta_formula.setText("");
    }//GEN-LAST:event_bt_clearActionPerformed

    private void bt_previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_previewActionPerformed

        PreviewWindow pw = new PreviewWindow();
        JFrame jf_preview = new JFrame("Preview");
        jf_preview.setSize(1000, 300);
        jf_preview.setLocationRelativeTo(this);
        jf_preview.setAlwaysOnTop(true);
        jf_preview.setIconImage(ConstantsUI.PREVIEW_ICON);
        jf_preview.add(pw);

        jf_preview.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("preview formula window close");
                jf_preview.dispose();
            }

        });
        jf_preview.setVisible(true);
    }//GEN-LAST:event_bt_previewActionPerformed

    private void bt_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_generateActionPerformed
        // TODO add your handling code here:

        TeXFormula formula = new TeXFormula();

        String formulas = ta_formula.getText().trim();
        formula.add(formulas);
        String imageResolutionRate = formulaSizeCb.getSelectedItem().toString();
        System.err.println(imageResolutionRate);

        boolean generateSuccess = false;

        int fileChooseroption = chooser.showSaveDialog(null);          // choice of JFileChooser

        FileFilter filter = chooser.getFileFilter();
        String filesufix = filter.toString();
        String sufix = filesufix.substring(filesufix.length() - 6, filesufix.length() - 2);  // the sufix of a file 
        String filePath = chooser.getSelectedFile().getAbsolutePath();                       // the path and name o fa file 

        if (imageResolutionRate.equals("Low")) {

            if (fileChooseroption == JFileChooser.APPROVE_OPTION) {

                if (sufix.equals(".jft")) {
                    try {
                        GenerateJft.saveJft(filePath + ".jft", formulas);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (sufix.equals(".svg")) {
                    try {
                        GenerateSVG.saveSVG(formulas, filePath + ".svg", 40);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        GeneratePng.savePng(formulas, filePath + ".png", 40);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        } else if (imageResolutionRate.equals("Media")) {

            if (fileChooseroption == JFileChooser.APPROVE_OPTION) {

                if (sufix.equals(".jft")) {
                    try {
                        GenerateJft.saveJft(filePath + ".jft", formulas);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (sufix.equals(".svg")) {
                    try {
                        GenerateSVG.saveSVG(formulas, filePath + ".svg", 80);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        GeneratePng.savePng(formulas, filePath + ".png", 80);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        } else if (imageResolutionRate.equals("High")) {

            if (fileChooseroption == JFileChooser.APPROVE_OPTION) {

                if (sufix.equals(".jft")) {
                    try {
                        GenerateJft.saveJft(filePath + ".jft", formulas);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (sufix.equals(".svg")) {
                    try {
                        GenerateSVG.saveSVG(formulas, filePath + ".svg", 120);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        GeneratePng.savePng(formulas, filePath + ".png", 120);
                        generateSuccess = true;
                        formula = null;
                    } catch (IOException ex) {
                        Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else if (!(imageResolutionRate.equals("Low") || imageResolutionRate.equals("Media") || imageResolutionRate.equals("High"))) {

            float imageResolutionRateF = 0;

            try {
                imageResolutionRateF = Float.valueOf(imageResolutionRate);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(getRootPane(), "Invalid value, value= [1,1638]", "FAIL", JOptionPane.ERROR_MESSAGE);
            }

            if (imageResolutionRateF >= 1 && imageResolutionRateF <= 1638) {

                try {

                    if (fileChooseroption == JFileChooser.APPROVE_OPTION) {

                        if (sufix.equals(".jft")) {

                            GenerateJft.saveJft(filePath + ".jft", formulas);
                            generateSuccess = true;
                            formula = null;

                        } else if (sufix.equals(".svg")) {

                            GenerateSVG.saveSVG(formulas, filePath + ".svg", imageResolutionRateF);
                            generateSuccess = true;
                            formula = null;

                        } else {

                            GeneratePng.savePng(formulas, filePath + ".png", imageResolutionRateF);
                            generateSuccess = true;
                            formula = null;

                        }
                    }
                } catch (Exception ex) {
                    generateSuccess = false;
                }

            }

        } else {
            JOptionPane.showMessageDialog(getRootPane(), "Invalid value, value= [1,1638]", "FAIL", JOptionPane.ERROR_MESSAGE);
            generateSuccess = false;
        }

        if (generateSuccess) {

            System.out.println("success");
            JOptionPane jp = new JOptionPane();
            Object[] options = {"OK"};
            int option = jp.showOptionDialog(this, "Generate Succeed!!!", "Generate Done", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
            if (option == 0) {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(getRootPane(), "Generate Fail", "FAIL", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_generateActionPerformed

    private void bt_reRendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reRendActionPerformed

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame jf = new JFrame("Rendering Formulas......");

                RenderFormula df = new RenderFormula();

                jf.add(df);

                jf.setSize(1000, 300);
                jf.setIconImage(ConstantsUI.RENDER_ICON);
                jf.setLocation(500, 0);
                jf.setAlwaysOnTop(true);
                jf.setVisible(true);
                jf.repaint();
                bt_reRend.setEnabled(false);

                jf.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("render formula window close");
                        df.stop();
                        jf.dispose();
                        bt_reRend.setEnabled(true);

                    }
                });
            }
        });

    }//GEN-LAST:event_bt_reRendActionPerformed

    private void bt_openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_openFileActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jft, txt and svg file", "jft", "txt", "svg");
        jfc.setFileFilter(filter);
        int returnVal = jfc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                String file = jfc.getSelectedFile().getPath();
                String content = FileUtil.readFile(file);
                if (file.endsWith(".jft") || file.endsWith(".txt")) {
                    ta_formula.setText(content);
                } else {

                    new DisplaySVG(new File(file));

                }

            } catch (Exception ex) {
                Logger.getLogger(FunctionPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bt_openFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_exit;
    public static javax.swing.JButton bt_generate;
    private javax.swing.JButton bt_openFile;
    public static javax.swing.JButton bt_preview;
    private javax.swing.JButton bt_reRend;
    private javax.swing.JComboBox<String> formulaSizeCb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_irr;
    // End of variables declaration//GEN-END:variables

}