package data;

import java.util.Arrays;
import java.util.List;

import enums.SexTypeEnum;
import model.Person;

public class PersonDataMock {
	public static List<Person> getList() {
		// => new ArrayList<>()
		return Arrays.asList(
			new Person(
				"Steven Spielberg",
				75,
				"Cincinnati, Ohio, �tats-Unis",
				SexTypeEnum.MALE
			),
			new Person(
				"Peter Jackson",
				60,
				"Pukerua Bay, Porirua, Nouvelle-Z�lande",
				SexTypeEnum.MALE
			),
			new Person(
				"Michael Bay",
				57,
				"Los Angeles, Californie, �tats-Unis",
				SexTypeEnum.MALE
			)
		);
	}
}
