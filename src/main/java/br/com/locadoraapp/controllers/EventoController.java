package br.com.locadoraapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.locadoraapp.models.Evento;
import br.com.locadoraapp.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String formEvento() {
		return "formEvento";
	}
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String formEvento(Evento evento) {
		
		er.save(evento);
		
		return "redirect:/cadastrarEvento";
	}
}
