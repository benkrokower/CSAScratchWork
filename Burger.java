public class Burger {

   // instance variables
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int numberOfBites;
   
   // constructors
   // first let's do the no-argument constructor
   public Burger() {
      numberOfBites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 30;
      burgerName = "Craig the Burger";
   }
   
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName) {
      this.numberOfBites = 0;
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
   }
   
   // Methods go here
   public void bite() {
      System.out.println("Chomp...");
      numberOfBites++;
   }
   
   public int getNumberOfBites() {
      return numberOfBites;
   }
   
   public static String getBurgerRecipe() {
      return "Cook burger, put on bun, add condiments";
   }
   
   public static void main(String[] args) {
      // create a Burger object using the no argument constructor
      Burger basicBurger = new Burger();
      
      // create a Burger object using the constructor with arguments
      Burger benBurger = new Burger(3, true, 45, "Krokower's awesome burger");
      
      // Take a bite out of either burger
      benBurger.bite();
      benBurger.bite();
      benBurger.bite();
      benBurger.bite();
      benBurger.bite();
      
      // get the number of bites taken out of the burger
      System.out.println(benBurger.getNumberOfBites());
      
      // call the class method "getBurgerRecipe()"
      System.out.println(Burger.getBurgerRecipe());
   }
}