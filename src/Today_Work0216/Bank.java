package Today_Work0216;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private ArrayList<Account> accounts;
    private int totalAccount;
    
    //생성자
    public Bank(){
        accounts = new ArrayList<Account>();
        //Account a = new Account(    , null);
    }
    
    //계좌 계설
    public void addAccount(String accountNo, String name) {
        //Account account = new Account(accountNo, name);//굳이 만들필요가 없고
        accounts.add(new Account(accountNo, name));//새로운 Account 객체를 add를 하면서 넣는다
        ++totalAccount;
    }
    
    //계좌 번호로 찾기
    public Account getAccount(String accountNo) {
        Account value = null;
        for(Account a : accounts) {
            if(a.getAccountNo().equals(accountNo)) {
               value = a;
            }
        }
        return value;
    }
    
    //계좌 이름으로 찾기
    public ArrayList<Account> findAccounts(String name) {
        
        ArrayList<Account> value = new ArrayList<Account>();
        for(Account a : accounts) {
            if(a.getName().equals(name)) {
                value.add(a);
            }
        }
        System.out.printf("%s 이라는 이름을 가진 사람의 계좌\n",name);
        System.out.println(value);
        return value;
    }
    
    public ArrayList<Account> getAccounts() {
        ArrayList<Account> value = new ArrayList<Account>();
        System.out.println("전체 계좌 목록");
        for(Account a : accounts) {
            value.add(a);
            System.out.println(a);
        }
        return value;
        
    }
    
    public int getTotalAccount() {
        System.out.println("총 계좌 갯수: " + totalAccount);
        return totalAccount;
    }

}
