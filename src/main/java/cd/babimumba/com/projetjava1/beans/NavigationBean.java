/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.babimumba.com.projetjava1.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.IOException;

/**
 *
 * @author Babi Mumba
 */

@Named("NavigationBean")
@RequestScoped
public class NavigationBean {

    //pour la navigation
    public void voirApropo() {
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("a_propos.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void visiter() {
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ajouter() {
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("lieu.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
