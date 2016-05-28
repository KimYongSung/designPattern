package kys.stusy.DesignPattern.CreationalPatterns.abstractFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Ex01 {
	/**
	 * <pre>
	 *  JDK안의 추상 팩토리 패턴들
     * [출처] 추상 팩토리 패턴(Abstract Factory Pattern) - 자바 디자인 패턴과 JDK 예제 |작성자 IDEO
     * http://blog.naver.com/2feelus/220643071966
     * </pre>
	 * @throws ParserConfigurationException
	 */
	@SuppressWarnings("unused")
	public void ex1() throws ParserConfigurationException{

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
	
		javax.xml.transform.TransformerFactory.newInstance();
		
		javax.xml.xpath.XPathFactory.newInstance();
	}
}
