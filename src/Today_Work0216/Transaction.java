package Today_Work0216;

public class Transaction {
    @Override
    public String toString() {
        return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
                + kind + ", amount=" + amount + ", balance=" + balance + "]";
    }
    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;
    
    
    
    public String getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionTime() {
        return transactionTime;
    }
    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    
}
