package it.unipd.math.swe.patterns.di;

import java.util.List;
import java.util.stream.Collectors;

public class MovieLister {

    // This is the dependency of the type
    private MovieFinder finder;

    // @Inject
    // Using constructor injection, the dependencies are specified using constructor parameters
    public MovieLister(MovieFinder finder) {
        this.finder = finder;
    }

    // @Inject
    // Using setter injection, the dependencies are specified using setter
    public void setFinder(MovieFinder finder) {
        this.finder = finder;
    }

    // The introduction of a factory can move the responsibility of resolving dependencies outside of the type.
    // However, we still need to resolve the dependency of the factory.
    // public MovieLister() {
    //    finder = new MovieFinderFactory().buildMovieFinder();
    // }

    public List<Movie> moviesDirectedBy(String director) {
        final List<Movie> movies = finder.findAll();
        return movies.stream()
                .filter(movie -> movie.isDirectedBy(director))
                .collect(Collectors.toList());
    }
}
