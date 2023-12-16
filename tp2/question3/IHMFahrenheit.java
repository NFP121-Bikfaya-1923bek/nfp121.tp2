package question3;

//import question1.*;
import question2.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout (FlowLayout.CENTER));
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground(new Color(0xc0c0c0));
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      // valeur est une String et doit �tre convertie en entier, voir java.lang.Integer m�thode parseInt (--> try/catch
      // � compl�ter, en appelant la m�thode ad'hoc de la question2 
     // float celsiuss = FahrenheitCelsius.fahrenheitEnCelsius(fahrenheit1);
       int fahrenheit1 = Integer.parseInt(entree.getText());
       float celsiuss = FahrenheitCelsius.fahrenheitEnCelsius(fahrenheit1);
       if (celsiuss >= -273.1) {
                sortie.setText(Float.toString(celsiuss)+ "\u00B0C");
            } else {
                sortie.setText("-273.1\u00B0F ");
            }
      
        
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }

  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
