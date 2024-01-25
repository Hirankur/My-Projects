public class Administrator extends UserDetails{

    private String name;
    private String phoneNo;
    AdminAddress adminaddress;


    public Administrator(String phoneNo,String name,AdminAddress adminaddress)
    {
        this.phoneNo = phoneNo;
        this.name = name;
        this.adminaddress=adminaddress;
    }
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo=phoneNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPhoneNo()
    {
        return phoneNo;
    }
    public String getName()
    {
        return name;
    }
    public void usertype()
    {
        System.out.println("Administrator Details.\n");
    }

    public void showdetail()
    {
        System.out.println("Administrator Name : "+this.name+"\nPhone no: "+this.phoneNo);
        System.out.println("Administrator Address : House No. "+
                adminaddress.getHouseNo()+","+adminaddress.getAreaName()+","+adminaddress.getCity()+".\n");
    }
}
