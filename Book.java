import java.util.*;
        public class Book{
            public String Isbn;
            public String Title;
            public String Authors;
            public String Price;
            public String Stock;
        
        Book(String isbn, String title, String authors, String price, String stock){
            Isbn=isbn;
            Title=title;
            Authors=authors;
            Price=price;
            Stock=stock;
        }
        
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first book isbn: ");
            String a=sc.nextLine();
            System.out.println(a);
            System.out.println("Enter first book title: ");
            String b=sc.nextLine();
            System.out.println(b);
            System.out.println("Enter first book authors: ");
            String c=sc.nextLine();
            System.out.println(c);
            System.out.println("Enter first book price: ");
            String d=sc.nextLine();
            System.out.println(d);
            System.out.println("Enter first book stock: ");
            String e=sc.nextLine();
            System.out.println(e);
            ;
            System.out.println("Enter second book isbn: ");
            String f=sc.nextLine();
            System.out.println(f);
            System.out.println("Enter second book title: ");
            String g=sc.nextLine();
            System.out.println(g);
            System.out.println("Enter second book authors: ");
            String h=sc.nextLine();
            System.out.println(h);
            System.out.println("Enter second book price: ");
String i=sc.nextLine();
            System.out.println(i);
            System.out.println("Enter second book stock: ");
            String j=sc.nextLine();
            System.out.println(j);
            Book b1=new Book(a,b,c,d,e);
            Book b2=new Book(f,g,h,i,j);
            List<Book>t=new ArrayList<Book>();
            t.add(b1);
            t.add(b2);
            
            for(Book s:t){ 
                
                System.out.println(s.Isbn+" "+s.Title+" "+s.Authors+" "+s.Price+" "+s.Stock);
            }
            
            System.out.println("enter the booktitle you want to buy:");
            String bname=sc.nextLine();
            System.out.println(bname);
            
            int count=0;
            float p=0;
            System.out.println("enter quantity:");
            int n=sc.nextInt();
            System.out.println(n);
            
            for(Book s:t){
                if(Integer.parseInt(s.Stock)!=0){
                if((s.Title.toLowerCase()).equals(bname)){
                    
                count=Integer.parseInt(s.Stock);
                count=count-n;
                
                System.out.println(s.Title+" books remaining Stock is:"+count);
                 p=Float.parseFloat(s.Price)*(float)n;
                 System.out.println( "Bill is:"+p);
             }
                }
                else if(s.Title.toLowerCase().equals(bname) && Integer.parseInt(s.Stock)==0){
                    System.out.println("for "+s.Title+" books no stock is there");
                }
            }
                
            
           }
        }