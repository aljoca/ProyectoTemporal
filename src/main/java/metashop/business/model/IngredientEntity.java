package metashop.business.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ingredient")
public class IngredientEntity {

	@Id
	@Column(name = "ingredient_id")
	private Long ingredientId;

	@ManyToMany(mappedBy = "cookie_ingredients")
	private Set<CookieEntity> cookies;

	@Column(name = "description")
	private String description;

	@Column(name = "price_per_kh")
	private Double pricePerKg;

}
