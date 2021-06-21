package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.VerificationCodeCandidate;

public interface VerificationCodeCandidateService {

	List<VerificationCodeCandidate> getAll();
}
