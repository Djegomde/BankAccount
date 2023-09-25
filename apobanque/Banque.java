package apobanque;

/**
 * Le sujet pour compléter ces fichiers se trouve ici:
 * http://l3miagelw.free.fr/apogrenoble/tp03/compte.html
 */
public class Banque {

    // Nom de la banque
    String nom;

    // Liste des comptes clients
    CompteBancaire[] comptes;

    Banque(String nom, CompteBancaire[] comptes) {
        // TODO
        this.nom = nom;
        this.comptes = comptes;
    }

    String description() {
        System.out.print("Banque :" + nom + "[avoir total :" + avoirTotal() + "]");
        comptes = new CompteBancaire[comptes.length];
        for (CompteBancaire compte : comptes) {
            System.out.println("Client :" + compte.client);
            System.out.println("Numéro : " + compte.numero);
            if (compte.estADecouvert()) {
                System.out.println("Solde Débiteur :" + compte.solde);
            } else {
                System.out.println("Solde Crediteur :" + compte.solde);
            }
            System.out.println("Découverte autorisé :" + compte.decouvert);
        }
        return null;
        // TODO

    }

    double avoirTotal() {
        return 0;
        // TODO
    }

    void afficheNumeroComptesDebitsPlanchers() {
        // TODO
    }
}
