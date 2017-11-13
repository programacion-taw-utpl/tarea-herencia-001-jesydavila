/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;
import personal.Trabajador;

/**
 *
 * @author Familia
 */
public class EmpresaPrivada extends Empresa {

    private int numero_sucursales;
    private int ventas_mensual_fijo;

    public EmpresaPrivada(
            String nombre, String siglas, String ciudad, Trabajador[] trabajadores,
            int numero_sucursales, int ventas_mensual_fijo
    ) {
        super(nombre, siglas, ciudad, trabajadores);
        this.numero_sucursales = numero_sucursales;
        this.ventas_mensual_fijo = ventas_mensual_fijo;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int numero_sucursales) {
        this.numero_sucursales = numero_sucursales;
    }

    public int getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setVentas_mensual_fijo(int ventas_mensual_fijo) {
        this.ventas_mensual_fijo = ventas_mensual_fijo;
    }
    
    @Override
    public String toString(){
        return String.format("%s"
                + "Ventas: %d\n"
                + "Sucursales: %d\n"
                + "Lista Trabajadores:\n\n"
                + "%s", 
                super.toString(),
                this.getNumero_sucursales(),
                this.getVentas_mensual_fijo(),
                this.getTrabajadores());
    }
    
}
