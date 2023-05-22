package com.gestion.Etudiants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name="Exam")
@AllArgsConstructor
@NoArgsConstructor

public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idExam;
    private Date dateExam;
    @OneToOne()
    private Note note;

    public long getIdExam() {
        return idExam;
    }

    public void setIdExam(long idExam) {
        this.idExam = idExam;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public void setDateExam(Date dateExam) {
        this.dateExam = dateExam;
    }


    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Exam(Date dateExam,Note note) {
        this.dateExam = dateExam;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "idExam=" + idExam +
                ", dateExam=" + dateExam +
                ", note=" + note +
                '}';
    }
}
