public class Personne {
    protected String nom;
    protected String prenom;
    protected String email;
    protected Adresse adresse; // Peut être null

    public Personne(String nom, String prenom, String email, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
    }

    public String nomComplet() {
        return prenom + " " + nom;
    }

    public void presenter() {
        System.out.println("Je suis " + nomComplet() + " (email : " + email + ").");
        if (adresse != null) {
            System.out.print("J'habite à : ");
            adresse.afficher();
            System.out.println();
        } else {
            System.out.println("Adresse non renseignée.");
        }
    }

    public Adresse getAdresse() { return adresse; }
}