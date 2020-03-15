package it.unipd.math.swe.patterns.di;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder {

    // Movie finder has a dependency itself
    private DB driver;

    // @Inject
    public MovieFinder(DB driver) {
        this.driver = driver;
    }

    public List<Movie> findAll() {
        return new ArrayList<>();
    }
}
