package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//        Entidade em que o JPA vai trabalhar, tipo da chave primaria
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
