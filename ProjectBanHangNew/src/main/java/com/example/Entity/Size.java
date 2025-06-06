package com.example.Entity;

import java.io.Serializable;
import java.util.List;

import com.example.Enum.SizeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sizes")
@Data
@NoArgsConstructor
public class Size implements Serializable {
	private static final long serialVersionUID = 1;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int size_id;

	@Column(name = "size_name", updatable = true)
	@Enumerated(EnumType.STRING)
	private SizeEnum size_name;

	@OneToMany(mappedBy = "size")
	private List<Variant> variants;

	@OneToMany(mappedBy = "catetorySize")
	private List<Category> categories;

	@OneToMany(mappedBy = "size")
	private List<OrderItem> orderitems;
	
}
