package br.com.senai.sa3semestre.projeto_efluentes.repositories;

import br.com.senai.sa3semestre.projeto_efluentes.entites.Amostra;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AmostraRepository extends JpaRepository<Amostra, Long> {
}
