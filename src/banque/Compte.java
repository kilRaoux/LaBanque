package banque;

public class Compte {
	private static int numeroLast = 0;
	public static int getNumeroLast() {
		return numeroLast;
	}
	public static void setNumeroLast(int numeroLast) {
		Compte.numeroLast = numeroLast;
	}
	protected int numero;
	protected double solde;
	public Compte(double solde) {
		this.numero = numeroLast;
		this.setSolde(solde);
	}
	public void ajouter(double unMontant) {
		this.setSolde(this.getSolde() + unMontant);
	}

	public int getNumero() {
		return numero;
	}
	public double getSolde() {
		return solde;
	}

	public void retirer(double unMontant) {
		this.setSolde(this.getSolde() - unMontant);
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return String.valueOf(this.numero);
	}
}
