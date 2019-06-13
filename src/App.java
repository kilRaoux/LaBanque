import banque.Client;
import banque.Compte;

public class App {
	public static void main(String[] args) {
		Compte compte1 = new Compte(1000000000.0);
		Client moi = new Client("Raoux", "Killian", 24, 1);
		System.out.println(moi);
	}
}
