package kys.stusy.DesignPattern.CreationalPatterns.abstractFactory;

/**
 * <pre>
 * 추상 팩토리 패턴 적용 예제 작성 코드
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
public class Ex02 {
	public void ex02(String productName){
		Factory factory = ProductFactory.getFactory(productName);
		Product product = factory.make();
		product.name();
	}
}

/**
 * <pre>
 * ProductFactory 생성 클래스
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
class ProductFactory{
	public static Factory getFactory(String product){
		if(product.equals("car")) return new CarFactory();
		else return new BookFactory();
	}
}
/**
 * <pre>
 * Product를 생성하는 Factory interface
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
interface Factory{
	Product make();
}

/**
 * <pre>
 *	Book을 만드는 Factory
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
class BookFactory implements Factory{
	public Product make() {
		return new Book();
	}
}

/**
 * <pre>
 * Car를 만드는 Factory
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
class CarFactory implements Factory{
	public Product make() {
		return new Car();
	}
	
}
/**
 * <pre>
 *	상품 interface
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
interface Product{
	void name();
}

/**
 * <pre>
 * 상품 Book
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
class Book implements Product{
	public void name() {
		System.out.println("Book");
	}
}

/**
 * <pre>
 * 상품 car
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
class Car implements Product{
	public void name() {
		System.out.println("Car");
	}
}