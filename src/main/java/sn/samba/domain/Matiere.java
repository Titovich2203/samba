package sn.samba.domain;

public class Matiere {
    private int id;
    private String libelle;

    public Matiere(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }
}
