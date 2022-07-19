package by.iba.servlet;

import by.iba.model.ListService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //JSP страница создает динамические веб страницы
        //1-JSP page
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        //2-JSP page
      /*  request.setAttribute("name", "I.O. Dima");
        request.setAttribute("password", "1111");
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);*/

        //HTML страница
        /*  PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Good morning </title>");
        out.println("</head>");
        out.println("<body>");
        out.println(" First Servlet");
        out.println("</body>");
        out.println("</html>");*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /*  request.setCharacterEncoding("UTF-8");
        request.setAttribute("name", request.getParameter("name"));
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);*/
        String name = request.getParameter("name");
        String password = request.getParameter("password");
      /*  if (validateUser(name, password)) {
            request.getSession().setAttribute("name", name);
            request.setAttribute("group", ListService.retrieveList());
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
                    .forward(request, response);*/
        if (validateUser(name, password)) {
            request.getSession().setAttribute("name", name);
            response.sendRedirect(request.getContextPath() + "/GroupListServlet");
            //request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
// НЕТ ПАРАМЕТРОВ - всегда использует метод get request.getRequestDispatcher("/GroupServlet")
//.forward(request, response);


        } else {
            request.setAttribute("errorMessage", "Invalid Login and password!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp")
                    .forward(request, response);
        }


    }

    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("admin") && password.equals("admin");
    }

}

