package library.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@MappedSuperclass

public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

}
