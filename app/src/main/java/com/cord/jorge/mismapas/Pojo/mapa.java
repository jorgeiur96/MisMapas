package com.cord.jorge.mismapas.Pojo;

public class mapa {


     String Nombre;

    public mapa(String nombre, String logitud, String latitud) {
        Nombre = nombre;
        this.logitud = logitud;
        this.latitud = latitud;
    }

    public mapa() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLogitud() {
        return logitud;
    }

    public void setLogitud(String logitud) {
        this.logitud = logitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    String logitud;
     String latitud;
}
