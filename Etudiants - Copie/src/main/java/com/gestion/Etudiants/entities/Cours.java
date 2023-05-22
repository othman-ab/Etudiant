package com.gestion.Etudiants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

import java.util.Date;
@Entity
@Table(name="Cours")
@AllArgsConstructor
@NoArgsConstructor

public class Cours {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idCour;
        private String nom;
        private String description;
        private double prix;
        private Date date_inscription;
        @ManyToOne()
        private Etudiant etudiant;
        @OneToOne()
        private Exam exam;

        public long getIdCour() {
            return idCour;
        }

        public void setIdCour(long idCour) {
            this.idCour = idCour;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public Date getDate_inscription() {
            return date_inscription;
        }

        public void setDate_inscription(Date date_inscription) {
            this.date_inscription = date_inscription;
        }

        public Etudiant getEtudiant() {
            return etudiant;
        }

        public void setEtudiant(Etudiant etudiant) {
            this.etudiant = etudiant;
        }

        public Exam getExam() {
            return exam;
        }

        public void setExam(Exam exam) {
            this.exam = exam;
        }

        public Cours(String nom, String description, double prix, Date date_inscription, Etudiant etudiant, Exam exam) {
            this.nom = nom;
            this.description = description;
            this.prix = prix;
            this.date_inscription = date_inscription;
            this.etudiant = etudiant;
            this.exam = exam;
        }

        @Override
        public String toString() {
            return "Cour{" +
                    "idCour=" + idCour +
                    ", nom='" + nom + '\'' +
                    ", description='" + description + '\'' +
                    ", prix=" + prix +
                    ", date_inscription=" + date_inscription +
                    ", etudiant=" + etudiant +
                    ", exam=" + exam +
                    '}';
        }
    }


