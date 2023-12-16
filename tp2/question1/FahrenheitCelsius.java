package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (Mariane)
 * @version (12/16/2023)
 */
import java.util.Scanner;
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        
        int fahrenheit1 = Integer.parseInt(args[0]);
        int fahrenheit2 = Integer.parseInt(args[1]);
        int fahrenheit3 = Integer.parseInt(args[2]);

       float celsius1 = fahrenheitEnCelsius(fahrenheit1);
       float celsius2 = fahrenheitEnCelsius(fahrenheit2);
       float celsius3 = fahrenheitEnCelsius(fahrenheit3);

       System.out.println(fahrenheit1 + "\u00B0F -> " + celsius1 + "\u00B0C");
       System.out.println(fahrenheit2 + "\u00B0F -> " + celsius2 + "\u00B0C");
       System.out.println(fahrenheit3 + "\u00B0F -> " + celsius3 + "\u00B0C");
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
       float x = (float) f; 
       float resultat = (x - 32) * 5 / 9;
       return ((int) (resultat * 10)) / 10.0f;
     
    }

}
