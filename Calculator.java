public class Calculator{
    public static int powerInt(int num1,int num2){
        return (int)Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
   public static void main(String [] args){
        int result1 = powerInt(2,4);
       double result2 = powerDouble(2.5,3);
       System.out.println("Result of powerInt(2, 4): " +result1);
       System.out.println("Result of powerDouble(2.5, 3): " +result2);
   }
}