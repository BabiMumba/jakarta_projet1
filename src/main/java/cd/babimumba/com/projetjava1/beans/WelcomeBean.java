/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.babimumba.com.projetjava1.beans;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

/**
 *
 * @author Babi Mumba
 */
@Named("WelcomeBean")
@RequestScoped

public class WelcomeBean {
    private String nom;
    private String message;

    private double montantRoupie;
    private double montantConverti;
    private String devise;
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getMessage(){
        return message;
    }
    
   public double getMontantRoupie() {
    return montantRoupie;
}

public void setMontantRoupie(double montantRoupie) {
    this.montantRoupie = montantRoupie;
}

public double getMontantConverti() {
    return montantConverti;
}

public String getDevise() {
    return devise;
}

public void setDevise(String devise) {
    this.devise = devise;
}

public void convertir() {
    if ("dollar".equals(devise)) {
        double tauxDeConversion = 0.012;
        montantConverti = montantRoupie * tauxDeConversion;
    } else if ("fc".equals(devise)) {
        double tauxDeConversion = 20.0; // Supposons que le taux de conversion est de 20 FC pour 1 roupie
        montantConverti = montantRoupie * tauxDeConversion;
    }
}
    
    
    
    public void afficherMessage(){
        if(nom != null && !nom.trim().isEmpty()){
            message = "Bonjour et bienvenue, " + nom + "!";
        }else{
            message = "";
        }
    }

    //
    
    
    
    
    
}
