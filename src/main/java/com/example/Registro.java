package com.example;

public class Registro {
    public static final int NUMERO_MASSIMO_ANTENNE = 1000000;
    private Antenna[] antenne;
    private int numero_antenne;
    
    public Registro(){
        antenne = new Antenna[NUMERO_MASSIMO_ANTENNE];
        numero_antenne = 0;
    }


    public int aggiungiAntenna(float latitudine, float longitudine, String tipo) {
        Antenna antenna = new Antenna(longitudine,latitudine,tipo);
        antenne[numero_antenne] = antenna;
        numero_antenne++;
        return numero_antenne-1;
    }

    public int aggiungiAntenna(Antenna antenna) {
       antenne[numero_antenne] = new Antenna(antenna);
       numero_antenne++; 
        return numero_antenne - 1;
    }

    public int getNumeroAntenne() {
        return numero_antenne;
    }

    public Antenna getAntenna() {
        if (numero_antenne >= numero_antenne || numero_antenne < 0) {
            return null;
        }
        return new Antenna(antenne[numero_antenne]);
    }

    public void modificaAntenna(int numero_antenna, String tipo, float latitudine, float longitudine) {
        if (numero_antenna >= numero_antenne || numero_antenne < 0) {
            return;
        }
        antenne[numero_antenna].setLatitudine(latitudine);
        antenne[numero_antenna].setLongitudine(longitudine);
        antenne[numero_antenna].setTipo(tipo);
    }

    public int contaAntenne(float latitudine_minima, float latitudine_massima, 
                            float longitudine_minima, float longitudine_massima) {
        int contaAntenne = 0;
        for (int i = 0; i < numero_antenne; i++) {
            if (antenne[i].getLatitudine() < latitudine_massima &&
                antenne[i].getLatitudine() > latitudine_minima &&
                antenne[i].getLongitudine() < longitudine_massima &&
                antenne[i].getLongitudine() > longitudine_minima) {
                contaAntenne++;
            }
        }
        return contaAntenne;
    }
}