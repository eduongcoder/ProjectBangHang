package com.example.Entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import com.example.Enum.SizeEnum;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderItemDTOVariant {
	private Integer order_items_id;

	private String product_name;

	private Integer product_price;

	private Integer price_base;

	private Integer quantity;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	private Integer productID;

	private Integer orders_id;

//	private Integer typeOfVariant;

	private SizeEnum size;

	private String color;

	private Integer sizeID;

	private Integer colorID;

//	private List<VariantDTO> variants;

//	private Integer productVersion;
}
