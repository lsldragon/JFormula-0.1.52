/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elliot-VS
 */
public class ClipBoard {

    public static void setClipboardImage(Image image) {

        Transferable trans = new Transferable() {

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                return DataFlavor.imageFlavor.equals(flavor);
            }

            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[]{DataFlavor.imageFlavor};
            }

            @Override
            public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {

                if (isDataFlavorSupported(flavor)) {
                    return image;
                }
                return null;
            }
        };

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(trans, null);
        System.out.println("Copy to clipboard Done!!!");
    }

    public static void copyToClipboard(String fileName) {

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        Transferable contents = new Transferable() {
            DataFlavor[] dataFlavors = new DataFlavor[]{DataFlavor.javaFileListFlavor};

            @Override
            public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
                List<File> files = new ArrayList<File>();
                files.add(new File(fileName));
                return files;
            }

            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return dataFlavors;
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                for (int i = 0; i < dataFlavors.length; i++) {
                    if (dataFlavors[i].equals(flavor)) {
                        return true;
                    }
                }
                return false;
            }
        };
        clipboard.setContents(contents, null);
        System.out.println("Copy to clipboard Done!!!");
    }

}
