package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name="verification_code_candidates")
@Data
public class VerificationCodeCandidate {

	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
}
