package kodlamaio.hrms.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.VerificationCodeEmployer;

public interface VerificationCodeEmployerDao extends JpaRepository<VerificationCodeEmployer,Integer>{

}
