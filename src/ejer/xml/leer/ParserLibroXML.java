package ejer.xml.leer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXML extends DefaultHandler
{
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.startDocument();
		System.out.println("INICIO DEL DOCUMENTO");
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.endDocument();
		System.out.println("FIN DEL CUENTO");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
	{
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		System.out.println("StarElement  = "+ localName);
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		//super.endElement(uri, localName, qName);
		System.out.println("EndElement  = "+ localName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		//System.out.println("chaer [] =" +ch);
		System.out.println("Star ="+ start);
		System.out.println("Length ="+ length);
		String str = new String(ch, start, length);
		System.out.println("String = "+ str);
		
	}
	
}