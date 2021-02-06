/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Juanjo Cortés
 */
public class Utilidades {
    public static ArrayList<String> getArchivos(String ruta){
        File dir = new File(ruta);
        String[] ficheros  = dir.list();
        ArrayList<String> imagenes = new ArrayList<String>();
        
        for(String fichero: ficheros){
            if(fichero.endsWith(".jpg")||fichero.endsWith(".png")){
                fichero = "ficheros".concat(File.separator).concat(fichero);
                 imagenes.add(fichero);
            }
           
        }
        return imagenes;
    }
}
