package com;

public class Auto extends Veicolo {
	public double cilindrata; 

	public Auto(String targa, String marca, String modello, int anno, double cilindrata) {
		super(targa, marca, modello, anno); 
		this.cilindrata = cilindrata;
		
	}

	@Override
	public String toString() {
		return "Auto [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", anno=" + anno + ", cilindrata="
				+ cilindrata + "]";
	}
	
	@Override
	public double CalcolaBollo() {
		return cilindrata * 2.5; 
		
	}
}
