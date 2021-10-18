package ds.com.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
    @GetMapping("/")
    public String home(Model model) {
        String myName ="이영준";
        model.addAttribute("myName",myName);
        return "/index";
    }

}
