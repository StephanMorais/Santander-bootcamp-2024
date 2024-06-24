package me.dio.santander_dev_week_2024;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat.Feature;

import jakarta.persistence.*;



@Entity(name="tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	@OneToOne(cascade =CascadeType.ALL)
	private Account account;
	
	@OneToOne(cascade =CascadeType.ALL)
	private Card card;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Feature> feature;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<News> news;
	
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public List<Feature> getFeature() {
		return feature;
	}
	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}
	
	
	

}
