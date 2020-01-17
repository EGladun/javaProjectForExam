import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

@WebServlet(urlPatterns = "/display",name = "display")
public class display extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document document = null;
        try {
            assert builder != null;
            document = builder.parse(new File("C:\\Users\\monst\\IdeaProjects\\javaProjectForExam\\document\\catalog.xml"));
        } catch (SAXException e) {
            e.printStackTrace();
        }

        Element element = document.getDocumentElement();
        printElements(element.getChildNodes(),0);


    }

    static void printElements(NodeList nodelist, int tabs) {
        for (int i=0; i<nodelist.getLength(); i++){
            if(nodelist.item(i) instanceof Element){
                String value="";
                if(!nodelist.item(i).getTextContent().trim().isEmpty() && !((Text)nodelist.item(i).getFirstChild()).getData().trim().isEmpty() && !((Text)nodelist.item(i).getFirstChild()).getData().trim().equals("\n")){
                    Text text= (Text)nodelist.item(i).getFirstChild();
                    value+= " = " + text.getData().trim();
                }
                System.out.println(getTab(tabs) + ((Element)nodelist.item(i)).getNodeName()+ value);
            }
        }

    }

     static String  getTab(int tabs) {
        String str = "";
        for (int i = 0; i<tabs; i++){
            str +="\t";
        }
        return str;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
