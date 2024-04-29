package ma.ac.iga.pfemoteurrechercheemploi.entities;

public abstract class Utilisateur {
    int id;
    String email;
    String motPass;
    String nom;
    String position;
    int gsm;

    //Constructeur par défaut
    public Utilisateur() {

    }
    public Utilisateur(int id, String email, String motPass, String nom, String position, int gsm) {
        this.id = id;
        this.email = email;
        this.motPass = motPass;
        this.nom = nom;
        this.position = position;
        this.gsm = gsm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotPass() {
        return motPass;
    }

    public void setMotPass(String motPass) {
        this.motPass = motPass;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGsm() {
        return gsm;
    }

    public void setGsm(int gsm) {
        this.gsm = gsm;
    }
}

