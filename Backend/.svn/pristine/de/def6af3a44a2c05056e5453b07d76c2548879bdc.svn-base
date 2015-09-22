package controller;

import dao.EntityManagerHelper;
import dao.TbUser;
import dao.TbUserDAO;
import dto.UserRole;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 11/3/13
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class UserAdminController {
    @RequestMapping(value="/addCustomerPage", method = RequestMethod.GET)
    public String getAddCustomerPage(ModelMap model) {
        return "add";

    }
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView add(HttpServletRequest request, ModelMap model) {

        String loginId = request.getParameter("loginId");
        String password = request.getParameter("password");
        UserRole role = UserRole.valueOf(request.getParameter("role"));
        TbUserDAO userDAO = new TbUserDAO();
        TbUser user = new TbUser();
        user.setLoginId(loginId);
        user.setPassword(password);
        user.setRole(role);
        EntityManagerHelper.beginTransaction();
        userDAO.save(user);
        EntityManagerHelper.commit();


        return new ModelAndView("redirect:list");

    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String listCustomer(ModelMap model) {

        TbUserDAO userDAO = new TbUserDAO();
        List<TbUser> users = userDAO.findAll();

        model.addAttribute("userList",  users);

        return "list";
    }

    @RequestMapping(value="/update/{loginId}", method = RequestMethod.GET)
    public String getUpdateCustomerPage(@PathVariable String loginId,
                                        HttpServletRequest request, ModelMap model) {

        TbUserDAO userDAO = new TbUserDAO();
        System.out.println(loginId);
        List<TbUser> users = userDAO.findByLoginId(loginId,null);
        if(users!=null&&users.size()>0){
            TbUser user = users.get(0);
            model.addAttribute("user",  user);
        }

        return "../update";

    }

    @RequestMapping(value="/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request, ModelMap model) {
        TbUserDAO userDAO = new TbUserDAO();
        List<TbUser> users = userDAO.findByLoginId(request.getParameter("loginId"),null);
        if(users!=null){
            TbUser user = users.get(0);
            if(request.getParameter("password")!=null)
            user.setPassword(request.getParameter("password"));
            if(request.getParameter("role")!=null)
               user.setRole(UserRole.valueOf(request.getParameter("role")));
            EntityManagerHelper.beginTransaction();
            userDAO.save(user);
            EntityManagerHelper.commit();
        }

        //return to list
        return new ModelAndView("redirect:list");

    }
    @RequestMapping(value="/delete/{loginId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable String loginId,HttpServletRequest request, ModelMap model) {
        System.out.println(loginId);
        TbUserDAO userDAO = new TbUserDAO();
        List<TbUser> users = userDAO.findByLoginId(loginId,null);
        if(users!=null){
            TbUser user = users.get(0);

            EntityManagerHelper.beginTransaction();
            userDAO.delete(user);
            EntityManagerHelper.commit();
        }

        return new ModelAndView("redirect:../list");


    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "index";

    }

}
