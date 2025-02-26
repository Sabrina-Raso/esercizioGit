package com.entita;

public class Auto extends Veicolo {
	public double cilindrata; 

	public Auto(String targa, String marca, String modello, int anno, double cilindrata) {
		super(targa, marca, modello, anno); 
		this.cilindrata = cilindrata;
		
	}

	
	@Override
	public double CalcolaBollo() {
		return cilindrata * 2.5; 
		
	}	//Ciao Sabri
}
