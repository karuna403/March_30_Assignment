import java.util.Scanner;
public class MarksDiscount  {
    public static void main(String args[]) {
        System.out.println("enter Fees:");
      Scanner sc=new Scanner(System.in);
      int Fees=sc.nextInt();
      if(Fees>32767){
      System.out.println("Invalid fee");
      }
     
     else{
          System.out.println(Fees);
      
      System.out.println("Enter marks:");
      int SMarks=sc.nextInt();
      System.out.println(SMarks);
      int d=0;
      float DA=0;
      if(Fees<0 || SMarks<0){
          System.out.println("Invalid input");
      }
      else if(SMarks>100){
          System.out.println("Invalid Marks");
      }
      else{
      if(SMarks>90){
          d=50;
          System.out.println("Discount is:"+d+"%");
          
          
      }
      else if(SMarks>=81 && SMarks<=90){
          d=25;
          System.out.println("Discount is:"+d+"%");
       }
else if(SMarks>=70 && SMarks<=80){
          d=10;
          System.out.println("Discount is:"+d+"%");
      }
      else if(SMarks<70){
          d=0;
          System.out.println("Discount is:"+d+"%");
      }
      else{
          System.out.println("invalid");
      }
      DA=(float)(Fees*d)/(float)100;
      System.out.println("Discount price is:"+DA);
      
}
}
      
    }
}
