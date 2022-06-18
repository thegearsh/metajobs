package za.co.tumi.controller;

import org.springframework.web.bind.annotation.*;
import za.co.tumi.model.Candidate;
import za.co.tumi.service.CandidateService;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    private CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping
    public List<Candidate> getCandidates() {
        return this.candidateService.findAll();
    }

    @GetMapping(value = "/{candidateId}")
    public Candidate findCandidateById(@PathVariable("candidateId") long candidateId) {
        return this.candidateService.findById(candidateId);
    }

    @PostMapping(value = "/save")
    public Candidate saveCandidate(@RequestBody Candidate candidate) {
        return this.candidateService.saveCandidate(candidate.getFirstName(), candidate.getLastName());
    }

    @PutMapping(value = "/{candidateId}/update")
    public Candidate update(@PathVariable("candidateId") long candidateId, @RequestBody Candidate candidate) {
        return this.candidateService.updateCandidate(candidateId, candidate.getFirstName(), candidate.getLastName());
    }

    @DeleteMapping(value = "/{candidateId}")
    public Candidate deleteCan(@PathVariable("candidateId") long candidateId) {
        return this.candidateService.deleteCandidate(candidateId);
    }

}