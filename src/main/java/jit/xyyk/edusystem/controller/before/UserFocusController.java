package jit.xyyk.edusystem.controller.before;

import jit.xyyk.edusystem.Util.MyUtil;
import jit.xyyk.edusystem.bean.Course;
import jit.xyyk.edusystem.service.before.UserFocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserFocusController extends UserBaseController{

    @Autowired
    private UserFocusService focusService;


    @RequestMapping("/focus")
    public String focus(HttpSession session, Model model){

        List<Course> focus = focusService.getAllFocusByUserId(MyUtil.getUserId(session));
        model.addAttribute("focus",focus);
        return "before/focus";

    }
}
