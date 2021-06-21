package kodlamaio.hrms.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeConfirm;

public interface EmployeeConfirmDao extends JpaRepository<EmployeeConfirm,Integer>{

}
