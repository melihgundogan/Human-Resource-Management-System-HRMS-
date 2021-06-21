package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationCodeCandidateService;
import kodlamaio.hrms.dataAccesss.abstracts.VerificationCodeCandidateDao;
import kodlamaio.hrms.entities.concretes.VerificationCodeCandidate;

@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService{

	private VerificationCodeCandidateDao verificationCodeCandidateDao;
	
	@Autowired
	public VerificationCodeCandidateManager(VerificationCodeCandidateDao verificationCodeCandidateDao) {
		super();
		this.verificationCodeCandidateDao = verificationCodeCandidateDao;
	}
	
	@Override
	public List<VerificationCodeCandidate> getAll() {
		// TODO Auto-generated method stub
		return this.verificationCodeCandidateDao.findAll();
	}

}
