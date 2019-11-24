package Banque;

public class Principale {

	public static void main(String[] args) {
		Compe_Bancaire cb1 = new Compe_Bancaire();
		Compe_Bancaire cb2 = new Compe_Bancaire(2500.0f, "BObby", "31258GHHGG");
		//ATTENTION ! Jamais de this dans un main !!
		
				cb1.porteur = "Biloo";
				cb1.solde = 215487.10f;
				cb1.IBAN = "FHRKISTRSRR-FR";
				
				cb1.affiche();
				cb1.deposer(1000.00f);
				cb1.retirer(4000);
				
				System.out.println();
				cb2.affiche();
				cb2.deposer(500.00f);
				cb2.retirer(10000);
				
				// op�ration du virement
				cb1.virement(cb2,300000);
				
			}

		}
