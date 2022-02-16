package edu.yavirac.campaniabackend.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import edu.yavirac.campaniabackend.entity.Campania;

public interface CampaniaRepository extends CrudRepository<Campania,Long>{
    List<Campania> findAll();
}
