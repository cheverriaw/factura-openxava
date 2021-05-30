package com.tuempresa.practica04.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	
	@Column(length = 13)
	@Required
	private  String identificacion;
	
	@Column(length = 25)
	@Required
	private String nombre;
	
	@Column(length = 25)
	@Required
	private String apellido;
	
	//relacion con factura
	@OneToMany(mappedBy = "cliente")
	private List<Factura> facturas;
	
	
}
