package com.sanchez.app.proyecto4.models.enums;

public enum CodigosPilotos {

    PA5000,
    PA6000,
    PA70000,
    PA80000;

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static CodigosPilotos getCodigoPiloto(String tipo){
        switch (tipo){

            case "PA5000":
                return CodigosPilotos.valueOf("PA-5000");
            case "PA6000":
                return CodigosPilotos.valueOf("PA-6000");
            case "PA7000":
                return CodigosPilotos.valueOf("PA-7000");
            case "PA8000":
                return CodigosPilotos.valueOf("PA-8000");
            default:
                return null;

        }
    }
}
