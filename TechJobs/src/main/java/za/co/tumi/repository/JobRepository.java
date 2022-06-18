package za.co.tumi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.tumi.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
    
}
