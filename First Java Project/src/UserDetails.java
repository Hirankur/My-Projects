public abstract class UserDetails extends BDMobileWallet implements User {

    String name;
    String phoneNo;
    String address;
    String nidNo;

    public UserDetails()
    {
    }


    public UserDetails(String phoneNo, String name, String address, String nidNo) {
        this.phoneNo = phoneNo;
        this.name = name;
        this.address = address;
        this.nidNo = nidNo;
    }


    public abstract void usertype();
}
