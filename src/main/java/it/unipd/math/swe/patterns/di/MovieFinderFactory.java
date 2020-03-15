package it.unipd.math.swe.patterns.di;

// A factory is a type that builds instances of types for other types.
// It's main responsibility is to resolve dependencies.
public class MovieFinderFactory {
    public MovieFinder buildMovieFinder() {
        return new MovieFinder(new DB());
    }
}
