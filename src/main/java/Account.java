import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private List<Transaction> transactions;
    private Customer customer;

    public Account(Customer customer) {
        this.transactions = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBalance(){
        // TODO: skal debugges
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        return sum;
    }

    public int withDrawAmount(int amount){
        // TODO: skal kodes og returnere ny saldo. Smid fejl hvis amount > saldo
        if (amount > getBalance()){
            System.out.println("Du har ikke nok på kontoen");
            return getBalance();
        } else {
            transactions.add(new Transaction(-amount, new Date()));
            return getBalance();
        }
    }

    public int depositAmount(int amount){
        // TODO: skal debugges og returnere ny saldo. Smid fejl hvis amount < 0.
        if (amount < 0){
            System.out.println("Du skal tilføje et positivt beløb");
            return getBalance();
        } else {
            transactions.add(new Transaction(amount, new Date()));
            return getBalance();
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
