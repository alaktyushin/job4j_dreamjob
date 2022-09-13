package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;
import java.util.UUID;

public record Candidate(UUID id, String name, String description, LocalDateTime created) {
}
