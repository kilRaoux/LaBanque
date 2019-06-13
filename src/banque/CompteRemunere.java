package banque;

public class CompteRemunere extends Compte implements ICompteRemunere{
	private double taux;

	public CompteRemunere(double taux, double solde) {
		super(solde);
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
		return taux;
	}

	@Override
	public void setTaux(double taux) {
		this.taux = taux;
	}
}
