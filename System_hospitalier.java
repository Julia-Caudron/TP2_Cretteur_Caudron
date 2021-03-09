package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête :
		// Cette méthode privée analyse la requête envoyée au système 
		// par le patient (qui contient ses symptomes et coordonnées).
		// Et elle retourne une chaîne de caractères confirmant que la
		// requête a été analysée.
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Comparaison des données :
		// Cette méthode privée compare les données présentes dans la
		// classe "System_hospitalier" avec la base contenant les 
		// requêtes précédentes des autres utilisateurs.
		// Elle compare donc les requêtes reçues par les système entre
		// elles.
		// Elle retourne la chaîne de caractères "Cluster trouvé" 
		// lorsqu'elle a identifié plusieurs patients avec les
		// mêmes symptomes à un même endroit.
		return "Cluster trouvé";
	}

}
