/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.babimumba.com.projetjava1.beans;

/**
 *
 * @author Babi Mumba
 */
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@Named("lieuBean")
@RequestScoped
public class LieuBean {
 // attributs
    private String nom;
    private String description;
    private String latitude;
    private String longitude;
    private String lieuDetails;
      private List<String> lieuxDetails;

    // constructeur
    public LieuBean() {
        lieuxDetails = new ArrayList<>();
    }

    // getters et setters
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLieuDetails() {
        return lieuDetails;
    }


    public List<String> getLieuxDetails() {
        return lieuxDetails;
    }

    public void ajouterLieu() {
        String detail = "Nom: " + nom + ", Description: " + description + ", Latitude: " + latitude + ", Longitude: " + longitude;
        lieuxDetails.add(detail);
        annuler();//pour vider les champs
    }

    public void annuler() {
        nom = "";
        description = "";
        latitude = "";
        longitude = "";
        lieuDetails = "";
    }
}