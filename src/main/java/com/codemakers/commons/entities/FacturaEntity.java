package com.codemakers.commons.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Entity de tipo (Factura) que representa un registro de
 *          la BD. Cada instancia de esta entidad representa un registro de la
 *          BD. Cada atributo representa una columna de la BD. Los métodos de
 *          esta clase se usan para manipular los datos. (Anotación @Data)
 * 
 *          Implementa la interfaz (Serializable) la cual permite convertir un
 *          objeto (instancia) en ceros y uno, para de esta manera pueda ser
 *          transportado, almacenado y reconstruido en otra plataforma o
 *          sistema.
 * 
 */

@Data
@Entity
@NoArgsConstructor
@Table(name = "factrua", schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class FacturaEntity implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	
	@JoinColumn(name = "empresa_cliente_contador", referencedColumnName = "id")
	@OneToOne
	private EmpresaClienteContadorEntity empresaClienteContador;
	
	@JoinColumn(name = "id_tarifa", referencedColumnName = "id")
	@ManyToOne
	private TarifaEntity tarifa;
	
	@JoinColumn(name = "id_lectura", referencedColumnName = "id")
	@OneToOne
	private LecturaEntity lectura;
	
	@JoinColumn(name = "id_tipo_pago", referencedColumnName = "id")
	@OneToOne
	private TipoPagoEntity tipoPago;
	
	@JoinColumn(name = "id_estado", referencedColumnName = "id")
	@OneToOne
	private EstadoEntity estado;
	
	@Basic(optional = false)
	@Column(name = "fecha_emision")
	private Date fechaEmision;
	
	@Basic(optional = false)
	@Column(name = "fecha_fin")
	private Date fechaFin;
	
	@Basic(optional = false)
	@Column(name = "consumo")
	private Integer consumo;
	
	@Basic(optional = true)
	@Column(name = "precio")
	private Double precio;
	
	@Basic(optional = false)
	@Column(name = "codigo")
	private String codigo;
	
	@Basic(optional = false)
	@Column(name = "activo",nullable = false)
	private Boolean activo;
	
	@Basic(optional = false)
	@Column(name = "usuario_creacion", insertable = true, updatable = false)
	@CreatedBy
	private String usuarioCreacion;

	@Basic(optional = false)
	@Column(name = "fecha_creacion", insertable = true, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date fechaCreacion;

	@Basic(optional = true)
	@Column(name = "usuario_cambio", updatable = true, insertable = false)
	@LastModifiedBy
	private String usuarioModificacion;

	@Basic(optional = true)
	@Column(name = "fecha_cambio", updatable = true, insertable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date fechaModificacion;
}
