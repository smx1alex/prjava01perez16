/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01perez16;

import java.io.*;
import java.awt.Desktop;

/**
 *
 * @author ubu1
 */
public class Prjava01perez16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        File f = new File("prj01perez16.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina web de Alejandro Perez");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web de Alejandro Perez");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }

    }
}
