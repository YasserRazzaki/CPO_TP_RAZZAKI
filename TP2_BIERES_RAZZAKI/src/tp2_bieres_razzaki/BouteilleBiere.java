/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_razzaki;

/**
 *
 * @author Yasser
 */
public class BouteilleBiere{
    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
      public BouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean Etreouverte) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = Etreouverte; 
 System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie) ;
}
       @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
      public void Décapsuler(){
          if (ouverte!= true) 
          {System.out.println("La chance, bierre fermee!") ;
              ouverte = true;}
            else {
              System.out.println("Trouve une autre bierre, celle-ci est ouverte") ;
              ouverte = false; }
      }
        public boolean TestOuverte() {
        return ouverte;
    }
}


/* public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
    
    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
    
}
*/

