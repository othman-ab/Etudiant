package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Cours;
import com.gestion.Etudiants.entities.Etudiant;
import com.gestion.Etudiants.repositories.CoursRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CoursService {

    Cours saveCours(Cours cours);
    Cours updateCours(Cours cours);
    Cours getCours(long idCour);
    List<Cours> getAllCours();
    void deleteCoursById(long idCour);
    void deleteAllCours();

}
