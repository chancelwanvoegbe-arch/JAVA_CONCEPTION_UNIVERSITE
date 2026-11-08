public class Main {
    public static void main(String[] args) {
        Universite univ = new Universite("Université Mohammed V");

        // Création des adresses
        Adresse a1 = new Adresse("12 Rue de Fès", "Casablanca", "20000");
        Adresse a2 = new Adresse("45 Avenue Hassan II", "Rabat", "10000");
        Adresse a3 = new Adresse("8 Rue des Écoles", "Casablanca", "20000");

        // 4 Étudiants
        Etudiant e1 = new Etudiant("Alami", "Salma", "salma@mail.com", a1, "E001", "Génie Info");
        e1.ajouterNote(18); e1.ajouterNote(15); // Moyenne 16.5

        Etudiant e2 = new Etudiant("Bennani", "Youssef", "youssef@mail.com", a2, "E002", "Réseaux");
        e2.ajouterNote(12); e2.ajouterNote(14); // Moyenne 13

        Etudiant e3 = new Etudiant("Amrani", "Amine", "amine@mail.com", a3, "E003", "Génie Info");
        e3.ajouterNote(19); e3.ajouterNote(17); // Moyenne 18 -> Le meilleur

        Etudiant e4 = new Etudiant("Chakir", "Nadia", "nadia@mail.com", null, "E004", "Data Science"); // Sans adresse
        e4.ajouterNote(10); e4.ajouterNote(11); // Moyenne 10.5

        // 2 Enseignants (dont un sans adresse)
        Enseignant ens1 = new Enseignant("Tazi", "Karim", "karim@mail.com", a1, "Java", 20); // Surchargé (>18h)
        Enseignant ens2 = new Enseignant("Fassi", "Meryem", "meryem@mail.com", null, "Mathématiques", 15); // Sans adresse

        // Ajout à l'université
        univ.ajouter(e1);
        univ.ajouter(e2);
        univ.ajouter(e3);
        univ.ajouter(e4);
        univ.ajouter(ens1);
        univ.ajouter(ens2);

        // Tests
        univ.presenterTous();
        univ.compterParType();

        Etudiant best = univ.meilleurEtudiant();
        if (best != null) {
            System.out.println("\nLe meilleur étudiant est " + best.nomComplet() + ".");
        }

        System.out.println();
        univ.listerParVille("Casablanca"); // Doit afficher Salma et Amine (et non Nadia sans adresse)
    }
}