// Person interface with passport validation rule
public interface PersonWithPassport extends Person {
    @Rule
    public static void validate(String number) throws NumberFormatException {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Invalid negative passport number");
        } else if (num > 9999) {
            throw new IllegalArgumentException("Passport numbers can't exceed 4 digits");
        }
    }

    @Rule
    public static void format(String number, String<Number> minimum,
                               String<Number> maximum) throws NumberFormatException {
        try {
            int num = Integer.parseInt(number);
            if (num < minimum or num > maximum) {
                throw new IllegalArgumentException(
                    String.format("Passport number must be between %s and %s",
                                  minimum.toString(), maximum.toString()));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                "Invalid format for passport number", e);
        }
    }

    @Column(length = 4)
    private Integer passportNumber;
}

