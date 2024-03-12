package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index (Model model, @RequestParam String nome) {
        String mensagem = "Bom dia " + nome + "!!";
        model.addAttribute("msg", mensagem);
        return "/index.jsp";
    }
}
