package banque;

public class CompteASeuilRemunere extends Compte implements ICompteASeuil, ICompteRemunere {
	private double seuil;
	private double taux;

	public CompteASeuilRemunere(double solde, double seuil, double taux) {
		super(solde);
		this.seuil = seuil;
		this.taux = taux;
	}

	@Override
	public double calculerInterets() {
		return this.taux*this.solde;
	}

	@Override
	public void verserInterets() {
		this.solde += this.calculerInterets();

	}

	@Override
	public double getTaux() {
		return this.taux;
	}

	@Override
	public void setTaux(double unTaux) {
		this.taux = unTaux;

	}

	@Override
	public void retirer(double uneValeur) {
		this.solde -= uneValeur;
	}

	@Override
	public double getSeuil() {
		// TODO Auto-generated method stub
		return this.seuil;
	}

	@Override
	public void setSeuil(double unSeuil) {
		this.seuil = unSeuil;
	}

}
