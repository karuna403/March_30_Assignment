import java.util.Scanner;
     public class ProfitYear {
    public static void main(String args[]) {
        System.out.println("enter array size:");
        int i=0; int j=0; int temp=0; int k=0;
        //Scanner we are getting the input
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println("Enter array elements:");
      int arr[]=new int[a];
      
      int b[]=new int[a];
      for( i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
          System.out.println(arr[i]);
      }
    //Sorting of profit elements into another array
      for( i=0;i<arr.length; i++){
        if(i%2!=0){
            //in b[j] we are getting profit elements
             b[j]=arr[i];
             
              if(b[j]>temp){
                  //In temp we are getting the highest profit
                  temp=b[j];
                  }
    }
          }
       
     for(i=0;i<arr.length; i++){
       if(temp==arr[i]){
           //here we are printing the year in which we are getting the highest profit
          
          System.out.println( "year in which we are getting highest profit is: "+arr[i-1]);
                      
                  }
}
        
    }
}