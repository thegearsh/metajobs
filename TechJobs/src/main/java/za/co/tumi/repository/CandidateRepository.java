package za.co.tumi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.tumi.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    Candidate findFirstByFirstNameAndAndLastName(String firstName, String lastName);
}