/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Util.ConstantsUI;
import Util.FileUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Elliot-VS
 */
public class AboutFrame extends JFrame {

    private String filePrefix = "extendFormula" + File.separator;

    public AboutFrame() throws Exception {

        MainWindow mw = new MainWindow();
        Font f = new Font("Arial", Font.BOLD, 15);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());

        JLabel label = new JLabel("To use this software, you must agree this license");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setForeground(Color.RED);

        JButton confirm = new JButton("Yes, I agree this license");
        confirm.setFont(f);

        confirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {

                    mw.setVisible(true);
                    dispose();

                } catch (Exception ex) {
                    Logger.getLogger(AboutFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                confirm.setForeground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                confirm.setForeground(Color.BLACK);
            }

        });

        JButton cancel = new JButton("No, I don't agree");
        cancel.setFont(f);

        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cancel.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cancel.setForeground(Color.BLACK);
            }

        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JTextArea jta = new JTextArea();
        jta.setText(FileUtil.readFile(filePrefix + "GPL-V3.txt"));
        jta.setEditable(false);
        jta.setLineWrap(true);
        jta.setCaretPosition(0);
        jta.setFont(new Font("Arial", Font.PLAIN, 18));
        jta.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        JScrollPane jsp = new JScrollPane(jta);
        jsp.setViewportView(jta);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(confirm);
        buttonPanel.add(cancel);

        jp.add(label, BorderLayout.NORTH);
        jp.add(buttonPanel, BorderLayout.SOUTH);
        jp.add(jsp, BorderLayout.CENTER);

        setTitle("LICENSE");
        getContentPane().add(jp);
        setSize(650, 400);
        setIconImage(ConstantsUI.MAIN_WINDOW_ICON);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
