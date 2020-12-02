package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class genshintop {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mv) {
	mv.addObject("level", "レベル" );
	mv.addObject("kakera","欠片" );
	mv.addObject("core","コア" );
	mv.addObject("tokusan","特産" );
	mv.addObject("drop","ドロップアイテム" );
	mv.setViewName("top");
	return mv;
	}
	
	 @RequestMapping(value="/",method=RequestMethod.POST) public ModelAndView
	 indexPost(ModelAndView mv,@RequestParam("level")int level,
	 @RequestParam("kakera")int kakera,@RequestParam("core")int core,
	 @RequestParam("tokusan")int tokusan,@RequestParam("drop")int drop) {
	 mv.addObject("kakera", kakera);
	 mv.addObject("core", core); 
	 mv.addObject("tokusan", tokusan); 
	 mv.addObject("drop", drop);
	 mv.setViewName("top");
	 return mv;
	 }
	 
}

