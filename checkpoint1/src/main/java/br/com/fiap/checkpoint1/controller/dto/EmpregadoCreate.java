package br.com.fiap.checkpoint1.controller.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmpregadoCreate {

	public EmpregadoCreate() {
	}
	
	private String nome;
	
	private String endereco;
	
}
