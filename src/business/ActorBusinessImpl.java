package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.ActorDataMock;
import model.Actor;

public class ActorBusinessImpl implements ActorBusiness {
	
	List<Actor> actors = ActorDataMock.getList();
	
	@Override
    public Optional<Actor> get(String id) {
        return actors.stream()
                .filter(actor -> Objects.equals(actor.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Actor> getList() {
        return actors;
    }
}
