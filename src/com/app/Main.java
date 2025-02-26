package com.app;

import java.util.Scanner;
import com.entita.Auto;
import com.entita.Camion;
import com.entita.Moto;
import com.entita.Veicolo;
import com.service.GestoreParco;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestoreParco gestoreParco = new GestoreParco(); 
        boolean continua = true;

        while (continua) {
            System.out.println("Scegli tra le seguenti opzioni:");
            System.out.println("1. Aggiungi veicolo");
            System.out.println("2. Mostra tutti i veicoli");
            System.out.println("3. Calcola il bollo totale");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Scegli il tipo di veicolo da aggiungere:");
                    System.out.println("1. Auto");
                    System.out.println("2. Moto");
                    System.out.println("3. Camion");

                    int tipoVeicolo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserisci la targa:");
                    String targa = scanner.nextLine();

                    System.out.println("Inserisci la marca:");
                    String marca = scanner.nextLine();

                    System.out.println("Inserisci il modello:");
                    String modello = scanner.nextLine();

                    System.out.println("Inserisci l'anno di immatricolazione:");
                    int annoImmatricolazione = scanner.nextInt();
                    scanner.nextLine(); 

                    Veicolo veicolo = null;

                    switch (tipoVeicolo) {
                        case 1:
                            System.out.println("Inserisci la cilindrata");
                            double cilindrataAuto = scanner.nextDouble();
                            Auto auto = new Auto(targa, marca, modello, annoImmatricolazione, cilindrataAuto);
                            gestoreParco.aggiungiVeicolo(auto);
                            break;

                        case 2:
                            System.out.println("Inserisci la cilindrata");
                            double cilindrataMoto = scanner.nextDouble();
                            Moto moto = new Moto(targa, marca, modello, annoImmatricolazione, cilindrataMoto);
                            gestoreParco.aggiungiVeicolo(moto);
                            break;

                        case 3:
                            System.out.println("Inserisci il peso");
                            double pesoCamion = scanner.nextDouble();
                            Camion camion = new Camion(targa, marca, modello, annoImmatricolazione, pesoCamion);
                            gestoreParco.aggiungiVeicolo(camion);
                            break;

                        default:
                            System.out.println("Opzione non valida");
                            break;
                    }
                    break;

                case 2:
                   
                    gestoreParco.mostraVeicoli();
                    break;

                case 3:
                   
                    double bolloTotale = gestoreParco.calcoloBolloTotale();
                    System.out.println("Il bollo totale è: " + bolloTotale);
                    break;

                case 4:
                    
                    System.out.println("Uscita dal programma...");
                    continua = false;
                    break;

                default:
                    System.out.println("Opzione non valida");
                    break;
            }
        }

        scanner.close();
    }
}



