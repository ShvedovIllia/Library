package library.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "address")

public class Address extends BaseEntity{

	
	@Column(name = "country", nullable = false, length = 50)
	private String country;

	@Column(name = "city", nullable = false, length = 80)
	private String city;

	@Column(name = "street", nullable = false, length = 50)
	private String street;

	@Column(name = "house_number", nullable = false, length = 10)
	private int houseNumber;

	@Column(name = "apartment_number", nullable = false, length = 10)
	private int apartmentNumber;
}
