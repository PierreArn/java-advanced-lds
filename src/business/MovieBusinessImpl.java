package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.MovieDataMock;
import model.Movie;

public class MovieBusinessImpl implements MovieBusiness {

	List<Movie> rpMovies = MovieDataMock.getRobetPattinsonMovie();
	List<Movie> thMovies = MovieDataMock.getTomHollandMovie();
	List<Movie> rdjMovies = MovieDataMock.getRobetDowneyJrMovie();
	List<Movie> blMovies = MovieDataMock.getBrieLarsonMovie();
	List<Movie> sjMovies = MovieDataMock.getScarlettJohanssonMovie();
	List<Movie> ggMovies = MovieDataMock.getGalGadotMovie();
	
	
	@Override
    public Optional<Movie> getRobetPattinsonMovie(String id) {
        return rpMovies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Movie> getRobetPattinsonMoviesList() {
        return rpMovies;
    }
	
	@Override
    public Optional<Movie> getRobetDowneyJrMovie(String id) {
        return rdjMovies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Movie> getRobetDowneyJrMoviesList() {
        return rdjMovies;
    }
	
	@Override
    public Optional<Movie> getTomHollandMovie(String id) {
        return thMovies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Movie> getTomHollandMoviesList() {
        return thMovies;
    }
	
	@Override
    public Optional<Movie> getGalGadotMovie(String id) {
        return ggMovies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Movie> getGalGadotMoviesList() {
        return ggMovies;
    }
	
	@Override
    public Optional<Movie> getScarlettJohanssonMovie(String id) {
        return sjMovies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Movie> getScarlettJohanssonMoviesList() {
        return sjMovies;
    }
	
	@Override
    public Optional<Movie> getBrieLarsonMovie(String id) {
        return blMovies.stream()
                .filter(movie -> Objects.equals(movie.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Movie> getBrieLarsonMoviesList() {
        return blMovies;
    }
	
}
