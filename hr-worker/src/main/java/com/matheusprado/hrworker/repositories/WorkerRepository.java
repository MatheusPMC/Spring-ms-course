package com.matheusprado.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusprado.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
