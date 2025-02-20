/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package cd.babimumba.com.projetjava1.beans.business;
/**
 *
 * @author Babi Mumba
 */

import cd.babimumba.com.projetjava1.beans.entities.Lieu;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@Stateless
@LocalBean
public class LieuEntrepriseBean {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void ajouterLieuEntreprise(String nom, String description, double latitude, double longitude) {
        Lieu lieu = new Lieu(nom, description, latitude, longitude);
        em.persist(lieu);
    }

    public List<Lieu> listerTousLesLieux() {
        return em.createQuery("SELECT L FROM Lieu L", Lieu.class).getResultList();
    }

    @Transactional
    public void supprimerLieu(int id) {
        Lieu lieu = em.find(Lieu.class, id);
        if (lieu != null) {
            em.remove(lieu);
        }
    }

    public Lieu trouverLieuParId(int id) {
        return em.find(Lieu.class, id);
    }

    @Transactional
    public void modifierLieu(int id, String nom, String description, double latitude, double longitude) {
        Lieu lieu = em.find(Lieu.class, id);
        if (lieu != null) {
            lieu.setNom(nom);
            lieu.setDescription(description);
            lieu.setLatitude(latitude);
            lieu.setLongitude(longitude);
            em.merge(lieu);
        }
    }
}