package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truper.test.entity.Producto;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto,Long>{

}
