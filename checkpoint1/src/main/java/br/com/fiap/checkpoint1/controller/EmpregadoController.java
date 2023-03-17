package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.controller.dto.EmpregadoCreate;
import br.com.fiap.checkpoint1.controller.dto.EmpregadoUpdate;
import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.service.EmpregadoService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/empregado")
public class EmpregadoController {

	@Autowired
	private EmpregadoService empregadoService;
	
	@GetMapping
	public List<Empregado> listAll(){
		return empregadoService.list();
	}
	
	@PostMapping
    @ResponseBody
	public Empregado create(@RequestBody EmpregadoCreate dto) {
		Empregado empregadoInsert = new Empregado();
		empregadoInsert.setNome(dto.getNome());
		empregadoInsert.setEndereco(dto.getEndereco());

		Empregado result = empregadoService.save(empregadoInsert);
		return result;
	}
	
	@PutMapping
	public Empregado update(@RequestBody EmpregadoUpdate dto) {
		Empregado empregadoInsert = new Empregado();
		empregadoInsert.setNome(dto.getNome());
		empregadoInsert.setEndereco(dto.getEndereco());
		empregadoInsert.setCodigoEmpregado(dto.getId());

		Empregado result = empregadoService.save(empregadoInsert);
		return result;
	}
	
}
