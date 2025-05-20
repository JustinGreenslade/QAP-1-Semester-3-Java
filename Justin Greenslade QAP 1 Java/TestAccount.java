public class TestAccount {
    
    public static void main(String[] args) {
        System.out.println();// Spacing for cleaner code

        
        Account Acc1 = new Account("1", "John Doe", 5000);
        Account Acc2 = new Account("2", "Mary Jane", 4000);
        System.out.println();// Spacing for cleaner code

        // Display balance of both accounts
        System.out.println("Initial Balances");
        System.out.println("Balance of account number 1 = $" + Acc1.getBalance());
        System.out.println("Balance of account number 1 = $" + Acc2.getBalance());
        System.out.println();// Spacing for cleaner code

        // Transfer $1000 from Acc1 to Acc2
        Acc1.transferTo(Acc2, 1000);

        // Display balance of both account again.
        System.out.println("Balances after transfer");
        System.out.println("Balance of account number 1 = $" + Acc1.getBalance());
        System.out.println("Balance of account number 1 = $" + Acc2.getBalance());
        System.out.println();// Spacing for cleaner code

    }
}
