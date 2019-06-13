package banque;

public interface ICompte {
	public void retirer(double unMontant) throws BanqueException;
	public void ajouter(double unMontant);
}
