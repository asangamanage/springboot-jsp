package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public ModelAndView hello(@RequestParam(value="name", defaultValue="World") String name) {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("name", name);
        return mav;
    }

}
