package main;

import java.util.Optional;

import business.ActorBusinessImpl;
import business.AwardBusinessImpl;
import business.HeroBusinessImpl;
import business.MovieBusinessImpl;
import data.ActorDataMock;
import data.AwardDataMock;
import data.HeroDataMock;
import data.MovieDataMock;
import data.PersonDataMock;
import data.SkillDataMock;
import model.Actor;
import model.Award;
import model.Hero;
import model.Movie;

public class Main {
	public static void main (String[] args) {
//		System.out.println(AwardDataMock.getList2022());
//		System.out.println(MovieDataMock.getRobetPattinsonMovie());
//		System.out.println(SkillDataMock.getList());
//		System.out.println(ActorDataMock.getList());
//		System.out.println(HeroDataMock.getList());
		
		System.out.println("<--- Actor --->");
		ActorBusinessImpl actorBusiness = new ActorBusinessImpl();
		System.out.println("Get Robert Pattinson by id");
        Optional<Actor> rpActor = actorBusiness.get("puZlpi");
        System.out.println(rpActor);
        System.out.println("Get all actors");
		System.out.println(actorBusiness.getList());
		
		System.out.println("<--- Hero --->");
		HeroBusinessImpl heroBusiness = new HeroBusinessImpl();
		System.out.println("Get Batman by id");
        Optional<Hero> batman = heroBusiness.get("MOavvk");
        System.out.println(batman);
        System.out.println("Get all heros");
		System.out.println(heroBusiness.getList());
		
		System.out.println("<--- Movie --->");
		MovieBusinessImpl movieBusiness = new MovieBusinessImpl();
		System.out.println("Get Scarlett Johansson movies by id where she is Black Widow");
        Optional<Movie> sjMovies = movieBusiness.getScarlettJohanssonMovie("iMfMfE");
        System.out.println(sjMovies);
        System.out.println("Get all movies of Brie Larson");
		System.out.println(movieBusiness.getBrieLarsonMoviesList());
		
		System.out.println("<--- Award --->");
		AwardBusinessImpl awardBusiness = new AwardBusinessImpl();
		System.out.println("Get award of best actor 2020 by id");
        Optional<Award> awardMeilleurActeur2020 = awardBusiness.get20("PscXOa");
        System.out.println(awardMeilleurActeur2020);
        System.out.println("Get all awards of 2022");
		System.out.println(awardBusiness.getList2022());
	}
}
