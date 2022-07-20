package com.salam.sdpc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
	
	@Getter
	@Setter
	private String title;
	@Getter
	@Setter
	private Integer latitude;
}
