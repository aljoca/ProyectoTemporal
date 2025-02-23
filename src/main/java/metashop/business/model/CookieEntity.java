package metashop.business.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "cookie")
public class CookieEntity {

	@Column(name = "cookie_id")
	private Integer cookieId;

	@Column(name = "base_price")
	private Double basePrice;

	@ManyToMany
	@JoinTable(name = "cookie_ingredients",
			joinColumns = @JoinColumn(name = "cookie_id"),
			inverseJoinColumns = @JoinColumn(name = "ingredient_id")
	)
	private Set<IngredientEntity> ingredients;

	@ManyToMany
	@JoinTable(
			name = "cookie_topping",
			joinColumns = @JoinColumn(name = "cookie_id"),
			inverseJoinColumns = @JoinColumn(name = "topping_id")
	)
	private Set<ToppingEntity> toppings;
}
