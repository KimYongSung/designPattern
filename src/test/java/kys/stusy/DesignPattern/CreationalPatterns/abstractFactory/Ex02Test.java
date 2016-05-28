package kys.stusy.DesignPattern.CreationalPatterns.abstractFactory;

import org.junit.Test;

/**
 * <pre>
 * 추상 팩토리 패턴 적용 예제 작성 코드
 * </pre>
 * @author kim
 * @date 2016. 5. 28.
 */
public class Ex02Test {
	@Test
	public void test(){
		Ex02 ex02 = new Ex02();
		ex02.ex02("car");
		ex02.ex02("book");
	}
}
