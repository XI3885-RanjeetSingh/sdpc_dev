package com.salam.sdpc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseError {
	
	@Getter
	@Setter
	private Location loc;
	@Getter
	@Setter
	private String msg;
	@Getter
	@Setter
	private String type;
}
