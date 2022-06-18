package za.co.tumi.service;

import za.co.tumi.model.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> findAll();

    Candidate findById(Long id);

    Candidate findByFirstNameAndLastName(String firstName, String lastName);

    Candidate saveCandidate(String firstName, String lastName);

    Candidate updateCandidate(long candidateId, String firstName, String lastName);

    Candidate deleteCandidate(long candidateId);
}
