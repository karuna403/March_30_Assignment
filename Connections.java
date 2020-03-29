import java.util.Scanner;
public class Connections {
    public static void main(String args[]) {
        System.out.println("enter array size:");
        int temp=0;
        int FCount=0; int SCount=0;
         int TCount=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter array elements:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            temp=arr[i]/1000;
            System.out.println(temp);
        
        if(temp==2){
            FCount++;
         }
        else if(temp==3){
            SCount++;
        }
        else if(temp==4){
            TCount++;
        }
        }
        System.out.println("2G ConnectionCount:"+FCount);
        System.out.println("3G ConnectionCount:"+SCount);
        System.out.println("4G ConnectionCount:"+TCount);
        
    }
}