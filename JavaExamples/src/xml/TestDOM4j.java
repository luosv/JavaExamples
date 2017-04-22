package xml;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * DOM4j读写XML
 * Created by luosv on 2017/4/22 0022.
 */
public class TestDOM4j {

    public static void main(String[] args) {
        read1();
        //read2();
        //write();
    }

    private static void read1() {
        try {
            SAXReader reader = new SAXReader();
            InputStream in = TestDOM4j.class.getClassLoader().getResourceAsStream("test.xml");
            Document doc = reader.read(in);
            Element root = doc.getRootElement();
            readNode(root, "");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private static void read2() {
        try {
            SAXReader reader = new SAXReader();
            InputStream in = TestDOM4j.class.getClassLoader().getResourceAsStream("test.xml");
            Document doc = reader.read(in);
            doc.accept(new MyVisitor());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void readNode(Element root, String prefix) {
        if (root == null) {
            return;
        }
        // 获取属性
        List<Attribute> attrs = root.attributes();
        if (attrs != null && attrs.size() > 0) {
            System.err.print(prefix);
            for (Attribute attr : attrs) {
                System.err.print(attr.getValue() + " ");
            }
            System.err.println();
        }
        // 获取他的节点
        List<Element> childNodes = root.elements();
        prefix += "\t";
        for (Element e : childNodes) {
            readNode(e, prefix);
        }
    }

    private static void write() {
        try {
            // 创建一个xml文档
            Document doc = DocumentHelper.createDocument();
            Element university = doc.addElement("university");
            university.addAttribute("name", "tsu");
            // 注释
            university.addComment("这个是根节点");
            Element college = university.addElement("college");
            college.addAttribute("name", "chengdu");
            college.setText("text");

            File file = new File("src/dom4j-modify.xml");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            XMLWriter out = new XMLWriter(new FileWriter(file));
            out.write(doc);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class MyVisitor extends VisitorSupport {

    public void visit(Attribute node) {
        System.out.println("Attribute: " + node.getName() + "="
                + node.getValue());
    }

    public void visit(Element node) {
        if (node.isTextOnly()) {
            System.out.println("Element: " + node.getName() + "="
                    + node.getText());
        } else {
            System.out.println(node.getName());
        }
    }

    @Override
    public void visit(ProcessingInstruction node) {
        System.out.println("PI:" + node.getTarget() + " " + node.getText());
    }

}
