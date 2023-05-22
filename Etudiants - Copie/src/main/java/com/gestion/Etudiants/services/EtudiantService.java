package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Etudiant;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtudiantService {
    Etudiant saveEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant getEtudiant(long idEtudiant);
    List<Etudiant>getAllEtudiant();
    void deleteEtudiantById(long idEtudiant);
    void deleteAllEtudiant();


}
