package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		/*
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Coordenação do Centro Integrado de Gestão Estratégica - CIGE"));
		list.add(new Department(2, "Coordenação de Aviação Operacional - CAOP"));
		list.add(new Department(3, "Serviço de Proteção ao Depoente Especial - SPDE"));
		list.add(new Department(4, "Divisão de Segurança de Dignitário e Proteção ao Depoente Especial - DSDE"));
		list.add(new Department(5, "Coordenação de Segurança em Grandes Eventos - CGE"));
		list.add(new Department(6, "Serviço de Apoio Administrativo - SAD"));
		*/
		
		return dao.findAll();
	}
}
