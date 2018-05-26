package hello.number.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    JSONObject login(){
        JSONObject json = new JSONObject();
        json.put("username","kami");
        json.put("nickname","神の目");
        return json;
    }
}
