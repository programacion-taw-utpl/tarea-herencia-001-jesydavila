/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author Familia
 */
public class Persona {
    
    private String nombres;
    private String apellidos;
    protected int edad;
    private String cedula;
    
    
    public Persona(String n, String a, String c, int e){
        this.setNombres(n);
        this.setApellidos(a);
        this.setEdad(e);
        this.setCedula(c);
        
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getNombres() {
        return nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }
        public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
       
    public String getCedula() {
        return cedula;
    }
    
    @Override
    public String toString(){
        return String.format("\t%s %s\n"
                + "\t\t%d de edad\n"
                + "\t\tCI: %s\n", 
                this.getNombres(), this.getApellidos(), 
                this.getEdad(),
                this.getCedula());
    }
    
}