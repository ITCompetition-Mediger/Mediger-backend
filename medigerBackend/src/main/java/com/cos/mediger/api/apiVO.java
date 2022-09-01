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
	private String atpnQesitm;
	@Autowired
	private String atpnWarnQesitm;
	@Autowired
	private String depositMethodQesitm;
	@Autowired
	private String efcyQesitm;
	@Autowired
	private String entpName;
	@Autowired
	private String intrcQesitm;
	@Autowired
	private String itemImage;
	@Autowired
	private String itemName;
	@Autowired
	private String itemSeq;
	@Autowired
	private String openDe;
	@Autowired
	private String seQesitm;
	@Autowired
	private String updateDe;
	@Autowired
	private String useMethodQesitm;

}
