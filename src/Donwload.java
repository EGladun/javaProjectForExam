import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.server.ExportException;

@WebServlet(urlPatterns = "/download",name = "Donwload")
public class Donwload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File file = new File("C:\\Users\\monst\\IdeaProjects\\javaProjectForExam\\document\\catalog.xml");
        ServletOutputStream outputStream = null;
        BufferedInputStream inputStream = null;
        try {
            outputStream = response.getOutputStream();
            response.setContentType("C:\\Users\\monst\\IdeaProjects\\javaProjectForExam\\document\\catalog.xml");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + "catalog.xml" + "\"");
            response.setContentLength((int) file.length());
            FileInputStream fileInputStream = new FileInputStream(file);
            inputStream = new BufferedInputStream(fileInputStream);
            int readBytes = 0;
            while ((readBytes = inputStream.read()) != -1)
                outputStream.write(readBytes);
        }catch (ExportException e){
            e.printStackTrace();
        }finally {
            outputStream.flush();
            outputStream.close();
            inputStream.close();
    }
    }
}

