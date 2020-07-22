package qua.hack.resource.ro;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class OrderCodeResponse {
	
	private String orderId;
	
	private Long agentId;
	
	private LocalDateTime orderTime;
	
	private Map<String, String> items = new HashMap<>();

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Map<String, String> getItems() {
		return items;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	
	

}
