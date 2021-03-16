package sn.samba.domain;

import java.util.List;

public class Classe {
    private int id;
    private String libelle;
    private List<Matiere> matieres;

    public Classe(int id, String libelle, List<Matiere> matieres) {
        this.id = id;
        this.libelle = libelle;
        this.matieres = matieres;
    }


    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }
}
