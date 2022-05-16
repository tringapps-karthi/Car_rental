package p1;
import java.util.*;
public class  User
{
    
static ArrayList<Addcar> Acar=new ArrayList<Addcar>();
static ArrayList<Acat> A=new ArrayList<Acat>();
static ArrayList<Admin> app_user_detail=new ArrayList<Admin>();
static ArrayList<Apick> Ap=new ArrayList<Apick>();

     String f_name;
     int passw;
     int m;
	   int pk;
	   int tem;
	   int alre;
	   int pk1=0;
     String  name;
     int pass;
     int no=0;
     int num=0;
     String add_pickup;
     Scanner s=new Scanner(System.in);
     Scanner s1=new Scanner(System.in);
     public void signup(){
                  System.out.println(".....SIGN UP.....");
                  System.out.println("enter the name:");
                  f_name=s.next();
                  System.out.println("Enter the password:");
                  passw=s.nextInt();
                 app_user_detail.add(new Admin(f_name,passw));
                System.out.println(app_user_detail);
                signin(f_name,passw);
   }          
  public void signin(String fname,int passw)
  {
      System.out.println(".....SIGN IN.....");
                  System.out.println("enter the name:");
                       String first_name=s.next();
                  System.out.println("Enter the password:");
                       int pass_word=s.nextInt();  
                  if((fname.compareTo(first_name)==0) && passw==pass_word)
                  {
                    User_meth_1();
                  }      
                  else
                  {
                    System.out.println(" Sorry you are not sign up .so first sign up!!!");
                    signup();
                          
                  }
  }      

    
  public void User_meth_1()
  {
      int choose;
      do
      {

          System.out.println(".......USER(NOT APPROVED).......");
          System.out.println("1.Browse cars");
          System.out.println("2.logout");
          System.out.println("Enter your choice:");
            choose=s1.nextInt();
    switch(choose)
    {
            case 1:
            browse_car();
            break;
  
            case 2:  return;  
    }
        }while(choose<=3);
  }

   public void User_meth_2()
   {
       int ch;
       do
       {

           System.out.println(".......USER.......");
System.out.println("1. Browse cars");
 System.out.println("2. Rent ");
 System.out.println("3. Pay rent");
 System.out.println("4. logout");        
System.out.println("enter your choice:");
             ch=s1.nextInt();
     switch(ch)
     {
             case 1:
                    browse_car();
             break;
             case 2: 
                       rent_car();
             break;
             case 3: break;
             case 4: return;     
 
     }
         }while(ch<=4);
   }

   void browse_car()
   {
    Iterator<Acat> z =A.iterator();
    while(z.hasNext())
    {
       Acat e=z.next();
       System.out.println(e);
    }

   Scanner s2 = new Scanner(System.in);
   
    System.out.println("----------------------------------");
    System.out.println("Enter Car name:");
    String car_f=s2.nextLine();
    
    boolean car_found=false;
    
    Iterator<Addcar> browse=Acar.iterator();
    
    while(browse.hasNext())
    {
      Addcar ac=browse.next();

String car_name_found=ac.get_car_model();
if(!car_name_found.equals(car_f))
{
  System.out.println(ac);
  car_found=false;
}
  }
  if(car_found)
  {
    System.out.println("no category found");
  }
}

void rent_car()
{
  Iterator<Acat> i=A.iterator();
	while(i.hasNext())
	{
		Acat e=i.next();
		System.out.println(e);
	}
  
  System.out.println("Enter which car do you want to rent:");
  String car_rent=s.nextLine();
  
}
}
