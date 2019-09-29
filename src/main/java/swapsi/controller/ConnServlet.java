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
import swapsi.model.Post.Posts;
import swapsi.model.User.Users;
import swapsi.model.dao.mLabMongoDbConnector;

/**
 *
 * @author Caleb
 */
public class ConnServlet extends HttpServlet {

    private mLabMongoDbConnector connector;
    private Followers followers;
    private Users users;
    private Posts posts;

    @Override
    public void init() throws ServletException {
        super.init(); // To change body of generated methods, choose Tools | Templates.
        users = new Users();
        posts = new Posts();
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

        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String status = (connector != null) ? "Connected to mLab" : "Disconnected from mLab";

        RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
        rs.forward(request, response);
    }

}