/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import laempresa.EmpresaPrivada;
import personal.Trabajador;

/**
 *
 * @author Familia
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Se crea el listado de los trabajadores de la empresa
        Trabajador[] trabajadores = new Trabajador[2];
        trabajadores[0] = new Trabajador("Ana Luisa", "Velez Alcivar", "12903939", 30, 100, 40, 10);
        trabajadores[1] = new Trabajador("Mario Anibal", "Vela Narvaez", "212889", 35, 100, 50, 10);

        //Se crea la empresa
        EmpresaPrivada e1 = new EmpresaPrivada(
                "Soluciones Software", "SS's", "Loja", trabajadores,
                200000, 12
        );
        
        System.out.println(e1);
    }

}
    

