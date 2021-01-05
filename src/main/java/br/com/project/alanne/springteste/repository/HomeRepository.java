package br.com.project.alanne.springteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository extends JpaRepository<Contato, Long> {

}
