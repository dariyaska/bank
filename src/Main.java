
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Slay");

        Branch branch1 = new Branch("Филиал1", bank);
        Branch branch2 = new Branch("Филиал2", bank);

        bank.addBranch(branch1);
        bank.addBranch(branch2);

        Deposit deposit1 = new Deposit("Дария", 1000, branch1);
        Deposit deposit2 = new Deposit("Сая", 2000, branch1);
        Deposit deposit3 = new Deposit("Камила", 1500, branch2);

        branch1.addDeposit(deposit1);
        branch1.addDeposit(deposit2);
        branch1.addDeposit(deposit3);

        System.out.println("Депозиты в Филиале1:");
        for (Deposit deposit : branch1.getDeposits()) {
            System.out.println("Вкладчик: " + deposit.getDepositor() + ", Количество: " + deposit.getAmount());
        }
        System.out.println("Общая сумма в Филиале 1:" + branch1.getTotalAmount());

        deposit1.replenish(500);

        System.out.println("\nВклады в Филиале1 после пополнения:");
        for (Deposit deposit : branch1.getDeposits()) {
            System.out.println("Вкладчик: " + deposit.getDepositor() + ", Количество: " + deposit.getAmount());
        }
        System.out.println("\nВклады в Филиале1 после пополнения: " + branch1.getTotalAmount());

        String depositor = "Дария";
        Deposit foundDeposit = bank.findDepositByDepositor(depositor);
        if (foundDeposit != null) {
            System.out.println("\nДепозит найден для " + depositor + ":");
            System.out.println("Вкладчик: " + foundDeposit.getDepositor() + ", Количество: " + foundDeposit.getAmount());
            System.out.println("Расположен в филиале: " + foundDeposit.getBranch().getName());
        } else {
            System.out.println("\nЗалог не найден для " + depositor);
        }
    }
}
