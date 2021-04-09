package br.edu.infnet.appatalineferreira.controller;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import br.edu.infnet.appatalineferreira.negocio.servico.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home() {

		return "index";
	}
}