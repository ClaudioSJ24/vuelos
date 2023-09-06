package com.sanchez.app.proyecto4.models.enums;

public enum CodigosAviones {

    AV1000,
    AV2000,

    AV30000,
    AV40000;

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static CodigosAviones getCodigoAvion(String tipo){
        switch (tipo){

            case "AV10000":
                return CodigosAviones.valueOf("AV-10000");
            case "AV20000":
                return CodigosAviones.valueOf("AV-20000");
            case "AV30000":
                return CodigosAviones.valueOf("AV-30000");
            case "AV40000":
                return CodigosAviones.valueOf("AV-40000");
            default:
                return null;

        }
    }
}
