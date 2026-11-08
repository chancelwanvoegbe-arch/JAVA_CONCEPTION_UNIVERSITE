public class Enseignant extends Personne {
    private String specialite;
    private int heuresParSemaine;

    public Enseignant(String nom, String prenom, String email, Adresse adresse, String specialite, int heuresParSemaine) {
        super(nom, prenom, email, adresse);
        this.specialite = specialite;
        this.heuresParSemaine = heuresParSemaine;
    }

    @Override
    public void presenter() {
        super.presenter();
        System.out.println("Je suis enseignant(e) de " + specialite
                + ", je travaille " + heuresParSemaine + "h/semaine.");
    }

    public boolean estSurcharge() {
        return heuresParSemaine > 18;
    }
}