package alimento.P;

import java.util.Date;

public class Refrigerado extends  frescos{
    private String refrigerado;

    public Refrigerado(String nombre, Integer codigo_de_orgtranizacion_de_supervicion, Date fecha_de_caducidad, String pais_de_origen, Integer numero_de_lote, String refrigerado) {
        super(nombre, codigo_de_orgtranizacion_de_supervicion, fecha_de_caducidad, pais_de_origen, numero_de_lote);
        this.refrigerado = refrigerado;
    }

    public String getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(String refrigerado) {
        this.refrigerado = refrigerado;
    }
}
