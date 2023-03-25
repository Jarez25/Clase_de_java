package alimento.P;

import java.util.Date;

public class frescos {
    private  String nombre;
    private Integer cantidad;
    private Date Fecha_de_caducida_por_lor;
    private String pais_de_origen;
    private  Integer numero_de_lote;

    public frescos() {
    }

    public frescos(String nombre, Integer cantidad, Date fecha_de_caducidad, String pais_de_origen, Integer numero_de_lote) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.Fecha_de_caducida_por_lor = fecha_de_caducidad;
        this.pais_de_origen = pais_de_origen;
        this.numero_de_lote = numero_de_lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_de_caducida_por_lor() {
        return Fecha_de_caducida_por_lor;
    }

    public void setFecha_de_caducida_por_lor(Date fecha_de_caducida_por_lor) {
        this.Fecha_de_caducida_por_lor = fecha_de_caducida_por_lor;
    }

    public String getPais_de_origen() {
        return pais_de_origen;
    }

    public void setPais_de_origen(String pais_de_origen) {
        this.pais_de_origen = pais_de_origen;
    }

    public Integer getNumero_de_lote() {
        return numero_de_lote;
    }

    public void setNumero_de_lote(Integer numero_de_lote) {
        this.numero_de_lote = numero_de_lote;
    }
}
