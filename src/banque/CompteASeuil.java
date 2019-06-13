package banque;

public class CompteASeuil extends Compte implements ICompteASeuil {
	private double seuil;

	public CompteASeuil(double solde, double seuil) {
		super(solde);
		this.seuil = seuil;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.valueOf(this.solde);
	}

	@Override
	public void retirer(double uneValeur) {
		if (this.solde-uneValeur > this.seuil) {
			this.solde -= uneValeur;
		}
	}

	@Override
	public double getSeuil() {
		return this.seuil;
	}

	@Override
	public void setSeuil(double unSeuil) {
		this.seuil = unSeuil;

	}
}
