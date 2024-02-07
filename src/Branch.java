import java.util.ArrayList;
import java.util.List;

class Branch {
    private String name;
    private Bank bank;
    private List<Deposit> deposits;

    public Branch(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.deposits = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Bank getBank() {
        return bank;
    }

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void addDeposit(Deposit deposit) {
        deposits.add(deposit);
    }

    public void removeDeposit(Deposit deposit) {
        deposits.remove(deposit);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Deposit deposit : deposits) {
            total += deposit.getAmount();
        }
        return total;
    }}