package Today_Work0216;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private ArrayList<Transaction> transactions;

    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        transactions = new ArrayList();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
                + transactions + "]";
    }

    public void deposit(long amount) {
        balance += amount;
        Transaction t = new Transaction();

        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        String sdfdat = sdfdate.format(Calendar.getInstance().getTime());

        SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm:ss");
        String sdftim = sdfdate.format(Calendar.getInstance().getTime());

        t.setAmount(amount);
        t.setBalance(balance);
        t.setKind("입금");
        t.setTransactionDate(sdfdat);
        t.setTransactionTime(sdftim);
        transactions.add(t);

    }

    public void withdraw(long amount) {
        balance -= amount;
        Transaction t = new Transaction();

        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        String sdfdat = sdfdate.format(Calendar.getInstance().getTime());

        SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm:ss");
        String sdftim = sdfdate.format(Calendar.getInstance().getTime());

        t.setAmount(amount);
        t.setBalance(balance);
        t.setKind("출금");
        t.setTransactionDate(sdfdat);
        t.setTransactionTime(sdftim);
        transactions.add(t);
    }

    public ArrayList<Transaction> getTransactions() {
        
        return transactions;

    }

}
