package com.sanchez.app.proyecto4.models.enums;

public enum TiposAviones {

    BOEING747,
    BOEING700,

    BOEING848,
    BOEING900;

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static TiposAviones getTipoAvion(String tipo){
        switch (tipo){

        case "BOEING747":
            return TiposAviones.valueOf("BOEING-747");
        case "BOEING700":
            return TiposAviones.valueOf("BOEING-700");
        case "BOEING848":
            return TiposAviones.valueOf("BOEING-848");
        case "BOEING900":
            return TiposAviones.valueOf("BOEING-900");
        default:
            return null;

        }
    }
}