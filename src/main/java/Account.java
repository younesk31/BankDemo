import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private final List<Transaction> transactions;
    private final Customer customer;

    public Account(Customer customer) {
        this.transactions = new ArrayList<>();
        this.customer = customer;
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
        if(amount > getBalance()){
            System.out.println("Du må ikke gå i minus\nDin saldo er: "+ getBalance());
            withDrawAmount(amount);
            return getBalance();
        } else
        transactions.add(new Transaction(-amount, new Date()));
        return getBalance();
    }

    public int depositAmount(int amount){
        // TODO: skal debugges og returnere ny saldo. Smid fejl hvis amount < 0.
        if(amount <= 0){
            System.out.println("Du skal tilføje et positivt beløb.");
            depositAmount(amount);
        } else
            transactions.add(new Transaction(amount, new Date()));
            return getBalance();
    }

    public StringBuilder String() {
        StringBuilder output = new StringBuilder();
        output.append("Customer = ").append(customer.getName()).append("\n");
        int counter = 1;
        for (Transaction transaction : transactions) {
            output.append(transaction.getDate()).append(" @ ").append("Transaction ").append(counter).append(" = ").append(transaction.getAmount()).append("\n");
            counter++;
        }
            output.append("\nBalance = ").append(getBalance()).append("\n");
        return output;
    }
}
