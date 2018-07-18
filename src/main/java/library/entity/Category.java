package library.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "category")

public class Category extends BaseEntity{
	
	@Column(name="title", length=50, unique=true, nullable=false)
	private String title;
}
