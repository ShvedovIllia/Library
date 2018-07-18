package library.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "book")

public class Book extends BaseEntity{

	@Column(name = "isbn", nullable = false, length = 15, unique = true)
	private int isbn;

	@Column(name = "title", nullable = false, length = 50)
	private String title;

	@Column(name = "description", nullable = false, columnDefinition = "text")
	private String description;

	@Column(name = "date", nullable = false, length = 15)
	private String date;

}
