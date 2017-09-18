/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.Person; // sert à utiliser une librairie.

/**
 *
 * @author Francis Coulilbaly
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour Ibrahim Francis Junior Coulibaly.");
        Person zied = new Person("zied", "Zaier", 33);
        System.out.println(zied.getFirstName());
        System.out.println(zied.getLastName());
        System.out.println(zied.getAge());
        zied.setFirstName("Jean");
        System.out.println(zied.getFirstName());
        System.out.print("hello world");
    }
    
}
