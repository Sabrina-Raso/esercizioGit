package packageService;
import java.util.Scanner;
import com.Auto;
import com.Veicolo;
import com.Camion;
import com.Moto;

public class Main {
	Scanner scanner = new Scanner(System.in);
	boolean continua = true;
	
	while(continua) {
		System.out.println("Scegli tra le seguenti opzioni:");
		System.out.println("1.Aggiungi veicolo"); //Menu
		System.out.println("2.Mostra tutti i veicoli");
		System.out.println("3.Calcola il bollo totale");
		System.out.println("4.Esci");
		
		int scelta = scanner.nextInt();
		scanner.nextLine();
		
		switch (scelta) {
		case 1:
			System.out.println("Scegli il tipo di veicolo da aggiungere:");
			System.out.println("1.Auto");
			System.out.println("2.Moto");
			System.out.println("3.Camion");
			
			int tipoVeicolo = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Inserisci la targa:");
			String targa = scanner.nextLine();
			
			System.out.println("Inserisci la marca:");
			String marca = scanner.nextLine();
			
			System.out.println("Inserisci il modello:");
			String modello = scanner.nextLine();
			
			System.out.println("Inserisci l'anno di immatricolazione:");
			String annoImmatricolazione = scanner.nextLine();
			
			Veicolo veicolo = null;
			
			switch (tipoVeicolo) {
			case 1:
				System.out.println("Inserisci la cilindrata");
				
				double cilindrataAuto= scanner.nextDouble();
				
				Auto auto = new Auto (targa, marca, modello, cilindrataAuto);
				gestoreParco.aggiungiVeicolo(auto);
				break;
				
			case 2:
				System.out.println("Inserisci la cilindrata");
				
				double cilindrataMoto= scanner.nextDouble();
				
				Moto moto = new Moto (targa, marca, modello, cilindrataMoto);
				gestoreParco.aggiungiVeicolo(moto);
				break;
				
			case 3:
				System.out.println("Inserisci il peso");
				
				double pesoCamion= scanner.nextDouble();
				
				Camion camion = new Camion (targa, marca, modello, pesoCamion);
				gestoreParco.aggiungiVeicolo(camion);
				break;
				
				
			gestoreParco.mostraVeicoli();
			break;
			}
			
			//Calcolo Bollo
			
			double bolloTotale = gestore.calcoloBolloTotale;
			System.out.println("Il bollo totale è: " + calcoloBolloTotale);
			break;
			
			//Uscita dal Menu
			System.out.println("Uscita dal programma...");
			
			continua = false;
			break;
		}
		}
	
		scanner.close();
}
}
		
		


