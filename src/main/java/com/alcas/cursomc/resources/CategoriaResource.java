package com.alcas.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alcas.cursomc.domain.Categoria;
import com.alcas.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	/*
	 * @RequestMapping(method = RequestMethod.GET) public List<Categoria> listar() {
	 * Categoria cat1 = new Categoria(1,"Informática"); Categoria cat2 = new
	 * Categoria(2,"Escritório");
	 * 
	 * List<Categoria> lista = new ArrayList<>(); lista.add(cat1); lista.add(cat2);
	 * return lista; }
	 */
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> findbyId(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
