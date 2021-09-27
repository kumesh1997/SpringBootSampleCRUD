package controler;

import domain.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.serviceClass;

import java.util.List;

public class controlerClass {

    @Autowired

    private serviceClass service;
    @GetMapping("/")
    public String viewHomePage(Model model){
        List<movie> movieList=service.listall();
        model.addAttribute("movieList",movieList);
        System.out.println("Get/ ");
        return  "index";
    }

    @GetMapping("/new")
    public  String addMovie(Model model){
        model.addAttribute("movie",new movie());
        return "new";
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String saveMovie(@ModelAttribute("movie") movie mve){
      service.save(mve);
      return "redirect:/";
    }

    @RequestMapping("/edid/{id}")
    public ModelAndView showEditMoviePage(@PathVariable(name="id") int id){
        ModelAndView MandV=new ModelAndView("new");
        movie mve =service.get(id);
        MandV.addObject("movie",mve);
        return MandV;
    }

    @RequestMapping("/delete/{id}")
    public String deleteMovie(@PathVariable (name="id") int id){
        service.delete(id);
        return "redirect:/";
    }

}
