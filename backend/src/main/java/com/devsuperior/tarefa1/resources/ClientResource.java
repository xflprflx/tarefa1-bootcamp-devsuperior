package com.devsuperior.tarefa1.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.tarefa1.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Filipe", "01965277080", 4500.00, Instant.now(), 5));
		list.add(new Client(2L, "Filipe", "01965277080", 4500.00, Instant.now(), 5));
		return ResponseEntity.ok().body(list);
	}
}
