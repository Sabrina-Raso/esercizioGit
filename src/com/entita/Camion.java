package com.entita;

public  class Camion extends Veicolo {
	public double peso; 


    public Camion(String targa, String marca, String modello, int anno, double peso) {
        super(targa, marca, modello, anno);
        this.peso = peso;
        
    }
    
    @Override
	public double CalcolaBollo() {
		return peso * 5; // calcolo del bollo del camion (?)

	}
    

	
}