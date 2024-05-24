package activities;

public class Activity3 {
 
	static final double EARTH_YEAR_IN_SECONDS = 31557600;
    static final double MERCURY_ORBITAL_PERIOD = 0.2408467;
    static final double VENUS_ORBITAL_PERIOD = 0.61519726;
    static final double MARS_ORBITAL_PERIOD = 1.8808158;
    static final double JUPITER_ORBITAL_PERIOD = 11.862615;
    static final double SATURN_ORBITAL_PERIOD = 29.447498;
    static final double URANUS_ORBITAL_PERIOD = 84.016846;
    static final double NEPTUNE_ORBITAL_PERIOD = 164.79132;

    public static void main(String[] args) {
        long ageInSeconds = 1000000000;

        System.out.println("Age on Earth: " + calculateAgeOnPlanet(ageInSeconds, EARTH_YEAR_IN_SECONDS) + " Earth-years");
        System.out.println("Age on Mercury: " + calculateAgeOnPlanet(ageInSeconds, MERCURY_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Mercury-years");
        System.out.println("Age on Venus: " + calculateAgeOnPlanet(ageInSeconds, VENUS_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Venus-years");
        System.out.println("Age on Mars: " + calculateAgeOnPlanet(ageInSeconds, MARS_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Mars-years");
        System.out.println("Age on Jupiter: " + calculateAgeOnPlanet(ageInSeconds, JUPITER_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Jupiter-years");
        System.out.println("Age on Saturn: " + calculateAgeOnPlanet(ageInSeconds, SATURN_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Saturn-years");
        System.out.println("Age on Uranus: " + calculateAgeOnPlanet(ageInSeconds, URANUS_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Uranus-years");
        System.out.println("Age on Neptune: " + calculateAgeOnPlanet(ageInSeconds, NEPTUNE_ORBITAL_PERIOD * EARTH_YEAR_IN_SECONDS) + " Neptune-years");
    }

    public static double calculateAgeOnPlanet(long seconds, double orbitalPeriodInSeconds) {
        return seconds / orbitalPeriodInSeconds;
    }
}