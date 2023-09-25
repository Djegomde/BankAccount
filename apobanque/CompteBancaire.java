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
        this.solde = 100.0;
        this.decouvert = 50.0;
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
            solde = (solde - montant);
            possible = true;
        } else {
            possible = false;
        }
        return possible;
    }

    // méthodes estADecouvert() qui renvoie true si le solde du compte du client est
    // négative.
    boolean estADecouvert() {
        boolean i = false;
        if (this.solde < 0) {
            i = true;

        }
        return i;
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
        if (solde < 0) {
            String text = "Client :" + this.client + "\n" + "Numéro du Compte :" + this.numero + "\n"
                    + "Solde Débiteur :"
                    + this.solde
                    + "\n"
                    + "Decouverte autorisé:  " + this.decouvert + "\n";
            return text;
        } else {
            String text = "Client :" + this.client + "\n" + "Numéro du Compte :" + this.numero + "\n"
                    + "Solde Créditeur :"
                    + this.solde
                    + "\n"
                    + "Decouverte autorisé:  " + this.decouvert + "\n";
            return text;
        }

    }
}
