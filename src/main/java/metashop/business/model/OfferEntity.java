package metashop.business.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "offer")
public class OfferEntity {

	@Column(name = "offer_id")
	private Long offerId;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "price")
	private Double price;

	@Column(name = "price_with_descount")
	private Double priceWithDescount;

	@Column(name = "discount_start_date")
	private Date discountStartDate;

	@Column(name = "discount_end_date")
	private Date discountEndDate;



}
