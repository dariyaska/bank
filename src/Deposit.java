import java.util.ArrayList;
import java.util.List;

class Deposit {
    private String depositor;
    private double amount;
    private Branch branch;

    public Deposit(String depositor, double amount, Branch branch) {
        this.depositor = depositor;
        this.amount = amount;
        this.branch = branch;
    }

    public String getDepositor() {
        return depositor;
    }

    public double getAmount() {
        return amount;
    }

    public Branch getBranch() {
        return branch;
    }

    public void replenish(double amount) {
        this.amount += amount;
    }
}
