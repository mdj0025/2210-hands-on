/**
 * WarEagle.java
 * Prints an Auburn cheer to standard out.
 * Used in the Getting Started lab for COMP 2210.
 * 
 * @author   Dean Hendrix (dh@auburn.edu)
 * @version  2015-08-14
 *
 */
public final class WarEagle {
 
   /**
    * Driver for the WarEagle class.
    */
   public static void main(String[] args) {
      System.out.println(cheer1());
      System.out.println(cheer2());
   }
 
   /**
    * Returns a string that represents an Auburn cheer.
    */
   public static String cheer1() {
      return "War Eagle!";
   }

   /**
    * Returns a string that represents an Auburn cheer.
    */
   public static String cheer2() {
      return "Bodda getta, bodda getta, bodda getta, bah!";
   }
 
}
