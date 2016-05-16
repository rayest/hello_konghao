package cn.rayest;

/**
 * Created by Administrator on 2016/5/16 0016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/5/16 0016.
 */

@Controller
public class WelcomeController extends AbstractController{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("I am working!");
        return new ModelAndView("welcome");
    }
}