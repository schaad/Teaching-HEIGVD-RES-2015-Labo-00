package ch.heigvd.res.lab00;

/**
 *
 * @author Valentin Schaad
 */
public class Trumpet implements IInstrument{
   private final int volume = 10;
   private final String color = "golden";
   
   public String play(){
      return "pouet";
   }
   
   public int getSoundVolume(){
      return volume;
   }
   
   public String getColor(){
      return color;
   }
}
