package com.londrina.reporta.repository;

    import com.londrina.reporta.model.Problema;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

@Repository
public interface ProblemaRepository extends JpaRepository<Problema, Long>{
    
}
