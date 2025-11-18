package com.example.masstech;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

	@Autowired
	ManagerRepo repo;

	@Autowired
	ModelMapper mapper;
	
	public ManagerDTO addManager(ManagerDTO dto)
	{
		Manager m= mapper.map(dto, Manager.class);
		Manager m2=repo.save(m);
		return mapper.map(m2, ManagerDTO.class);
	}
	
	public List<ManagerDTO> getAllManagers()
	{
		return repo.findAll()
				.stream()
				.map(m->mapper.map(m, ManagerDTO.class)).toList();
	}
	
	public ManagerDTO findManagerById(Integer mid)
	{
		Manager m= repo.findById(mid).orElse(null);
	    return mapper.map(m, ManagerDTO.class);
	}
}
