package com.cos.mediger.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class apiVO {
	@Autowired
	private String atpn_qesitm;
	@Autowired
	private String atpn_warn_qesitm;
	@Autowired
	private String deposit_method_qesitm;
	@Autowired
	private String efcy_qesitm;
	@Autowired
	private String entp_name;
	@Autowired
	private String intrc_qesitm;
	@Autowired
	private String item_image;
	@Autowired
	private String item_name;
	@Autowired
	private String item_seq;
	@Autowired
	private String open_de;
	@Autowired
	private String se_qesitm;
	@Autowired
	private String update_de;
	@Autowired
	private String use_method_qesitm;

}
