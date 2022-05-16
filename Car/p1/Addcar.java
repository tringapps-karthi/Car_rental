package p1;

public class Addcar {
    Object cate_name;
    String c_model;
    String avg_mil;
    String m_date;
    String A_date;
    String P_loc;
    public Addcar(Object cate_name,String c_model,String avg_mil,String m_date,String A_date,String P_loc)
    {
        this.cate_name=cate_name;
        this.c_model=c_model;
        this.avg_mil=avg_mil;
        this.m_date=m_date;
        this.A_date=A_date;
        this.P_loc=P_loc;
    }
    public Object cname_obj()
    {
        return cate_name;
    }
    
    public String get_car_model()
    {
        return c_model;
    }
    public String getavg_mil()
    {
        return avg_mil;
    }
    public String getm_date()
    {
        return m_date;
    }
    public String getA_date()
    {
        return A_date;
    }
    public String getP_loc()
    {
        return P_loc;
    }
    public String toString()
    {
        return "Category: "+cate_name+" "+" Model:"+c_model+" "+" Milegae:" +avg_mil+" "+ " Manufacture Date: "+m_date+" "+" Available date: "+A_date+" "+" Pickup location: "+P_loc; 
    }
}
