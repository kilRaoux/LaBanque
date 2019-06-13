package banque;

import java.util.Hashtable;
import java.util.Map;

public class Client {
	protected String nom, prenom;

	protected int age, numero;

	protected Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();


	public Client(String nom, String prenom, int age, int numero) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}

	public void ajouterCompte(Compte unCompte) throws BanqueException {
		if (this.comptes.size() > 4) {
			throw new BanqueException("Maximum compte atteint");
		}
		this.comptes.put(new Integer(unCompte.getNumero()),unCompte);
	}

	public int getAge() {
		return age;
	}

	public Compte getCompte(int numerocompte) {
		return this.comptes.get(numerocompte);
	}

	public String getNom() {
		return nom;
	}

	public int getNumero() {
		return numero;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return this.nom + " " + this.prenom;
	}
}
