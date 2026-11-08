
public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;

    public Adresse(String rue, String ville, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getVille() { return ville; }

    public void afficher() {
        System.out.print(rue + ", " + codePostal + " " + ville);
    }
}