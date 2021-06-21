package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeConfirmService;
import kodlamaio.hrms.dataAccesss.abstracts.EmployeeConfirmDao;
import kodlamaio.hrms.entities.concretes.EmployeeConfirm;

@Service
public class EmployeeConfirmManager implements EmployeeConfirmService{

private EmployeeConfirmDao employeeConfirmDao;
	
	@Autowired
	public EmployeeConfirmManager(EmployeeConfirmDao employeeConfirmDao) {
		super();
		this.employeeConfirmDao = employeeConfirmDao;
	}
	
	@Override
	public List<EmployeeConfirm> getAll() {
		// TODO Auto-generated method stub
		return this.employeeConfirmDao.findAll();
	}
	
	

}
