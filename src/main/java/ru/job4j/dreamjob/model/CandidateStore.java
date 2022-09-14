package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* Singleton */
public class CandidateStore {

    private static final CandidateStore INST = new CandidateStore();

    private final Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    private CandidateStore() {
        candidates.put(1, new Candidate(1, "Andrey", "CV of Andrey", LocalDateTime.now()));
        candidates.put(2, new Candidate(2, "Boris", "CV of Boris", LocalDateTime.now()));
        candidates.put(3, new Candidate(3, "Clare", "CV of Clare", LocalDateTime.now()));
        candidates.put(4, new Candidate(4, "Clara", "CV of Clara", LocalDateTime.now()));
        candidates.put(5, new Candidate(5, "Boris", "CV of Boris", LocalDateTime.now()));
    }

    public static CandidateStore instOf() {
        return INST;
    }

    public Collection<Candidate> findAll() {
        return candidates.values();
    }
}
