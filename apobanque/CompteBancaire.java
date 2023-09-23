package apobanque;

/**
 * Le sujet pour compléter ces fichiers se trouve ici:
 * http://l3miagelw.free.fr/apogrenoble/tp03/compte.html
 */
class CompteBancaire {

    // Declaration des attributs de la classe CompteBancaire
    int numero;
    String client;
    double solde;
    double decouvert;

    // Premier Constructeur
    CompteBancaire() {
        this.numero = 0;
        this.client = "John Doe";
        this.solde = 0.0;
        this.decouvert = 0.0;
    }

    // Deuxieme Constructeur
    CompteBancaire(int numero, String nom) {
        this.numero = numero;
        this.client = nom;
        this.solde = 100;
        this.decouvert = 50;
    }

    // Troisième Constructeur
    CompteBancaire(int numero, String nom, double somme) {
        this.numero = numero;
        this.client = nom;
        this.solde = (somme / 2);
        this.decouvert = (somme / 2);
    }

    // méthode qui permet de deposer l'argent dans le compte
    void depot(double montant) {
        if (montant > 0) {
            this.solde = solde + montant;
        } else {
            System.out.println("Montant ne peut pas être négatif");
            this.solde = solde + 0;
        }

    }

    // méthode retrait qui effectue le retrait maximum possible et renvoie true si
    // le client a pu obtenir la somme qu'il souhaitait, false sinon.
    boolean retrait(double montant) {
        boolean possible;
        double maxi_autorise = (solde + decouvert);

        if (montant >= 0 && montant < solde) {
            solde -= montant;
            possible = true;

        } else if (montant >= 0 && montant <= maxi_autorise) {
            solde = (maxi_autorise - montant);
            possible = true;
        } else {
            possible = false;
        }
        return possible;
    }

    // méthodes estADecouvert() qui renvoie true si le solde du compte du client est
    // négative.
    boolean estADecouvert() {
        if (this.solde > 0) {
            return false;
        }
        return true;
    }

    int getNumero() {
        return this.numero;
    }

    String getClient() {
        return this.client;
    }

    double getSomme() {
        return this.solde;

    }

    String infos() {
        String text = "Client :" + this.client + "\n" + "Numéro  :" + this.numero + "\n" + "Solde :" + this.solde + "\n"
                + "Decouverte :  " + this.decouvert + "\n";
        return text;
    }
}
