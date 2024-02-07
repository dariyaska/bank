import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public Deposit findDepositByDepositor(String depositor) {
        for (Branch branch : branches) {
            for (Deposit deposit : branch.getDeposits()) {
                if (deposit.getDepositor().equals(depositor)) {
                    return deposit;
                }
            }
        }
        return null;
    }
}
