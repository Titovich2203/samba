package sn.samba.domain;

public class Eleve {
    //mat, nomComplet, sexe, classe, mail, specialite, login, mdp
    private int id;
    private String mat;
    private String nomComplet;
    private String sexe;
    private String email;
    private String login;
    private String mdp;
    private Classe classe;

    public Eleve(int id, String mat, String nomComplet, String sexe, String email, String login, String mdp, Classe classe) {
        this.id = id;
        this.mat = mat;
        this.nomComplet = nomComplet;
        this.sexe = sexe;
        this.email = email;
        this.login = login;
        this.mdp = mdp;
        this.classe = classe;
    }

    public int getId() {
        return id;
    }

    public String getMat() {
        return mat;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getSexe() {
        return sexe;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public Classe getClasse() {
        return classe;
    }
}
