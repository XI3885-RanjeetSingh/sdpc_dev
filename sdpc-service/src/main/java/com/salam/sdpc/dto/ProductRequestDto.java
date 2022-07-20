package com.salam.sdpc.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

	@Getter
	@Setter
	private Set<AddOns> addOn;
	
	@Getter
	@Setter
	private Set<Boosters> booster;
	
	@Getter
	@Setter
	private String phoneNo;
}
