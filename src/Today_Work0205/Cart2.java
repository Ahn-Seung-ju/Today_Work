package Today_Work0205;
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

class Product2 {
    int price;

    Product2(int price) {
        this.price = price;
    }
}

class LgTv extends Product {

    LgTv() {
        super(500);
    }

    @Override
    public String toString() {
        return "LgTv";
    }
}

class LgComputer extends Product {

    LgComputer() {
        super(1000);
    }

    @Override
    public String toString() {
        return "LgCompter";
    }
}

class Buyer2 {
    int price;
    Product List[];//담는곳// 변수선언은 최소한의 지역으로 선언하는 것이 좋다
    
    Buyer2() {
        List = new Product[10];
    }
    void buy(Product n) {
        for(int i = 0; i < List.length; i++) {
            this.price += n.price;
            if(List[i] == null) {
                List[i] = n;
                System.out.println("구매한 물건: " + n);
                break;
            }else if(i == List.length -1 && List[i] != null) {
                System.out.println("더 이상 담을 수 없습니다.");
            }
        }
    }
    void summury() {
        for(int i = 0; i < List.length; i++) {
            if(List[i] == null) {
                break;
            }
            System.out.println("구매한 목록:" + List[i] + " " +"가격" + List[i].price);
        }
        System.out.println("총 구매 가격: " + price);
    }
}

public class Cart2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Buyer2 buyer = new Buyer2();
        LgComputer lgcomputer = new LgComputer();
        LgTv lgtv = new LgTv();
        
        buyer.buy(lgtv);
        buyer.buy(lgtv);
        buyer.buy(lgcomputer);
        buyer.buy(lgtv);
        buyer.buy(lgcomputer);
        buyer.buy(lgtv);
        buyer.buy(lgtv);
        buyer.buy(lgcomputer);
        buyer.buy(lgtv);
        buyer.buy(lgcomputer);
        buyer.buy(lgtv);
        buyer.buy(lgtv);
        buyer.summury();
        

    }

}
