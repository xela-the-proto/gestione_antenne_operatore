package com.example;

public class Antenna {
    private
    float longitudine;
    float latitudine;
    String tipo;

    public 

    Antenna(float longitudine, float latitudine, String tipo){
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.tipo = tipo;
    }

    Antenna(Antenna antenna){
        this.latitudine = antenna.latitudine;
        this.longitudine = antenna.longitudine;
        this.tipo = antenna.tipo;
    }

    float getLatitudine(){
        return latitudine;
    }

    float getLongitudine(){
        return longitudine;
    }

    String getTipo(){
        return tipo;
    }

    
    void setLatitudine(float latitudine){
        this.latitudine = latitudine;
    }

    void setLongitudine(float longitudine){
        this.longitudine = longitudine;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }
}