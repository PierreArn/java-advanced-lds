package data;

import java.util.Arrays;
import java.util.List;

import enums.MovieTypeEnum;
import model.Movie;

public class MovieDataMock {
	
	public static List<Movie> getRobetPattinsonMovie(){
        return Arrays.asList(
            new Movie("I1kw69", "The Batman", 2022, MovieTypeEnum.SUPER_HEROS),
            new Movie("RAEXJO", "Twilight, chapitre I : Fascination", 2008, MovieTypeEnum.FANTASTIQUE),
            new Movie("F9Hp4e", "Harry Potter et la Coupe de feu", 2005, MovieTypeEnum.FANTASTIQUE)
        );
    }
	public static List<Movie> getRobetDowneyJrMovie() {
		return Arrays.asList(
            new Movie("6mKAKf", "Spider-Man: Far From Home", 2019, MovieTypeEnum.SUPER_HEROS),
            new Movie("0eptvh", " Iron Man 3", 2013, MovieTypeEnum.SUPER_HEROS),
            new Movie("3mUVp8", " Iron Man 2", 2010, MovieTypeEnum.SUPER_HEROS)
        );
    }
	public static List<Movie> getTomHollandMovie() {
		return Arrays.asList(
            new Movie("zywRCY", "Spider-Man: No Way Home", 2021, MovieTypeEnum.SUPER_HEROS),
            new Movie("B5kQu7", " Spider-Man: Far From Home", 2019, MovieTypeEnum.SUPER_HEROS),
            new Movie("sf1lZ1", "Spider-Man: Homecoming", 2017, MovieTypeEnum.SUPER_HEROS)  
        );
    }
	public static List<Movie> getGalGadotMovie() {
		return Arrays.asList(
			new Movie("06yMht", "Wonder Woman 1984", 2020, MovieTypeEnum.SUPER_HEROS),
            new Movie("QQGwFM", "Fast and Furious 9 ", 2019, MovieTypeEnum.ACTION),
            new Movie("c7TbHG", "Triple 9", 2016, MovieTypeEnum.POLICIER)
        );
    }
	public static List<Movie> getScarlettJohanssonMovie() {
		return Arrays.asList(
            new Movie("iMfMfE", "Black Widow", 2021, MovieTypeEnum.SUPER_HEROS),
            new Movie("twhVoJ", "Avengers: Infinity War", 2018, MovieTypeEnum.SUPER_HEROS),
            new Movie("3ENbI4", "Lucy", 2014, MovieTypeEnum.SCIENCE_FICTION)
        );
    }
	public static List<Movie> getBrieLarsonMovie() {
		return Arrays.asList(
            new Movie("yecxUC", "Captain Marvel", 2019, MovieTypeEnum.SUPER_HEROS),
            new Movie("LToheu", "Le Château de verre", 2017, MovieTypeEnum.DRAME),
            new Movie("a6Yw10", "Unicorn Store", 2017, MovieTypeEnum.COMEDIE)
        );
    }
}
