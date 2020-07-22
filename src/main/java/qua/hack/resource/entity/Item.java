package qua.hack.resource.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private Long id;
	
	@Column(name = "item_code")
	private String itemCode;
	
	@Column(name = "secret_operation_code")
	private String secretOperationCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getSecretOperationCode() {
		return secretOperationCode;
	}

	public void setSecretOperationCode(String secretOperationCode) {
		this.secretOperationCode = secretOperationCode;
	}
	
	

}
