public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);
        Customer c2 = new Customer("Younes");
        Account account2 = new Account(c2);

        account.depositAmount(125);
        account.withDrawAmount(100);
        System.out.println(account.String());

        account2.depositAmount(500);
        account2.withDrawAmount(250);
        System.out.println(account2.String());
    }
}
