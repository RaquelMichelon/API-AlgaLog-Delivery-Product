package com.algaworks.algalog.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded=true)
@Entity //Jakarta Persistence
public class Entrega {
	
	@EqualsAndHashCode.Include //gera equals and hash code apenas para id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne //muitas entregas possuem um cliente / JoinColumn padrao eh cliente_id
	private Cliente cliente;
	
	@Embedded //abstrair os dados do destinatario para outra classe mas mapeando para a tabela entrega
	private Destinatario destinatario;
	
	private BigDecimal taxa;
	
	@Enumerated(EnumType.STRING) //para armazenar a string que representa a enumeracao
	private StatusEntrega status;
	
	private LocalDateTime dataPedido;
	
	private LocalDateTime dataFinalizacao;
	

}
