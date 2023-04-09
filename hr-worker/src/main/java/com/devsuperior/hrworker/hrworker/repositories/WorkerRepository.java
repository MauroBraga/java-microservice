package com.devsuperior.hrworker.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
