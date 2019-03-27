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
		list.add(new Department(1, "Coordena��o do Centro Integrado de Gest�o Estrat�gica - CIGE"));
		list.add(new Department(2, "Coordena��o de Avia��o Operacional - CAOP"));
		list.add(new Department(3, "Servi�o de Prote��o ao Depoente Especial - SPDE"));
		list.add(new Department(4, "Divis�o de Seguran�a de Dignit�rio e Prote��o ao Depoente Especial - DSDE"));
		list.add(new Department(5, "Coordena��o de Seguran�a em Grandes Eventos - CGE"));
		list.add(new Department(6, "Servi�o de Apoio Administrativo - SAD"));
		*/
		
		return dao.findAll();
	}
}
