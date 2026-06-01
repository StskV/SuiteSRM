package dto;

public class Account {
    private final String name;
    private final String phone;
    private final String website;
    private final String fax;
    private final String email;
    private final String description;
    private final String type;
    private final String industry;
    private final String billingStreet;
    private final String billingCity;
    private final String billingState;
    private final String billingPostalCode;
    private final String billingCountry;
    private final String shippingStreet;
    private final String shippingCity;
    private final String shippingState;
    private final String shippingPostalCode;
    private final String shippingCountry;

    private Account(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.website = builder.website;
        this.fax = builder.fax;
        this.email = builder.email;
        this.description = builder.description;
        this.type = builder.type;
        this.industry = builder.industry;
        this.billingStreet = builder.billingStreet;
        this.billingCity = builder.billingCity;
        this.billingState = builder.billingState;
        this.billingPostalCode = builder.billingPostalCode;
        this.billingCountry = builder.billingCountry;
        this.shippingStreet = builder.shippingStreet;
        this.shippingCity = builder.shippingCity;
        this.shippingState = builder.shippingState;
        this.shippingPostalCode = builder.shippingPostalCode;
        this.shippingCountry = builder.shippingCountry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String phone;
        private String website;
        private String fax;
        private String email;
        private String description;
        private String type;
        private String industry;
        private String billingStreet;
        private String billingCity;
        private String billingState;
        private String billingPostalCode;
        private String billingCountry;
        private String shippingStreet;
        private String shippingCity;
        private String shippingState;
        private String shippingPostalCode;
        private String shippingCountry;

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder phone(String value) {
            this.phone = value;
            return this;
        }

        public Builder website(String value) {
            this.website = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder fax(String value) {
            this.fax = value;
            return this;
        }

        public Builder billingStreet(String v) {
            this.billingStreet = v;
            return this;
        }

        public Builder billingCity(String v) {
            this.billingCity = v;
            return this;
        }

        public Builder billingState(String v) {
            this.billingState = v;
            return this;
        }

        public Builder billingPostalCode(String v) {
            this.billingPostalCode = v;
            return this;
        }

        public Builder billingCountry(String v) {
            this.billingCountry = v;
            return this;
        }

        public Builder shippingStreet(String v) {
            this.shippingStreet = v;
            return this;
        }

        public Builder shippingCity(String v) {
            this.shippingCity = v;
            return this;
        }

        public Builder shippingState(String v) {
            this.shippingState = v;
            return this;
        }

        public Builder shippingPostalCode(String v) {
            this.shippingPostalCode = v;
            return this;
        }

        public Builder shippingCountry(String v) {
            this.shippingCountry = v;
            return this;
        }

        public Builder description(String v) {
            this.description = v;
            return this;
        }

        public Builder type(String v) {
            this.type = v;
            return this;
        }

        public Builder industry(String v) {
            this.industry = v;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getEmail() {
        return email;
    }

    public String getFax() {
        return fax;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getIndustry() {
        return industry;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }
}