/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.babimumba.com.projetjava1.beans;

/**
 *
 * @author Babi Mumba
 */
import cd.babimumba.com.projetjava1.beans.business.LieuEntrepriseBean;
import cd.babimumba.com.projetjava1.beans.entities.Lieu;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("lieuBean")
public class LieuBean implements Serializable {

    private String nom;
    private String description;
    private double longitude;
    private double latitude;
    private int id;
    private List<Lieu> lieux = new ArrayList<>();

    @Inject
    private LieuEntrepriseBean lieuEntrepriseBean;

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public List<Lieu> getLieux() { return lieuEntrepriseBean.listerTousLesLieux(); }

    public void ajouterLieu() {
        if (nom != null && !nom.isEmpty() && description != null && !description.isEmpty()) {
            lieuEntrepriseBean.ajouterLieuEntreprise(nom, description, latitude, longitude);
            // Réinitialiser les champs après l'ajout
            this.nom = "";
            this.description = "";
            this.longitude = 0;
            this.latitude = 0;
        }
    }

    public void modifierLieu() {
        if (id > 0 && nom != null && !nom.isEmpty() && description != null && !description.isEmpty()) {
            lieuEntrepriseBean.modifierLieu(id, nom, description, latitude, longitude);
            // Réinitialiser les champs après la modification
            this.id = 0;
            this.nom = "";
            this.description = "";
            this.longitude = 0;
            this.latitude = 0;
        }
    }

    public void supprimerLieu(int id) {
        lieuEntrepriseBean.supprimerLieu(id);
    }

    public void chargerLieu(int id) {
        Lieu lieu = lieuEntrepriseBean.trouverLieuParId(id);
        if (lieu != null) {
            this.id = lieu.getId();
            this.nom = lieu.getNom();
            this.description = lieu.getDescription();
            this.longitude = lieu.getLongitude();
            this.latitude = lieu.getLatitude();
        }
    }
}