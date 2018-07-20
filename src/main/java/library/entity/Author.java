package library.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder

@Entity
@Table(name = "author")

public class Author extends BaseEntity {

	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;

	@ManyToOne
	private Category category;

	@ManyToMany(mappedBy = "authors")
	private List<Book> book;

}
