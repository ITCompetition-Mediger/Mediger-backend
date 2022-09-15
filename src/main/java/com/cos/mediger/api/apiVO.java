package com.cos.mediger.api;

import javax.persistence.Column;
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
	@Column(columnDefinition = "MEDIUMTEXT")
	private String atpn_qesitm;
	@Column(columnDefinition = "MEDIUMTEXT")
	private String atpn_warn_qesitm;
	@Column(columnDefinition = "MEDIUMTEXT")
	private String deposit_method_qesitm;
	@Column(columnDefinition = "MEDIUMTEXT")
	private String efcy_qesitm;
	@Column(columnDefinition = "VARCHAR(255)")
	private String entp_name;
	@Column(columnDefinition = "VARCHAR(255)")
	private String intrc_qesitm;
	@Column(columnDefinition = "VARCHAR(255)")
	private String item_image;
	@Column(columnDefinition = "VARCHAR(255)")
	private String item_name;
	@Column(columnDefinition = "BIGINT")
	private String item_seq;
	@Column(columnDefinition = "VARCHAR(255)")
	private String open_de;
	@Column(columnDefinition = "MEDIUMTEXT")
	private String se_qesitm;
	@Column(columnDefinition = "VARCHAR(255)")
	private String update_de;
	@Column(columnDefinition = "VARCHAR(255)")
	private String use_method_qesitm;

}
