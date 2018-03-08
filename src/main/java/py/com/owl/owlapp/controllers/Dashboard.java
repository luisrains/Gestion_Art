package py.com.owl.owlapp.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Diego Cerrano
 * @since 1.0
 * @version 1 19/09/2016
 *
 */
@Controller
public class Dashboard {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "main/index";
	}

}
