package hello.hellospring.repository;


import hello.hellospring.entity.rh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<rh, Long> {



}
