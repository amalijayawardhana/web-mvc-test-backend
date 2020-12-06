package web.mvc.test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.mvc.test.business.custom.StudentBO;
import web.mvc.test.business.custom.UserBO;

import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserBO userBO;

    @RequestMapping("/login")
    public String getLogin()
    {
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout_user(HttpSession session)
    {
        session.removeAttribute("username");
        session.invalidate();
        return "redirect:/login";
    }


}
