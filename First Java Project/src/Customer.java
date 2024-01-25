public class Customer extends UserDetails{

    private String name;
    private String  phoneNo;
    private String nidNo;
    private int pin;
    CustomerAddress customeraddress;


    public Customer(String phoneNo,String name,String nidNo,int pin,CustomerAddress customeraddress)
    {
        this.phoneNo = phoneNo;
        this.name = name;
        this.customeraddress = customeraddress;
        this.nidNo = nidNo;
        this.pin=pin;
    }
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo=phoneNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNidNo(String nidNo)
    {
        this.nidNo=nidNo;
    }
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    public String getPhoneNo()
    {
        return phoneNo;
    }
    public String getName()
    {
        return name;
    }
    public String getNidNo()
    {
        return nidNo;
    }
    public int getPin()
    {
        return pin;
    }
    public void usertype()
    {
        System.out.println("Customer Details.\n");
    }

    public void showdetail()
    {
        System.out.println("Customer Name : "+this.name+" \nPhone no: "+this.phoneNo+ "\nNid : "
        +this.nidNo+"\nPin : "+pin);
        System.out.println("Customer Address : House No. "+customeraddress.getHouseNo()+","+
                customeraddress.getAreaName()+","+customeraddress.getCity());
    }
}
