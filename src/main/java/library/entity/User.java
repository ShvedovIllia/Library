package library.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder

@Entity
@Table(name = "user")

public class User extends BaseEntity{

	@Column(name = "full_name", nullable = false, length = 50)
	private String fullName;

	@Column(name = "phone_number", nullable = false, length = 15, unique = true)
	private String phoneNumber;

	@Column(name = "email", nullable = false, length = 50, unique = true)
	private String email;

	@Column(name = "birth_date", nullable = false, length = 15)
	private String birthDate;

	@Column(name = "details", columnDefinition = "text")
	private String details;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
}
