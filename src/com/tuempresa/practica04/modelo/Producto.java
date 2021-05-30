package com.tuempresa.practica04.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int codigo;
	
	@Column(length = 25)
	@Required
	private String nombre;
	
	@Column(length = 150)
	@Required
	private String descripcion;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal precio;
	
}
