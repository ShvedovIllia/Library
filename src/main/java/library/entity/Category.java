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
@Table(name = "category")

public class Category extends BaseEntity{
	
	@Column(name="title", length=50, unique=true, nullable=false)
	private String title;
	
	@OneToMany(mappedBy="category")
	private List<Author> authors;
}
