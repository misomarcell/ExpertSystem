import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParser {
	public void LoadXmlDocument(String fullPath) {

		try {
			File xmlFile = new File(fullPath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);

			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("Fact");

			for (int i = 0; i < nList.getLength(); i++)//
			{
				Node node = nList.item(i);
				Element element = (Element) node;
				System.out.println(element.getElementsByTagName("Description").item(0).getTextContent());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}