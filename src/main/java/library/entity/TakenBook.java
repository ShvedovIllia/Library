package library.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "taken_book")

public class TakenBook extends BaseEntity{
	
	@Column(name="date_start", nullable=false, length=10)
	private String dateStart;
	
	@Column(name="date_end", nullable=false, length=10)
	private String dateEnd;
}
