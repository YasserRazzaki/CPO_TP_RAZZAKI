/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_razzaki;

/**
 *
 * @author Yasser
 */
public class TP2_BIERES_RAZZAKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvee des trolls";
        uneBiere.brasserie = "Dubuisson";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.ouverte = false;
    BouteilleBiere Leffe = new BouteilleBiere() ;
    Leffe.nom = "Leffe";
        Leffe.brasserie = "Abbaye de Leffe";
        Leffe.degreAlcool = 6.6 ;
        Leffe.ouverte = true;
uneBiere.lireEtiquette();
Leffe.lireEtiquette();
        // TODO code application logic here
    }
}