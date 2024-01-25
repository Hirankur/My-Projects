import java.util.*;
public class Main {

    public static void main(String[] args) {



        BDMobileWallet obj1 = new BDMobileWallet();
        obj1.info();

        BkashFee bfee = new BkashFee(5, 18.5);
        NagadFee nfee = new NagadFee(0, 10.5);

        Bkash b1 =new Bkash();
        Bkash b2 = new Bkash(2011, "*247#", bfee);
        b2.bkashinfos();

        Nagad n1 = new Nagad();
        Nagad n2 = new Nagad(2019, "*167#", nfee);
        n2.nagadinfos();

        ArrayList<String> dial = new ArrayList<String>();
        dial.add("Dial 1 for Send Money.");
        dial.add("Dial 2 for CashOut.");
        dial.add("Dial 3 for CheckBalance");
        dial.add("Dial 4 for Payment.");
        dial.add("Dial 5 for ChangePin.\n");

        for (int i = 0; i < dial.size(); i++)
        {
            System.out.println(dial.get(i));

        }


        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number(1-5) : ");
        int x=s1.nextInt();

        if(x==1)
        {
            System.out.println("(Send Money Functions)\n");
        }
        else if(x == 2)
        {
            System.out.println("(CashOut Functions)\n");
        }
        else if(x==3)
        {
            System.out.println("(CheckBalance Functions)\n");
        }
        else if(x==4)
        {
            System.out.println("(Payment Function)\n");
        }
        else if(x==5)
        {
            System.out.println("(Change Pin Functions)\n");
        }
        else
        {
            System.out.println("Invalid.\n");
        }

        try {
            if(x<0)
            {
                throw new NegativeArraySizeException();
            }
        }
        catch (Exception e) {
            System.out.println("Exception Occured and Negative Number not Acceptable.\n");
        }

        System.out.println("Press any number for Admin and User Details.");
        int a = s1.nextInt();


        AdminAddress adminaddress1 = new AdminAddress("Dhaka", "Mirpur 1",
                "62/8");


        CustomerAddress customeraddress1 = new CustomerAddress("Dhaka", "Mdpur Housing Ltd",
                "206/6");


        Administrator a1 = new Administrator("01863725355", "Kabir Ahsan",
                 adminaddress1);
        a1.usertype();
        a1.showdetail();

        Customer c1 = new Customer("01828867260", "Hirankur Dewan", "87654321", 2000,
                customeraddress1);
        c1.usertype();
        c1.showdetail();

    }

}