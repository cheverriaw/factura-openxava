package com.tuempresa.practica04.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable //da el efecto cascada 
@Getter
@Setter
public class DetalleFactura {
	
	@Column
	@Required
	private int cantidad;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal iva;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	
	//relacionamos con producto
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Producto producto;

}
