package packageService;
import com.Veicolo;
import java.util.ArrayList;

public class GestoreParco {
    private ArrayList<Veicolo> listaVeicoli = new ArrayList<>();
    
    
    public void aggiungiVeicolo(Veicolo listaVeicoli) {
    	listaVeicoli.add(listaVeicoli);
    	
    }
    
    public void mostraVeicoli() {
    	for (Veicolo v : listaVeicoli) {
    		System.out.println(v);
    		System.out.println("Bollo: " + v.CalcolaBollo());
    	}
    	}
    	
    public double calcoloBolloTotale() {
    	double totale = 0;
    	for (Veicolo v : listaVeicoli) {
    		totale += v.CalcolaBollo();
    	}
    	return totale;    	
    }

}
