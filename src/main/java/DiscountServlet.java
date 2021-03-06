import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        double price =  Double.parseDouble(request.getParameter("listPrice"));
        double discount = Double.parseDouble(request.getParameter("discount"));

        double discountAmount = price * discount * 0.01;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Product Description: "+productDescription+"</h1>");
        writer.println("<h1>List price: "+price+"</h1>");
        writer.println("<h1>Discount Percent: "+discount+"</h1>");
        writer.println("<h1>Discount Amount: "+discountAmount+"</h1>");
        writer.println("<h1>Discount Price: "+(price-discountAmount)+"</h1>");
        writer.println("</html>");


    }
}
