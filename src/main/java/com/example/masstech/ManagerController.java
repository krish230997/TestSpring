package com.example.masstech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/managers")
public class ManagerController {

	@Autowired
	ManagerService service;

	@PostMapping
	public ResponseEntity<ApiResponse> addManager(@RequestBody ManagerDTO m)
	{
		ManagerDTO dto= service.addManager(m);
		return ResponseEntity.ok(new ApiResponse("Added Success", dto));
	}
	
	@GetMapping
	public ResponseEntity<List<ManagerDTO>> getAllManagers()
	{
		List<ManagerDTO> dto= service.getAllManagers();
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping("/{mid}")
	public ResponseEntity<ManagerDTO> findManagerById(@PathVariable Integer mid)
	{
		ManagerDTO dto= service.findManagerById(mid);
		return ResponseEntity.ok(dto);
	}
}
