package spring_boot_project_artefact_id;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository< Actor, Long> {
	
}
