package ch.heigvd.res.lab00;

/**
 *
 * @author Valentin Schaad
 */
public class Flute implements IInstrument {
   private final int volume = 5;
   private final String color = "white";
   
   public String play(){
      return "";
   }
   
   public int getSoundVolume(){
      return volume;
   }
   
   public String getColor(){
      return color;
   }
}
