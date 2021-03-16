package sn.samba.domain;

public class Note {
    private int id;
    private double noteExam;
    private double noteControle;
    private Eleve eleve;
    private Matiere matiere;

    public Note(int id, double noteExam, double noteControle, Eleve eleve, Matiere matiere) {
        this.id = id;
        this.noteExam = noteExam;
        this.noteControle = noteControle;
        this.eleve = eleve;
        this.matiere = matiere;
    }

    public int getId() {
        return id;
    }

    public double getNoteExam() {
        return noteExam;
    }

    public double getNoteControle() {
        return noteControle;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public Matiere getMatiere() {
        return matiere;
    }
}
