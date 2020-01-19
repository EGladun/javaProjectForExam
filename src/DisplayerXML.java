import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = "/displayer",name = "Display")
public class DisplayerXML extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        Document doc = null;

        try {
            db = dbf.newDocumentBuilder();
            doc = db.parse(new File("..\\document\\catalog.xml"));
            NodeList ndListFile = doc.getElementsByTagName("CD");
            NodeList f= doc.getElementsByTagName("TITLE");
            for (int i=0;i<ndListFile.getLength(); i++){
                String name =f.item(i).getTextContent().trim();

            }
        } catch (IOException | SAXException | ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private String formatParams(HttpServletRequest request) {
        return request.getParameterMap()
                .entrySet()
                .stream()
                .map(entry -> {
                    String param = String.join("\n", entry.getValue());
                    return entry.getKey() + " => " + param;
                })
                .collect(Collectors.joining());
    }
}