package br.com.senai.sa3semestre.projeto_efluentes.repositories;

import br.com.senai.sa3semestre.projeto_efluentes.entites.Equipamentos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EquipamentosRepository extends JpaRepository<Equipamentos, Long> {
}
