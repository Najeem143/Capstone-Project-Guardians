package tek.sdet.framework.utilities;

import com.github.javafaker.Faker;

public class DataGenerator {

	public static String addressGenerator(String input) {
		Faker faker = new Faker();

		String output = "";

		if (input.equalsIgnoreCase("country")) {
			output = faker.address().country();

		} else if (input.equalsIgnoreCase("fullName")) {
			output = faker.name().fullName();
		} else if (input.equalsIgnoreCase("phoneNumber")) {
			output = faker.phoneNumber().cellPhone();

		} else if (input.equalsIgnoreCase("streetAddress")) {
			output = faker.address().streetAddress();

		} else if (input.equalsIgnoreCase("city")) {
			output = faker.address().city();

		} else if (input.equalsIgnoreCase("state")) {
			output = faker.address().state();

		} else if (input.equalsIgnoreCase("zipCode")) {
			output = faker.address().zipCode();

		}

		return output;

	}

	public static String emailGenerator(String input) {
		Faker faker = new Faker();

		String output = "";

		if (input.equalsIgnoreCase("name")) {
			output = faker.name().fullName();
		} else if (input.equalsIgnoreCase("email")) {
			output = faker.internet().emailAddress();
		} else if (input.equalsIgnoreCase("password")) {
			output = faker.internet().password();

		}

		return output;

	}

}
