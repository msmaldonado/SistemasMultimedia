/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoArchivo;

import static PracticaPaint.VentanaPrincipal.getExtension;
import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Miguel
 */
public class TodosArchivos extends FileFilter {
    /**
     * Filtro para ver si el archivo tiene la extension que acepta el filtro
     * @param f archivo
     * @return si lo acepta
     */
    
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) 
            return true;

        String extension = getExtension(f);
        if (extension != null) 
            return extension.equals("png") || extension.equals("jpg")||extension.equals("jpeg")|| extension.equals("mp3")||extension.equals("wav")||  extension.equals("avi")|| extension.equals("au");
        
        return false;
    }
    /**
     * descripción del filtro
     * @return string con el nombre del filtro
     */
    @Override
    public String getDescription() {
        return "Todos Archivos";
    }
}
