package com.tuempresa.practica04.modelo;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	
	@Column
	@Required
	private String numero;
	
	@Column
	@Required
	@Stereotype("FECHA")
	private LocalDate fecha;
	
	
	//Relacion con cliente
	@ManyToOne
	@DescriptionsList(descriptionProperties = "identificacion,nombre,apellido")
	private Cliente cliente;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	
	@Column
	@Required(message = "¡Valor de iva requerido!")
	@Stereotype("DINERO")
	private BigDecimal iva;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	
	//relacion con detalle factura
	@ElementCollection
	@ListProperties("producto.codigo, producto.nombre, producto.precio, cantidad, subtotal, iva, total ") // en comillas se colocan los diversos atributos de detalle factura
	private List<DetalleFactura> detalles;
	
	
	
	
	
}
