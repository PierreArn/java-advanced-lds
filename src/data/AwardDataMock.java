package data;

import java.util.Arrays;
import java.util.List;

import model.Award;

public class AwardDataMock {
	public static List<Award> getList2020(){
        return Arrays.asList(
            new Award("h8ZoeG", "Meilleur film", 2020),
            new Award("BMGQza", "Meilleur actrice", 2020),
            new Award("PscXOa", "Meilleur acteur", 2020),
            new Award("T7lsVf", "Meilleur musique de film", 2020),
            new Award("JWpc35", "Meilleur scénario original", 2020)
        );
    }
	public static List<Award> getList2021(){
        return Arrays.asList(
            new Award("jTKibJ", "Meilleur film", 2021),
            new Award("cBjaW1", "Meilleur actrice", 2021),
            new Award("GloBjV", "Meilleur acteur", 2021),
            new Award("o9oiRk", "Meilleur musique de film", 2021),
            new Award("gZqIJv", "Meilleur scénario original", 2021)
        );
    }
	public static List<Award> getList2022(){
        return Arrays.asList(
            new Award("EGJvZh", "Meilleur film", 2022),
            new Award("fsvm3i", "Meilleur actrice", 2022),
            new Award("Cmh1fp", "Meilleur acteur", 2022),
            new Award("BMqPjB", "Meilleur musique de film", 2022),
            new Award("zuQcai", "Meilleur scénario original", 2022)
        );
    }
	
	public static List<List<Award>> getList() {
		// => new ArrayList<>()
		return Arrays.asList(
			getList2020(),
			getList2021(),
			getList2022()
		);
	}
}
