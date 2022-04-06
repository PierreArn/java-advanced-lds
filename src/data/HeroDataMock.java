package data;

import java.util.Arrays;
import java.util.List;

import model.Hero;

public class HeroDataMock {
	static Hero getTheBatman() {
		Hero theBatman = new Hero();
        theBatman.setId("MOavvk");
        theBatman.setName("Bruce Wayne");
        theBatman.setActor(ActorDataMock.getList().get(0));
        theBatman.setTown("Gotham");
        theBatman.setMovie(MovieDataMock.getRobetPattinsonMovie().get(0));
        theBatman.setSkill(SkillDataMock.getList());
        return theBatman;
    }

    static Hero getIronMan() {
    	Hero ironMan = new Hero();
    	ironMan.setId("lbZFBc");
    	ironMan.setName("Tony Stark");
    	ironMan.setActor(ActorDataMock.getList().get(1));
    	ironMan.setTown("New York");
    	ironMan.setMovie(MovieDataMock.getRobetDowneyJrMovie().get(1));
    	ironMan.setSkill(SkillDataMock.getList());

        return ironMan;
    }
    
    static Hero getSpiderMan() {
    	Hero spiderMan = new Hero();
    	spiderMan.setId("28hBxy");
    	spiderMan.setName("Peter Parker");
    	spiderMan.setActor(ActorDataMock.getList().get(2));
    	spiderMan.setTown("New York");
    	spiderMan.setMovie(MovieDataMock.getTomHollandMovie().get(0));
    	spiderMan.setSkill(SkillDataMock.getList());

        return spiderMan;
    }
    
    static Hero getWonderWoman() {
    	Hero wonderWoman = new Hero();
    	wonderWoman.setId("jAG22O");
    	wonderWoman.setName("Diana Prince");
    	wonderWoman.setActor(ActorDataMock.getList().get(3));
    	wonderWoman.setTown("Themyscira Island");
    	wonderWoman.setMovie(MovieDataMock.getGalGadotMovie().get(0));
    	wonderWoman.setSkill(SkillDataMock.getList());

        return wonderWoman;
    }
    
    static Hero getCaptainMarvel() {
    	Hero captainMarvel = new Hero();
    	captainMarvel.setId("5NlsiW");
    	captainMarvel.setName("Carol Danvers");
    	captainMarvel.setActor(ActorDataMock.getList().get(5));
    	captainMarvel.setTown("Los Angeles, California");
    	captainMarvel.setMovie(MovieDataMock.getBrieLarsonMovie().get(0));
    	captainMarvel.setSkill(SkillDataMock.getList());

        return captainMarvel;
    }
    
    static Hero getBlackWidow() {
    	Hero blackWidow = new Hero();
    	blackWidow.setId("3N0RNt");
    	blackWidow.setName("Natasha Romanoff");
    	blackWidow.setActor(ActorDataMock.getList().get(4));
    	blackWidow.setTown("Budapest");
    	blackWidow.setMovie(MovieDataMock.getScarlettJohanssonMovie().get(0));
    	blackWidow.setSkill(SkillDataMock.getList());

        return blackWidow;
    }
    
	public static List<Hero> getList() {
		// => new ArrayList<>()
		return Arrays.asList(
			getTheBatman(),
			getIronMan(),
			getSpiderMan(),
			getWonderWoman(),
			getCaptainMarvel(),
			getBlackWidow()
		);
	}
}
