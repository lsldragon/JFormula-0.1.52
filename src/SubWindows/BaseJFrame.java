/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubWindows;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Elliot
 */
public class BaseJFrame extends JFrame {

    public BaseJFrame() {

        setMainFrameCenter();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.addWindowListener(disposeWindow());

    }

    private final WindowListener disposeWindow() {

        WindowListener listener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }

        };

        return listener;
    }

    private void setMainFrameCenter() {

        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int showWidth = (int) (resolution.getWidth() * 0.7);
        int showHeight = (int) (resolution.getHeight() * 0.5);
        getContentPane().setPreferredSize(new Dimension(showWidth, showHeight));
        pack();
        int x = (int) ((resolution.getWidth() - getWidth()) / 2);
        int y = (int) ((resolution.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }

}
