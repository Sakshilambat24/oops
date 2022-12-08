import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet("/greet")
public class GreetingController implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String firstName = servletRequest.getParameter("firstName");
        String lastName = servletRequest.getParameter("lastname");
        String email = servletRequest.getParameter("email");

        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "#sakshi123";
        String quary = "insert into student (id,firstanme,lastaname,email) values(? ,?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(quary);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, email);
            preparedStatement.executeUpdate();


        } catch (SQLException e){

            throw new RuntimeException(e);

        }

        PrintWriter writer= servletResponse.getWriter();
        writer.println("sucessfully registerd"+firstName+"\t"+lastName+"\t"+email);

    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
