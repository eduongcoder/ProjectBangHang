package com.example.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "purchase_order_items")
@Data
@NoArgsConstructor
public class PurchaseOderItems implements Serializable {
	private static final long serialVersionUID = 1;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchase_order_items_id;

	@Column(name = "purchase_price", updatable = true)
	private int purchase_price;

	@Column(name = "quantity", updatable = true)
	private int quantity;

	@Column(name = "quantity_real", updatable = true)
	private int quantity_real;
	
	@Column(name = "variant")
	private int variant;
	
	@ManyToOne
	@JoinColumn(name = "purchase_order_id")
	private PurchaseOrders purchaseOrder;

	@ManyToOne
	@JoinColumn(name = "version_product_id")
	private ProductVersion productVersion;
}
