package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.AwardDataMock;
import model.Award;

public class AwardBusinessImpl implements AwardBusiness{
	
	List<Award> awards20 = AwardDataMock.getList2020();
	List<Award> awards21 = AwardDataMock.getList2021();
	List<Award> awards22 = AwardDataMock.getList2022();
	
	@Override
    public Optional<Award> get20(String id) {
        return awards20.stream()
                .filter(award -> Objects.equals(award.getId(), id))
                .findFirst();
    }
	
	@Override
    public Optional<Award> get21(String id) {
        return awards21.stream()
                .filter(award -> Objects.equals(award.getId(), id))
                .findFirst();
    }
	
	@Override
    public Optional<Award> get22(String id) {
        return awards22.stream()
                .filter(award -> Objects.equals(award.getId(), id))
                .findFirst();
    }
	
	@Override
    public List<Award> getList2020() {
        return awards20;
    }
	
	@Override
    public List<Award> getList2021() {
        return awards21;
    }
	
	@Override
    public List<Award> getList2022() {
        return awards22;
    }
}
