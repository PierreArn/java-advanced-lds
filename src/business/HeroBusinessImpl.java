package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.HeroDataMock;
import model.Hero;

public class HeroBusinessImpl implements HeroBusiness {
	
	List<Hero> heros = HeroDataMock.getList();
	
	@Override
    public Optional<Hero> get(String id) {
        return heros.stream()
                .filter(hero -> Objects.equals(hero.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Hero> getList() {
        return heros;
    }
}
