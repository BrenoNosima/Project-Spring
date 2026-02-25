package br.edu.unicesumar.school.repositories;

import br.edu.unicesumar.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

}
