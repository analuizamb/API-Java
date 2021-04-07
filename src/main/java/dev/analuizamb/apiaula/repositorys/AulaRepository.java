package dev.analuizamb.apiaula.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.analuizamb.apiaula.models.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long> {
	Aula findById(long id);
}