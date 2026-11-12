// class declaration
public class Pen {

   // instance variable
   String penColor;
   
   // constructor
   public Pen() {
      penColor = "purple";
   }
   
   public Pen(String inkColor) {
      penColor = inkColor;
   }
   
   // method declarations
   public String write(String wordToWrite) {
      return "writing in " + penColor + "ink: " + wordToWrite;
   }
   
   public String takeOffCap() {
      return "POP";
   }
}