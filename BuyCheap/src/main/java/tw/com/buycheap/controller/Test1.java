package tw.com.buycheap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 測試
 * 
 * @author Jarvis
 *
 */
@Controller
public class Test1 {
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {

        return "index";
    }
    
}
