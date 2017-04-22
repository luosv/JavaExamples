package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * DOM解析XML
 * Created by luosv on 2017/4/22 0022.
 */
public class DOMParser {

    private DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

    // Load and parse XML file into DOM
    private Document parse() {
        Document document = null;
        try {
            // DOM parser instance
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            // parse an XML file into DOM tree
            document = builder.parse(new File("E:\\Git\\JavaExamples\\JavaExamples\\src\\xml\\book.xml"));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    public static void main(String[] args) {
        DOMParser parser = new DOMParser();
        Document document = parser.parse();
        // get root element
        Element rootElement = document.getDocumentElement();

        // traverse child elements
        NodeList nodes = rootElement.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element child = (Element) node;
                // process child element

            }
        }

        NodeList nodeList = rootElement.getElementsByTagName("book");
        if (nodeList != null) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String id = element.getAttribute("id");
                String date = element.getAttribute("date");
                System.out.println(id + "@" + date);
            }
        }
    }

}
