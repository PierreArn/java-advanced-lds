package data;

import java.util.Arrays;
import java.util.List;

import enums.SexTypeEnum;
import model.Actor;

public class ActorDataMock {
	public static List<Actor> getList() {
		// => new ArrayList<>()
		return Arrays.asList(
			new Actor(
				"Robert Pattinson",
				35,
				"Londres, Royaume-Uni",
				SexTypeEnum.MALE,
				"puZlpi",
				MovieDataMock.getRobetPattinsonMovie()
			),
			new Actor(
				"Robert Downey Jr.",
				57,
				"Manhattan, New York, �tat de New York, �tats-Unis",
				SexTypeEnum.MALE,
				"UO1BiH",
				MovieDataMock.getRobetDowneyJrMovie()
			),
			new Actor(
				"Tom Holland",
				25,
				"Kingston upon Thames, Royaume-Uni",
				SexTypeEnum.MALE,
				"Im7VkG",
				MovieDataMock.getTomHollandMovie()
			),
			new Actor(
				"Gal Gadot",
				36,
				"Rosh HaAyin, Isra�l",
				SexTypeEnum.FEMALE,
				"NOJEdx",
				MovieDataMock.getGalGadotMovie()
			),
			new Actor(
				"Scarlett Johansson",
				37,
				"Manhattan, New York, �tat de New York, �tats-Unis",
				SexTypeEnum.FEMALE,
				"EOqOPV",
				MovieDataMock.getScarlettJohanssonMovie()
			),
			new Actor(
				"Brie Larson",
				32,
				"Sacramento, Californie, �tats-Unis",
				SexTypeEnum.FEMALE,
				"cQ5nwC",
				MovieDataMock.getBrieLarsonMovie()
			)
		);
	}
}
