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
public class Trabajador extends Persona {

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

    public Trabajador(String n, String a, String c, int e, int costo_seguro, int horas_trabajadas, int costo_por_hora) {
        super(n, a, c, e);
        this.setCosto_seguro(costo_seguro);
        this.setHoras_trabajadas(horas_trabajadas);
        this.setCosto_por_hora(costo_por_hora);

    }

    public void setCosto_seguro(int costo_seguro) {
        this.costo_seguro = costo_seguro;
    }

    public int getCosto_seguro() {
        return costo_seguro;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setCosto_por_hora(int costo_por_hora) {
        this.costo_por_hora = costo_por_hora;
    }

    public int getCosto_por_hora() {
        return costo_por_hora;
    }

    public int obtener_sueldo() {
        return (this.getHoras_trabajadas() * this.getCosto_por_hora()) + this.getCosto_seguro();
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "\t\tSeguro: $%d\n"
                + "\t\tHoras Trabajadas: %d\n"
                + "\t\tValor x Hora: %d\n"
                + "\t\tSueldo: %d\n",
                super.toString(),
                this.getCosto_seguro(),
                this.getHoras_trabajadas(),
                this.getCosto_por_hora(),
                this.obtener_sueldo());
    }

}
