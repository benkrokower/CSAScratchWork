public class Algorithms {
   
   public static void main(String[] args) {
      System.out.println(largestRandomNumber(10));
   }
   
   public static int sumAllNumbersLessThan(int num) {
      int value = 0;
      
      for (int i = 1; i < num; i++) {
         value += i;
      }
      return value;
   }
   
   public static int largestRandomNumber(int loopTimes) {
      int max = -10000;
      for (int i = 0; i <= loopTimes; i++) {
         int num = (int) (Math.random() * 10000);
         if (num > max) {
            max = num;
         }
      }
      return max;
   }   
}