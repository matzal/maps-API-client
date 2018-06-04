package servlets;

import APIClient.APIClient;
import model.GoogleResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/point")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        APIClient apiClient = new APIClient();
        GoogleResponse googleResponse = apiClient.getGoogleResponse(
                request.getParameter("userInput"));
        if (googleResponse.getStatus().equals("INVALID_REQUEST")) {
            request.setAttribute("errorMessage", googleResponse.getErrorMessage());
        } else {
            setLatitudeLongitudeGoogleKey(request, apiClient, googleResponse);
        }
        forwardToPage(request, response, "result.jsp");
    }

    private void forwardToPage(HttpServletRequest request, HttpServletResponse response, String jspFile) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jspFile);
        requestDispatcher.forward(request, response);
    }

    private void setLatitudeLongitudeGoogleKey(HttpServletRequest request, APIClient apiClient, GoogleResponse googleResponse) {
        request.getSession().setAttribute("latitude", googleResponse.getResults().get(0).getGeometry().getLocation().getLat());
        request.getSession().setAttribute("longitude", googleResponse.getResults().get(0).getGeometry().getLocation().getLng());
        request.setAttribute("googleKey", apiClient.getAPIKey());
    }


}
