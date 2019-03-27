package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Coordenação do Centro Integrado de Gestão Estratégica - CIGE"));
		list.add(new Department(2, "Coordenação de Aviação Operacional - CAOP"));
		list.add(new Department(3, "Serviço de Proteção ao Depoente Especial - SPDE"));
		list.add(new Department(3, "Divisão de Segurança de Dignitário e Proteção ao Depoente Especial - DSDE"));
		list.add(new Department(3, "Coordenação de Segurança em Grandes Eventos - CGE"));
		list.add(new Department(3, "Serviço de Apoio Administrativo - SAD"));
		
		return list;
	}
}
