package br.com.fiap.checkpoint1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "empregados")
@Data
public class Empregado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoEmpregado;	
	@Column(name = "nome")
	private String nome;
	@Column(name = "endereco")
	private String endereco;
	
}
