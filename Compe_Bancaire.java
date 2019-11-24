package Banque;

public class Compe_Bancaire {
	// cette classe n'aura pas de main
	//attributes de la class
	float solde;
	String porteur;
	String IBAN;
	
	//fonction (méthode de la classe )
	// le premier des fonctions c'est le constructeur
	public Compe_Bancaire() {
		// initialsation les attributs
		this.solde = 0.0f;
		this.porteur = "";
		this.IBAN = "";
	
		
	}
	public Compe_Bancaire(float solde, String nom, String IBAN) {
		this.solde = solde;
		this.porteur = nom;
		this.IBAN = IBAN;
			
	}
	 //autre methode de la class
	//affichage du compte bancaire
	public void affiche () {
		System.out.println("Nom du porteur du compte: " + this.porteur);
		System.out.println("numéro du compte: " + this.IBAN);
		System.out.println("Solde du compte: " + this.solde);
	}
	
	// affichage du solde du compte
		// void indique que la fonction ne retourne rien
		public void afficheSolde() 
						{ // d�but de la fonction
						System.out.println("Valeur du solde : " + this.solde);		
						} // fin de la fonction
		
		// d�poser de l'argent sur le compte
		public void deposer(float montant) {
							this.solde = this.solde + montant;
							//affichage du nouveau solde apr�s d�p�t
							this.afficheSolde();
			
		} // fin de la fonction deposer
		
		//retirer un montant sur le compte
		// la fonction retourne Vrai si le retrait est OK et Faux sinon
		public boolean retirer(float montant) {
			boolean etat = false;
			
			// on ne retire le montant que si le solde reste positif ou nul
			if ((this.solde - montant) >= 0) {
				this.solde=this.solde-montant;
			}
			else {
				System.out.println("Solde insuffisant !!!!!!");
				etat=false;
			}
			// affichage du nouveau solde apr�s retrait ou pas
			this.afficheSolde();
			return etat;
		}
		
		// virement de compte � compte : cr�dit sur le compte destinataire
		// virement du CB source vers le CB destinataire
		public void virement(Compe_Bancaire destinataire, float montant) {
			// on doit retirer sur le compte source et d�poser sur le compte destinataire
		// 	boolean r = true ;
		//	r = this.retirer(montant);  // this == me == moi le CB sur lequel est appliqu� la fonction
		//	if (r == true) {
		//		destinataire.deposer(montant);
		//		System.out.println("Le virement est annul� !!!");
		//		}
			if (this.retirer(montant)) {
				// le solde de this est suffisant pour le retrait
				destinataire.deposer(montant); // j'ex�cute le virement
			}
			else {System.out.println("Le virement est annul� !!!");}
		}
}
