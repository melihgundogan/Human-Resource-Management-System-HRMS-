package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	List<VerificationCode> getAll();
}
