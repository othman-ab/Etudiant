package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Etudiant;
import com.gestion.Etudiants.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantServiceImp implements EtudiantService{
        @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiantById(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public void deleteAllEtudiant() {
        etudiantRepository.deleteAll();
    }
}
