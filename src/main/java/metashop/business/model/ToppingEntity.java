package metashop.business.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Topping")
public class ToppingEntity {

	@Id
	@Column(name = "topping_id")
	private Integer toppingId;

	@ManyToMany(mappedBy = "toppings")
	private Set<CookieEntity> cookies;

	@Column(name = "description")
	private String description;

	@Column(name = "pricePerKg")
	private Double pricePerKg;

}
