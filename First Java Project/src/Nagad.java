public class Nagad extends BDMobileWallet {

    int startYear;
    String dialCode;
    NagadFee nagadfee;

    public Nagad() {
        System.out.println("This is Nagad Wallet.");
    }

    public Nagad(int startYear, String dialCode, NagadFee nagadfee) {
        this.startYear = startYear;
        this.dialCode = dialCode;
        this.nagadfee = nagadfee;


    }

    public void nagadinfos() {

        System.out.println("Nagad was introduced in " + this.startYear + "\nNagad Dialcode is " +
                this.dialCode + "\nNagad SendMoney Fee is " + nagadfee.sendMoneyFee + " Taka."
        +"\n"+"Nagad Cashout Fee is "+nagadfee.cashOutFee+"\n");

    }
}
