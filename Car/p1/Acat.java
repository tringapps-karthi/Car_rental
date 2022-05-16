package p1;

public class Acat {
String add_c;
int rent;
int num;

public Acat(String add_c,int rent)
{
    this.add_c=add_c;
    this.rent=rent;
}

public String getName()
{
    return add_c;
}

public int getRent()
{
    return rent;
}
public String toString()
{
    
    return ""+ (num++) +"Category :: "+add_c+" Rent: "+rent;
}
}
