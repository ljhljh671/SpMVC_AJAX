package com.biz.ajax.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductVO {
	
	private String p_ccode;
	private String p_cname;
	private String p_vat;
	private int p_iprice;
	private int p_oprice;
	

}
