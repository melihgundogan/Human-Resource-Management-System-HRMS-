package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeConfirmEmployerService;
import kodlamaio.hrms.dataAccesss.abstracts.EmployeeConfirmEmployerDao;
import kodlamaio.hrms.entities.concretes.EmployeeConfirmEmployer;

@Service
public class EmployeeConfirmEmployerManager implements EmployeeConfirmEmployerService{

	private EmployeeConfirmEmployerDao employeeConfirmEmployerDao;
	
	@Autowired
	public EmployeeConfirmEmployerManager(EmployeeConfirmEmployerDao employeeConfirmEmployerDao) {
		super();
		this.employeeConfirmEmployerDao = employeeConfirmEmployerDao;
	}
	
	@Override
	public List<EmployeeConfirmEmployer> getAll() {
	
		return this.employeeConfirmEmployerDao.findAll();
	}

}
