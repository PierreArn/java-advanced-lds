package business;

import java.util.List;
import java.util.Optional;

import model.Movie;

public interface MovieBusiness {
	/**
     * Get Robet Pattinson's movie by id
     *
     * @param id movie identifiant of Robet Pattinson
     * @return movie find by id
     */
    Optional<Movie> getRobetPattinsonMovie(String id);

    /**
     * Get Robet Pattinson's movies list
     *
     * @return Robet Pattinson's movies list   
     */
    List<Movie> getRobetPattinsonMoviesList();
    
    /**
     * Get Robet Downey Jr's movie by id
     *
     * @param id movie identifiant of Robet Downey Jr
     * @return movie find by id
     */
    Optional<Movie> getRobetDowneyJrMovie(String id);

    /**
     * Get Robet Downey Jr's movies list
     *
     * @return Robet Downey Jr's movies list
     */
    List<Movie> getRobetDowneyJrMoviesList();
    
    /**
     * Get Tom Holland's movie by id
     *
     * @param id movie identifiant of Tom Holland
     * @return movie find by id
     */
    Optional<Movie> getTomHollandMovie(String id);

    /**
     * Get Tom Holland's movies list
     *
     * @return Tom Holland's movies list
     */
    List<Movie> getTomHollandMoviesList();
    
    /**
     * Get Gal Gadot's movie by id
     *
     * @param id movie identifiant of Gal Gadot
     * @return movie find by id
     */
    Optional<Movie> getGalGadotMovie(String id);

    /**
     * Get Gal Gadot's movies list
     *
     * @return Gal Gadot's movies list
     */
    List<Movie> getGalGadotMoviesList();
    
    /**
     * Get Scarlett Johansson's movie by id
     *
     * @param id movie identifiant of Scarlett Johansson
     * @return movie find by id
     */
    Optional<Movie> getScarlettJohanssonMovie(String id);

    /**
     * Get Scarlett Johansson's movies list
     *
     * @return Scarlett Johansson's movies list
     */
    List<Movie> getScarlettJohanssonMoviesList();
    
    /**
     * Get Brie Larson's movie by id
     *
     * @param id movie identifiant of Brie Larson
     * @return movie find by id
     */
    Optional<Movie> getBrieLarsonMovie(String id);

    /**
     * Get Brie Larson's movies list
     *
     * @return Brie Larson's movies list
     */
    List<Movie> getBrieLarsonMoviesList();
}
