package it.unipd.math.swe.patterns.di;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MovieListerTest {

    // The use of some mechanism of dependency management enables to using
    // mocks in unit test. In a unit test, the target type must be tested in isolation.
    @Test
    public void moviesDirectedByShouldReturnTheMoviesOfAGivenDirector() {
        final MovieFinder finder = Mockito.mock(MovieFinder.class);
        BDDMockito.given(finder.findAll()).willReturn(Collections.emptyList());
        final MovieLister lister = new MovieLister(finder);
        final List<Movie> movies = lister.moviesDirectedBy("rcardin");
        Assertions.assertThat(movies).isEqualTo(Collections.emptyList());
    }
}