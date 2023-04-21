package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.stream.Collectors;
import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        var out = response.getWriter();
        String search = request.getParameter("search");

        if( search == null ){
            out.println(String.join("\n", getCompanies()));
            return;
        }

        List<String> companies = getCompanies().stream()
                .filter(s -> s.contains(search.trim()))
                .toList();

        if( companies.size() > 0 ){
            out.println(String.join("\n", companies));
            return;
        }

        out.println("Companies not found");
    }
}
