package lekcijaSeshi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);
        System.out.println(faker.shakespeare().kingRichardIIIQuote());
//        System.out.println((faker.address().streetAddress()));

//        System.out.println(faker.address().streetName());
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Cat name " + faker.cat().name());

            // Adresi, telefona numuru, epastu, uzvardu, vienu pec brivas izveles

//            System.out.println(faker.address().country());
//            System.out.println(faker.address().city());
//            System.out.println(faker.address().streetName());
//            System.out.println(faker.phoneNumber().phoneNumber());
//            System.out.println(faker.internet().emailAddress());
//            System.out.println(faker.name().lastName());
//            System.out.println(faker.ancient().hero());

        }

    }

