import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/txt")
public class TextServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String txt = request.getParameter("txt");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println(txt);

        String[] arrTxt = txt.split(" ");
        writer.println("******************************\n");
        writer.println("Ilość słów: "+arrTxt.length);

        writer.println("Ilość znaków: "+txt.length());

        String noSpaceTxt = txt.replaceAll("\\s", "");
        writer.println("Ilość znaków(bez spacji)"+noSpaceTxt.length());

        writer.println("Palindrom:" + new StringBuilder(txt).reverse().toString().equals(txt));
        
    }
}