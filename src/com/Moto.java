package com;

public class Moto extends Veicolo {
    public double cilindrata;

    public Moto(String targa, String marca, String modello, int anno, double cilindrata) {
        super(targa, marca, modello, anno);
        this.cilindrata = cilindrata;
    }

    
    @Override //Calcolo del bollo basato sull'anno di imm e la cilindrata
    public double CalcolaBollo() {
        double bolloBase = cilindrata * 0.10; // 
        double bolloAnno = 0;

      
        if (2025 - anno > 10) { 
            bolloAnno = bolloBase * 0.80; 
        } else {
            bolloAnno = bolloBase; 
        }

        return bolloAnno; 
    }

   


	@Override
    public String toString() {
        return super.toString() + ", Cilindrata: " + cilindrata;
    }
}
