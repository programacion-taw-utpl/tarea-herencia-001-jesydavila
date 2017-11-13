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
public class Empresa {

    private String nombre;
    private String siglas;
    private String ciudad;
    protected Trabajador[] trabajadores;

    public Empresa(String nombre, String siglas, String ciudad, Trabajador[] trabajadores) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.ciudad = ciudad;
        this.trabajadores = trabajadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public String getTrabajadores() {
        String lista_trabajadores = "";
        for (int i = 0; i < this.trabajadores.length; i++) {
            lista_trabajadores += "\t" + (i + 1) + ")" + this.trabajadores[i].toString();
        }
        return lista_trabajadores;
    }

    @Override
    public String toString() {
        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s\n",
                this.getNombre(), this.getSiglas(), this.getCiudad());
    }

}
