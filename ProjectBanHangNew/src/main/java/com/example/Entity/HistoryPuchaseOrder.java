package com.example.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "history_puchase_order")
@Data
@NoArgsConstructor
public class HistoryPuchaseOrder implements Serializable {
	private static final long serialVersionUID = 1;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int history_puchase_order_id;
	
	@Column(name = "date_fix", updatable = false ,insertable = false,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime date_fix;

	@Column(name = "note",length = 300)
	private String note;

	@ManyToOne
	@JoinColumn(name = "accountid")
	private Account account_id;

	@ManyToOne
	@JoinColumn(name = "puchase_order_id")
	private PurchaseOrders puchase_order_id;
}
