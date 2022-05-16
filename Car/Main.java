import  p1.*;
import java.util.*;

class Main
{
public static void main(String args[])
{  
   Scanner sc=new Scanner(System.in);
   Admin a=new Admin();
        User u=new User();
do
{
  System.out.println("Are you an Admin(1) , User(2) , Exit(0)");
  int Admin_or_User=sc.nextInt();
  if(Admin_or_User==1)
  a.Login();
 else if(Admin_or_User==2)
  u.signup();
 else
  System.exit(0);
}
while(true);
}
}