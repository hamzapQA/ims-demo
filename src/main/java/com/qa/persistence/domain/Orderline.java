package com.qa.persistence.domain;

public class Orderline {
	
	private Long orderlineId;
	private Long itemId;
	private Long orderId;
	private Integer quantity;
	private Double price;
	private Long customer_id;
	private String first_name;
	private String item_name;
	
	
	
	public Orderline(Long orderlineId, Long itemId, Long orderId, Integer quantity) {
		this.orderlineId = orderlineId;
		this.itemId = itemId;
		this.orderId = orderId;
		this.quantity = quantity;
	}


	public Orderline(Long itemId, Long orderId, Integer quantity) {
		super();
		this.itemId = itemId;
		this.orderId = orderId;
		this.quantity = quantity;
	}
	
	
	
// use this for orderline compound 


	public Orderline(Long orderlineId, Long itemId, Long orderId, Integer quantity, Double price,
			Long customer_id, String first_name, String item_name) {
		super();
		this.orderlineId = orderlineId;
		this.itemId = itemId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.item_name = item_name;
	}
	
	public Long getOrderlineId() {
		return orderlineId;

	}
	public void setOrderlineId(Long orderlineId) {
		this.orderlineId = orderlineId;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	


	@Override
	public String toString() {
		return "Orderline ID: " + orderlineId + ", Item ID: " + itemId + ", Item Name: " + item_name + ", Order ID: " + orderId + ", Quantity: "
				+ quantity + ", Individual Price: " + price + ", Total Price: " + price*quantity + ", Customers ID: " + customer_id
				+ ", First Name of Customer: " + first_name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderlineId == null) ? 0 : orderlineId.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orderline other = (Orderline) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderlineId == null) {
			if (other.orderlineId != null)
				return false;
		} else if (!orderlineId.equals(other.orderlineId))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
	

	
	
	
	
}