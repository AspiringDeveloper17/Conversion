import java.util.Scanner;

public class Conversion {

    public int binaryToDecimal(int binary) {
        double finalValue=0;
        int i=0;

        while(binary>0){
          int num= binary % 10;
          finalValue=finalValue+ num* Math.pow(2,i);
          i++;
          binary=binary/10;
      }
      return (int)finalValue;
    };

    public int decimalToBinary(int decimal){
        double finalValue=0;
        int i=0;
        while(decimal>0){
            int num=decimal%2;
            finalValue=finalValue+num*Math.pow(10,i);
            i++;
            decimal=decimal/2;
        }
        return (int) finalValue;
    }

    public static void main(String[] args) {
        Conversion nextLines= new Conversion();
        Scanner scan= new Scanner(System.in);
        System.out.println("Do you wish to convert to or from binary. Answer either 'from' or 'to'.");
        String nextLine= scan.nextLine();

        if(nextLine.equals("from")){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the number.");
            int toConvert= scanner.nextInt();
            int result=nextLines.binaryToDecimal(toConvert);
            System.out.println("Result: "+result);
        }

        if(nextLine.equals("to")){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter a positive number.");
            int toConvert=scanner.nextInt();
            int result= nextLines.decimalToBinary(toConvert);
            System.out.println("Result: "+result);
        }

        else System.out.println("That's not one of the options mate.");

    }

}