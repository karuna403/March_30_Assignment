import java.util.*;
public class SalesMan{
    public String Id;
    public String Name;
    public String Degree;
    public static String d;
    
    SalesMan(String id, String name, String degree){
        Id=id;
        Name=name;
        Degree=degree;
        
    }
    
    public static void main(String[] args){
        SalesMan s1=new SalesMan("M10001", "kaveri","Btech");
        SalesMan s2=new SalesMan("M10065", "Manu","PG");
        SalesMan s3=new SalesMan("M10124","Vishu", "PG");
        SalesMan s4=new SalesMan("M10136","Nagraj", "Btech");
        SalesMan s5=new SalesMan("M10135","Varma", "Btech");
        
        
        
        List <SalesMan> a=new ArrayList<SalesMan>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
        
        for(SalesMan s:a){
            System.out.println(s.Id+" "+s.Name+" "+s.Degree);
        }
        System.out.println("enter required id who are selected for this job: (M is same for all ids remaining part you will enter)");
        
        Scanner sc=new Scanner(System.in);
        String k="MXXXXX";
        System.out.print(k.substring(0,1));
        String c=k.substring(1,6);
        c=sc.nextLine();
         
        System.out.println(c);
        for(SalesMan s:a){
             if(s.Id.substring(1,6).trim().equals(c)){
                
           System.out.println("Required id details are:\n "+ s.Id+" "+s.Name+" "+s.Degree+"\n you are selected for this post of sales man");
        }
        
        }
        
        
    }
}