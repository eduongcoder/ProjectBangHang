package com.example.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class ClientDTO {
	@NonNull
	private Integer clientid;
	@NonNull
	private String clientname;
	@NonNull
	private String clientemail;	
	@NonNull
	private String clientcity;	
	@NonNull
	private String clientward;	
	@NonNull
	private String clientdistrict;
	@NonNull
	private String clientstreet;	
	
//	private Integer accountid;

}
