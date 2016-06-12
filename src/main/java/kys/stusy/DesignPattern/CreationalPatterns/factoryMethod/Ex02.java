package kys.stusy.DesignPattern.CreationalPatterns.factoryMethod;

/**
 * <pre>
 * 팩토리 메소드 패턴 적용 예제
 * </pre>
 * @author kim
 * @date 2016. 6. 12.
 */
public class Ex02 {
	
	public static void main(String args[]){
		Card card = CardFactory.getCard("bc");
		card.payment("아이폰");
		
		card = CardFactory.getCard("hyundai");
		card.payment("갤럭시");
	}
}

class CardFactory{
	public static Card getCard(String card){
		if(card.equals("hyundai")){
			return new HyundaiCard();
		}else if(card.equals("bc")){
			return new BcCard();
		}else{
			throw new IllegalArgumentException();
		}
	}
}

interface Card{
	void payment(String productName);
}

class HyundaiCard implements Card{

	public void payment(String productName) {
		System.out.println("상품 : "+productName +", 결제수단 : 현대카드");
	}
}

class BcCard implements Card{
	public void payment(String productName) {
		System.out.println("상품 : "+productName +", 결제수단 : 비시카드");
	}
}