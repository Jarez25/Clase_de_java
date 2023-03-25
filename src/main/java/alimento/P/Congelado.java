package alimento.P;

import java.util.Date;

public class Congelado extends frescos {

    private String congelado;

    public Congelado(String nombre, Integer cantidad, Date fecha_de_caducidad, String pais_de_origen, Integer numero_de_lote, String Temperatura_de_congelacion_recomendada) {
        super(nombre, cantidad, fecha_de_caducidad, pais_de_origen, numero_de_lote);
        this.congelado = Temperatura_de_congelacion_recomendada;
    }

    public String getCongelado() {
        return congelado;
    }

    public void setCongelado(String congelado) {
        this.congelado = congelado;
    }
}
