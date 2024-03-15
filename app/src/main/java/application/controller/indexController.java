package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class indexController {
    @RequestMapping("/")
    public String index(Model ui,
    @RequestParam(name="nome", required=false, defaultValue="pessoa")String n) {
        ui.addAttribute("msg", "olá " + n + " !");
        return "/WEB-INF/home.jsp";
    }

}