package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truper.test.entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long>{

}
