package ru.job4j.dreamjob.model;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* Singleton */
public class PostStore {

    private static final PostStore INST = new PostStore();

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private PostStore() {
        posts.put(1, new Post(1, "Junior Java Job", "Description of JJJob"));
        posts.put(2, new Post(2, "Middle Java Job", "Description of Middle Java Developer Job"));
        posts.put(3, new Post(3, "Senior Java Job"));
    }

    public static PostStore instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}
