package br.com.fiap.checkpoint1.controller.dto;

import lombok.Data;

@Data
public class EmpregadoUpdate {
	public EmpregadoUpdate() {
	}
	
	private long id;
	
	private String nome;
	
	private String endereco;
}
