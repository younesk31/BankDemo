public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);

        account.depositAmount(125);
        account.depositAmount(325);
        account.withDrawAmount(325);
        account.withDrawAmount(5);
        account.withDrawAmount(5);
        account.withDrawAmount(5);
        account.withDrawAmount(5);
        account.withDrawAmount(5);
        System.out.println(account.String());


    }
}
