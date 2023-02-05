package enums;

public enum CarBody {
    SEDAN("седан"),
    HATCHBACK("хетчбэк"),
    COUPE("купе"),
    WAGON("универсал"),
    SUV("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");

    private final String carBody;

    CarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getCarBody() {
        return carBody;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + carBody;
    }

}
