package Today_Work0215;

import java.util.ArrayList;

/*

문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개 , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 )
hint) Buyer ..>> summary() main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/
class Product{
    int price;
    int bonuspoint;
    
    Product(int price){
        this.price = price;
        this.bonuspoint = (int)price / 10;
    }
}

class KtTv extends Product{

    KtTv() {
        super(500);        
    }

    @Override
    public String toString() {
        return "KtTv";
    }
    
    
}

class Audio extends Product{
    Audio(){
        super(1000);
    }
    @Override
    public String toString() {
        return "Audio";
    }
}
class NoteBook extends Product{

    NoteBook() {
        super(1500);
    }
    @Override
    public String toString() {
        return "NoteBook";
    }
}
class Washer extends Product{
    Washer(){
        super(700);
    }
    @Override
    public String toString() {
        return "Washer";
    }
}

class Buyer {
    int money;
    
    int top;
    int bonuspoint;
    int price;
    ArrayList<Product> cart;
    
    
    Buyer(int money){
        this.money  = money;
        top = -1;
        this.cart = new ArrayList<Product>();
    }
    
    boolean isEmpty() {
        return (top == -1);
    }
    
    boolean isFull() {
        return (top == cart.size());
    }
    
    void cancel() {
        
    }

    void buy(Product n) {
        cart.add(n);
        this.price += n.price;
        this.bonuspoint += n.bonuspoint;
    }
    void summry() {
        System.out.println("담으신 물건의 총 갯수는 " + cart.size() + "입니다.");
        System.out.println("******담으신 물건 목록*******");
        for(int i = 0; i < cart.size(); i++) {
            System.out.printf("[%d]번째 물건 %s 가격: %d \n", (i+1) , cart.get(i), cart.get(i).price );
            
        }
        if(this.money >= this.price) {
            int change = this.money - this.price;
            System.out.printf("구매하신 총 가격: [%d원] 잔액: [%d원]\n",price,change);
            System.out.printf("마일리지는 [%d포인트]입니다", bonuspoint);
        }else {
            System.out.println("잔액이 부족합니다.");
            int change = -(this.money - this.price);
            System.out.printf("구매하신 총 가격: [%d원] 부족한 금액: [%d원]\n",price,change);
        }
    }
}
public class ArrayList_Cart {

    public static void main(String[] args) {
        Buyer buyer = new Buyer(10000);
        buyer.buy(new KtTv());
        buyer.buy(new KtTv());
        buyer.buy(new KtTv());
        buyer.buy(new KtTv());
        buyer.buy(new NoteBook());
        buyer.buy(new NoteBook());
        buyer.buy(new NoteBook());
        
        buyer.summry();
        
        
        

    }

}
