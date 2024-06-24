package me.dio.santander_dev_week_2024;
import jakarta.persistence.*;


@MappedSuperclass
public abstract class BaseItem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)	
	private Long id;
	
	private String icon;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}


}
