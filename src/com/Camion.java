package com;



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
    
    @Override
	public String toString() {
		return "Camion [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", anno=" + anno + ", peso="
				+ peso + "]";
	}
    
	
}