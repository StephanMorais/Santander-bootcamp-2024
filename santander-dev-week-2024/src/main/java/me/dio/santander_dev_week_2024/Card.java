package me.dio.santander_dev_week_2024;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name="tb_card")

public class Card {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	@Column(unique=true)
	private String number;
	
	@Column(name="available_limit",scale=13,precision=2)
	private BigDecimal limit;
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
	
	

}