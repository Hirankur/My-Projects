public class Bkash extends BDMobileWallet {

    int startYear;
    String dialCode;
    BkashFee bkashfee;

    public Bkash()
    {
        System.out.println("This is Bkash Wallet.");
    }

    public Bkash(int startYear,String dialCode,BkashFee bkashfee)
    {
        this.startYear = startYear;
        this.dialCode = dialCode;
        this.bkashfee = bkashfee;
    }

    public void bkashinfos()
    {
        System.out.println("Bkash was introduced in "+this.startYear+"\nBkash Dialcode is " +
                this.dialCode+"\nBkash SendMoney Fee is "+bkashfee.sendMoneyFee+" Taka."+"\n"+
                "Cash out Fee is "+bkashfee.cashOutFee+" Taka."+"\n");
    }

}
