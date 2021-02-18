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
        transactions = new ArrayList<Transaction>();
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
        newn(amount, "입금");

    }

    public void withdraw(long amount) {
        balance -= amount;
        newn(amount, "출금");
    }
    
    public void newn(long amount, String kind) {
        Transaction t = new Transaction();

        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        String sdfdat = sdfdate.format(Calendar.getInstance().getTime());

        SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm:ss");
        String sdftim = sdftime.format(Calendar.getInstance().getTime());

        t.setAmount(amount);
        t.setBalance(balance);
        t.setKind(kind);
        t.setTransactionDate(sdfdat);
        t.setTransactionTime(sdftim);
        transactions.add(t);
    }

    public ArrayList<Transaction> getTransactions() {
        ArrayList<Transaction> value = new ArrayList<Transaction>();
        System.out.println("계좌 정보");
        for(Transaction a : transactions) {
            value.add(a);
            System.out.println(a);
        }
        
        return value;
    }

}
