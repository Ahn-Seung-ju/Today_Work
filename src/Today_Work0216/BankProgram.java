package Today_Work0216;

public class BankProgram {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new Account("12345", "안승주");
        
        bank.addAccount("12345", "안승주");
        bank.addAccount("12345", "안승");
        bank.addAccount("12345", "안");
        bank.addAccount("12345678", "안승주");
        bank.getTotalAccount();
        bank.getAccounts();
        bank.findAccounts("안승주");
        
        account.deposit(100000);
        bank.getAccounts();

    }

}
