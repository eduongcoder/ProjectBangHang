package com.example.Controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.ProductVersion;
import com.example.Entity.ProductVersionDTO;
import com.example.Entity.ProductVersionShowDTO;
import com.example.From.ProductVersionForm;
import com.example.Service.IProductVersionService;

@RequestMapping("/api/productversion")
@RestController
public class ProductVersionController {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private IProductVersionService service;
	
	@GetMapping
	private List<ProductVersionShowDTO> getAllProductVersion(){
		List<ProductVersion> list=service.getAllProductVersion();
		List<ProductVersionShowDTO> dtos = modelMapper.map(list, new TypeToken<List<ProductVersionShowDTO>>() {
		}.getType());
		return dtos;
	}
	
	@PostMapping("/create")
	private ProductVersionDTO createProductVersion(@RequestBody ProductVersionForm form) {
		ProductVersion productVersion= service.createProductVersion(form);
		return modelMapper.map(productVersion, ProductVersionDTO.class);
	}
	
	@PostMapping("/createint")
	private int createProductVersionInt(@RequestBody ProductVersionForm form) {
		ProductVersion productVersion= service.createProductVersion(form);
		
		return productVersion.getProductVersion_id();
	}
	
	@PutMapping("/updateVersion")
	private int updateProductVersion(@RequestBody ProductVersionForm form) {
		return modelMapper.map(service.updateProductVersion(form), ProductVersionDTO.class).getProductVersion_id();
	}
	
	@GetMapping(value = "/getproductversion/{id}")
	public int getProductVersion(@PathVariable(name = "id")int id) {
		ProductVersion productVersion=service.getIdItemProductVersion(id);
		if (productVersion!=null) {
			return productVersion.getProductVersion_id();
		}
		return -1;
	}
}
