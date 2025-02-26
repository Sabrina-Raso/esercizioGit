package com.entita;

public abstract class Veicolo {
	String targa;
	String marca;
	String modello;
	int anno;
	
	
public Veicolo (String targa, String marca, String modello, int anno) {
    this.targa = targa;
    this.marca = marca;
    this.modello = modello;
    this.anno = anno;
}


@Override 
public String toString() {
    return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", anno=" + anno + "]";
}

public abstract double CalcolaBollo();
}

