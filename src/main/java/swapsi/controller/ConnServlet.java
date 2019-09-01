package swapsi.controller;

import swapsi.model.dao.mLabMongoDbConnector;
import swapsi.model.follower.Followers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Caleb
 */
public class ConnServlet extends HttpServlet {
    private mLabMongoDbConnector connector;

    private Followers followers;


    @Override // Create and instance of DBConnector for the deployment session
    public void init() {
        followers = new Followers();
    }

    @Override // Add the classes instances to the session
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        session.setAttribute("followers", followers);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Old boilerplate code

//        String adminemail = System.getenv("ADMINEMAIL");
//        String adminpass = System.getenv("ADMINPASSWORD");

//        connector = new mLabMongoDbConnector();
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String status = (connector != null) ? "Connected to mLab" : "Disconnected from mLab";

//        session.setAttribute("status", status);
//        session.setAttribute("adminemail", adminemail);
//        session.setAttribute("adminpassword", adminpass);

        RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
        rs.forward(request, response);
    }

}
