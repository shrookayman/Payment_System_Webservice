package services;

import org.springframework.stereotype.Component;

@Component
public class CancerHospital {
	private int Id;
	private String name;
	private int totalTransactionAmount;
	
	public CancerHospital() {
		Id = 57357;
		name = "Cancer Hospital";
		totalTransactionAmount = 0;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public int getTotalTransactionAmount() {
		return totalTransactionAmount;
	}

	public void setTotalTransactionAmount(int totalTransactionAmount) {
		this.totalTransactionAmount = totalTransactionAmount;
	}
}
