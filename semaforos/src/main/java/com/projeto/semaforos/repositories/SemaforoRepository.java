package com.projeto.semaforos.repositories;

import com.projeto.semaforos.models.Semaforo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemaforoRepository extends JpaRepository<Semaforo, Long> {
}
