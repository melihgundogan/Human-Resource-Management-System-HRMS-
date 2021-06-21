package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_confirms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeConfirm {
	
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirm_date")
	private Date confirmDate;
	
}
