public class Universite {
    private String nom;
    private Personne[] membres;
    private int compteur;

    public Universite(String nom) {
        this.nom = nom;
        this.membres = new Personne[50];
        this.compteur = 0;
    }

    public void ajouter(Personne p) {
        if (compteur < 50 && p != null) {
            membres[compteur] = p;
            compteur++;
        }
    }

    public void presenterTous() {
        System.out.println("--- Membres de l'université " + nom + " ---");
        for (int i = 0; i < compteur; i++) {
            membres[i].presenter(); // Polymorphisme : la bonne version s'exécute
            System.out.println();
        }
    }

    public void compterParType() {
        int nbEtudiants = 0;
        int nbEnseignants = 0;
        for (int i = 0; i < compteur; i++) {
            if (membres[i] instanceof Etudiant) {
                nbEtudiants++;
            } else if (membres[i] instanceof Enseignant) {
                nbEnseignants++;
            }
        }
        System.out.println("Il y a " + nbEtudiants + " étudiant(s) et " + nbEnseignants + " enseignant(s).");
    }

    public Etudiant meilleurEtudiant() {
        Etudiant meilleur = null;
        double meilleureMoyenne = -1;

        for (int i = 0; i < compteur; i++) {
            if (membres[i] instanceof Etudiant) {
                // On doit caster (convertir) pour appeler calculerMoyenne()
                Etudiant e = (Etudiant) membres[i];
                if (e.calculerMoyenne() > meilleureMoyenne) {
                    meilleureMoyenne = e.calculerMoyenne();
                    meilleur = e;
                }
            }
        }
        return meilleur; // Renvoie null si aucun étudiant trouvé
    }

    public void listerParVille(String ville) {
        System.out.println("--- Membres habitant à " + ville + " ---");
        for (int i = 0; i < compteur; i++) {
            Adresse a = membres[i].getAdresse(); // On récupère l'adresse
            if (a != null && a.getVille().equalsIgnoreCase(ville)) {
                System.out.println("- " + membres[i].nomComplet());
            }
        }
    }
}