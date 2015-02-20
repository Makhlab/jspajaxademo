package ru.javageek.ajaxdemo;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by max on 19/02/15.
 */
@WebServlet("/update_old")
public class Update extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Object> model = new HashMap<String, Object>();
        String userName = req.getParameter("username");
        boolean isValid = false;
        if(!userName.isEmpty()) {
            isValid = true;
            model.put("username", userName);
        }
        model.put("isValid", isValid);
        write(resp, model);
    }

    private void write(HttpServletResponse resp, Map<String, Object> model) throws IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(new Gson().toJson(model));
    }
}
