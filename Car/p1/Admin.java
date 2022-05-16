package p1;
import java.util.*;

public class  Admin extends User 
{ 
   User u=new User();
	Scanner s=new Scanner(System.in);
   Scanner sc=new Scanner(System.in);
	
   public Admin(){
      
   }
	public Admin(String add_pickup)
   {
      this.add_pickup=add_pickup;
    }
   


  public Admin(String name,int pass){
   this.name=name;
   this.pass=pass;
}    
public String toString()
{
    return "The User name: " +name+"  The password: "+pass;
}



   public void Login(){
          String user_name="karthi";
         int pass=2002;
         System.out.println("Enter the username:");
		 
         String name=sc.nextLine();
         System.out.println("Enter the password:");
         int password=s.nextInt();
             if((user_name.equals(name)) && pass==password)
                {
	   				Adminmeth();
	             }
       else{
		   System.out.println("Invalid input");
           }
}

public void Adminmeth()
{
int ch;
do{

System.out.println(".......ADMIN.......");
System.out.println("1. Add category");  
System.out.println("2. Add pickup locations ");
System.out.println("3. Add Cars (chose category)");
System.out.println("4. Update pickup location ");
System.out.println("5. Delete Cars Validate the car has been returned ");
System.out.println("6. Set penalty ");
System.out.println("7. Approve user");
System.out.println("8. Extend rental period ");
System.out.println("9.upgrade car category ");
System.out.println("10.Update current date ");
System.out.println("11.logout");        
System.out.println("enter your choice:");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("How many categories do you want to enter:");
int no_of_categories=s.nextInt();
for(int i=1;i<=no_of_categories;i++)
Addcategory();
break;

case 2:
System.out.println("How many Pickup locations do you want to enter:");
int no_of_pickup=s.nextInt();

for(int i=1;i<=no_of_pickup;i++,no++){
   
Addpickup();         
}
break;

case 3:
Addcars();
break;

case 4:
System.out.println("Update Pickup location");
System.out.println("What do you want to do?");
System.out.println("1 for Add Location,2 for Delete Location");
int Update_pic=sc.nextInt();
if(Update_pic==1)
{
   System.out.println("How many Pickup locations do you want to enter:");
   int Update_no_of_pickup=s.nextInt();
   for(int i=1;i<=Update_no_of_pickup;i++)
   Addpickup();          

}
else 
{
   Iterator<Apick> i=Ap.iterator();
	while(i.hasNext())
	{
		Apick e=i.next();
		System.out.println(e);
	}
    System.out.println("Enter Pickup location to delete:");
   int Dlt_pickup=sc.nextInt();
   Dlt_pickup++;
   Ap.remove(Dlt_pickup);
   Iterator<Apick> i1=Ap.iterator();
	while(i1.hasNext())
	{
		Apick e=i1.next();
		System.out.println(e);
	}
}

break;

case 5:
break;

case 6:
break;


case 7:
approve_user();
break;


case 8:
break;


case 9:

System.out.println("Update Car category");
System.out.println("What do you want to do?");
System.out.println("1 for Add Categories,2 for Delete Categories");
int Update_category=sc.nextInt();
if(Update_category==1)
{
   System.out.println("How many Categories do you want to enter:");
   int Update_no_of_category=s.nextInt();
   for(int i=1;i<=Update_no_of_category;i++)
   Addcategory();        

}
else 
{
   Iterator<Acat> i=A.iterator();
	while(i.hasNext())
	{
		Acat e=i.next();
		System.out.println(e);
	}
    System.out.println("Enter Category to delete:");
   int Dlt_category=sc.nextInt();
   Dlt_category++;
   Ap.remove(Dlt_category);
   Iterator<Acat> i1=A.iterator();
	while(i1.hasNext())
	{
		Acat e=i1.next();
		System.out.println(e);
	}
}

break;


case 10:
break;


case 11:
System.out.println("Home Page");
break;

}
           
}while(ch<11);
}



public void Addcategory()
{   

	System.out.println("Enter Category do you want to enter:");
	String add_c=s.next();
   System.out.println("Enter Rent for that category:");
   int rent=s.nextInt();
	A.add(new Acat(add_c,rent));
	//System.out.println(A);
	System.out.println("----------------------------------");
	Iterator<Acat> i=A.iterator();
	while(i.hasNext())
	{
		Acat e=i.next();
		System.out.println(e);
	}
}



public void Addpickup()
{   
	System.out.println("Enter Pickup location do you want to enter:");
	String add_p=s.next();
	Ap.add(new Apick(add_p));
	//System.out.println(Ap);
	System.out.println("----------------------------------");
	Iterator<Apick> i=Ap.iterator();
	while(i.hasNext())
	{
		Apick e=i.next();
     System.out.println(e);
     
	}
	


}



public void Addcars()
{  
   Iterator<Acat> i=A.iterator();
	while(i.hasNext())
	{
		Acat e=i.next();
		System.out.println(e);
	}
   System.out.print("Enter category:");
   String cat_name=s.next();
   Object cname_obj=" ";
   int flag=0;
   
   Iterator<Acat> z =A.iterator();
   while(z.hasNext())
   {
      Acat e=z.next();
      if(e.getName().equals(cat_name))
      {
         cname_obj=e;
         flag=1;
      }
   }
   if(flag==0)
   {
      System.out.println("Category Not found");
   }
   
   //System.out.println(cat_name);
    else{
            System.out.println("enter the car model:");
            String c_mod=s.next();
            System.out.println("enter the car mileage:");
            String c_mile=s.next();
            System.out.println("enter the car manufacture date:");
            String manufacture_date=s.next();
            String manufacture1_date=manufacture_date;
            user_date(manufacture_date);    
            System.out.println("enter the Available date:");
            String availabilty_date = s.next();
            String availabilty1_date=availabilty_date;
            user_date(availabilty_date);
            System.out.println("enter the pickup location:");
            String c_pickup=s.next();
            Acar.add(new Addcar(cname_obj,c_mod,c_mile,manufacture1_date,availabilty1_date,c_pickup));
         }
}



   
public void approve_user()
   {
   app_user_detail.add(new Admin(f_name,passw));
      System.out.println("******************************************");
       Iterator<Admin> au=app_user_detail.iterator();
        while(au.hasNext()){
            Admin au1=au.next();
            System.out.println(au1);
        }
   



        System.out.println("******************************************");  
        System.out.println("Do you accept this user? 1) for Yes , 2) for No");
        int allow=s.nextInt(); 
        if(allow==1)
        {
             User_meth_2();
        }     
        else
        {
           System.out.println("Sorry your not approved by the admin...");
           User_meth_1();
        }


        //   System.out.println(f_name);
            // System.out.println(passw);
   }

   public int date;
   public int month;
   public int year;

   public String user_date(String split_date) {
       String date_array[] = split_date.split("/");
       date = Integer.parseInt(date_array[0]);
       month = Integer.parseInt(date_array[1]);
       year = Integer.parseInt(date_array[2]);
       boolean isLeap = false;
       if ((year % 4 == 0 && year % 400 == 0)) {
           isLeap = true;
       }
       int no_of_days = 0;
       switch (month) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               no_of_days = 31;
               break;
           case 4:
           case 6:
           case 9:
               no_of_days = 30;
               break;
           case 2:
               no_of_days = (isLeap) ? 29 : 28;
               break;
       }
       if (date <= no_of_days) {
           System.out.println("valid date");
       } else {
           System.out.println("Please Enter valid date");
       }
       return split_date;
   }



}
