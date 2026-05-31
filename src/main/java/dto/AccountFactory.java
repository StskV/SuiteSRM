package dto;

import com.github.javafaker.Faker;

public class AccountFactory {
    public static Account getAccount(String type, String industry) {
        Faker faker = new Faker();
        return Account.builder()
                .name(faker.company().name())
                .phone(faker.phoneNumber().phoneNumber())
                .website(faker.internet().url())
                .email(faker.internet().emailAddress())
                .fax(faker.phoneNumber().phoneNumber())
                .billingStreet(faker.address().streetAddress())
                .billingCity(faker.address().city())
                .billingState(faker.address().state())
                .billingPostalCode(faker.address().zipCode())
                .billingCountry(faker.address().country())
                .shippingStreet(faker.address().streetAddress())
                .shippingCity(faker.address().city())
                .shippingState(faker.address().state())
                .shippingPostalCode(faker.address().zipCode())
                .shippingCountry(faker.address().country())
                .description(faker.lorem().paragraph())
                .type(type)
                .industry(industry)
                .build();
    }
}