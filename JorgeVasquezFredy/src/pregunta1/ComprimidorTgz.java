/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

/**
 *
 * @author Fredy
 */
public class ComprimidorTgz extends Comprimidor{

    @Override
    public Archivo FArchivo() {
        return new ArchivoTgz();
    }
    
}
