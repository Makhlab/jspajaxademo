package ru.javageek.ajaxdemo;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by max on 20/02/15.
 */
@Controller
public class UsernameController {
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/update")
    public Map<String, Object> userNameUpdate(@RequestParam String username) {
        Map<String, Object> model = new HashMap<String, Object>();
        boolean isValid = false;
        if(!username.isEmpty())
            isValid = true;
        model.put("isValid", isValid);
        model.put("username", new Gson().toJson(username));
        return model;
    }
    @RequestMapping(value = "/main")
    public String getMainPage() {
        return "index";
    }
}
