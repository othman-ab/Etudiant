package com.gestion.Etudiants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Note")
@AllArgsConstructor
@NoArgsConstructor

public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idNote;
    private float valeur;
    @OneToOne()
    private Exam exam;

    @ManyToOne()
    private Etudiant etudiant;

    public long getIdNote() {
        return idNote;
    }

    public void setIdNote(long idNote) {
        this.idNote = idNote;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Note(float valeur, Exam exam, Etudiant etudiant) {
        this.valeur = valeur;
        this.exam = exam;
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Note{" +
                "idNote=" + idNote +
                ", valeur=" + valeur +
                ", exam=" + exam +
                ", etudiant=" + etudiant +
                '}';
    }
}
