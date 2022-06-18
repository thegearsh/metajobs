package za.co.tumi.service.impl;

import org.springframework.stereotype.Service;
import za.co.tumi.model.Candidate;
import za.co.tumi.repository.CandidateRepository;
import za.co.tumi.service.CandidateService;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultCandidateService implements CandidateService {

    private CandidateRepository candidateRepository;

    public DefaultCandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public List<Candidate> findAll() {
        return this.candidateRepository.findAll();
    }

    @Override
    public Candidate findById(Long id) {
        Optional<Candidate> candidateOptional = this.candidateRepository.findById(id);
        if (candidateOptional.isPresent()) {
            return candidateOptional.get();
        }
        throw new RuntimeException("Unable to find candidate with id " + id);
    }

    @Override
    public Candidate findByFirstNameAndLastName(String firstName, String lastName) {
        Candidate candidate = this.candidateRepository.findFirstByFirstNameAndAndLastName(firstName, lastName);
        if (candidate != null) {
            return candidate;
        }
        throw new RuntimeException("Unable to find candidate with first name " + firstName + " and last name " + lastName);
    }

    @Override
    public Candidate saveCandidate(String firstName, String lastName) {
        Candidate candidate = new Candidate();
        candidate.setFirstName(firstName);
        candidate.setLastName(lastName);
        return this.candidateRepository.save(candidate);
    }

    @Override
    public Candidate updateCandidate(long candidateId, String firstName, String lastName) {
        Candidate lookup = this.findById(candidateId);
        lookup.setFirstName(firstName);
        lookup.setLastName(lastName);
        return this.candidateRepository.save(lookup);
    }

    @Override
    public Candidate deleteCandidate(long candidateId) {
        Candidate candidate = this.findById(candidateId);
        this.candidateRepository.delete(candidate);
        return candidate;
    }

}
