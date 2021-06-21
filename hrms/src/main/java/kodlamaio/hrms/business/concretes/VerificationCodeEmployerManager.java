package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationCodeEmployerService;
import kodlamaio.hrms.dataAccesss.abstracts.VerificationCodeEmployerDao;
import kodlamaio.hrms.entities.concretes.VerificationCodeEmployer;

@Service
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService{

	private VerificationCodeEmployerDao verificationCodeEmployerDao;
	
	@Autowired
	public VerificationCodeEmployerManager(VerificationCodeEmployerDao verificationCodeEmployerDao) {
		super();
		this.verificationCodeEmployerDao = verificationCodeEmployerDao;
	}
	
	@Override
	public List<VerificationCodeEmployer> getAll() {
	
		return this.verificationCodeEmployerDao.findAll();
	}

}
