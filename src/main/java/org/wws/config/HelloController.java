package org.wws.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wws.entity.post.Post;

import java.util.Date;
import java.util.List;

@Controller
public class HelloController {
    
//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @Autowired
    private SessionFactory sessionFactory;

    private String retrievePost = "from Post where id = 1";

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model) {
        Session session = sessionFactory.openSession();
        List<Post> list = session.createQuery(retrievePost).list();


        String date = (new Date()).toString();
        model.addAttribute("date", date);
        return "home";
    }
    
}
