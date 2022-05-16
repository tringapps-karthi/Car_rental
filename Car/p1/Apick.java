package p1;

public class Apick {
    
String add_p;
int no=0;
public Apick(String add_p)
{
    this.add_p=add_p;
}
public String toString()
{

    return "" +(no++)+". Pickup Location:: "+add_p+" ";
}
}