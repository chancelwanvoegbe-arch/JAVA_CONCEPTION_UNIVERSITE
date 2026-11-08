public class Etudiant extends Personne {
    private String numero;
    private String filiere;
    private double sommeNotes;
    private int nombreNotes;

    public Etudiant(String nom, String prenom, String email, Adresse adresse, String numero, String filiere) {
        super(nom, prenom, email, adresse);
        this.numero = numero;
        this.filiere = filiere;
        this.sommeNotes = 0;
        this.nombreNotes = 0;
    }

    public void ajouterNote(double note) {
        this.sommeNotes += note;
        this.nombreNotes++;
    }

    public double calculerMoyenne() {
        if (nombreNotes == 0) return 0.0;
        return sommeNotes / nombreNotes;
    }

    @Override
    public void presenter() {
        super.presenter(); // Affiche les infos de base
        System.out.println("Je suis étudiant(e) en " + filiere + ", numéro " + numero
                + ". Ma moyenne est de " + String.format("%.2f", calculerMoyenne()) + "/20.");
    }
}