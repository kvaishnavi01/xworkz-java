class Earth {
    String continent;
    String country;
    double population;
    String climate;

    Earth() {
        System.out.println("Earth object created!");
    }

    public static void main(String[] args) {
        Earth e1 = new Earth();
        e1.continent = "Asia";
        e1.country = "India";
        e1.population = 1.4;
        e1.climate = "Tropical";
        System.out.println(e1.continent + "  " + e1.country + "  " + e1.population + "B  " + e1.climate);

        Earth e2 = new Earth();
        e2.continent = "North America";
        e2.country = "USA";
        e2.population = 0.33;
        e2.climate = "Temperate";
        System.out.println(e2.continent + "  " + e2.country + "  " + e2.population + "B  " + e2.climate);

        Earth e3 = new Earth();
        e3.continent = "Europe";
        e3.country = "Germany";
        e3.population = 0.083;
        e3.climate = "Oceanic";
        System.out.println(e3.continent + "  " + e3.country + "  " + e3.population + "B  " + e3.climate);

        Earth e4 = new Earth();
        e4.continent = "South America";
        e4.country = "Brazil";
        e4.population = 0.213;
        e4.climate = "Tropical";
        System.out.println(e4.continent + "  " + e4.country + "  " + e4.population + "B  " + e4.climate);

        Earth e5 = new Earth();
        e5.continent = "Africa";
        e5.country = "Nigeria";
        e5.population = 0.206;
        e5.climate = "Savanna";
        System.out.println(e5.continent + "  " + e5.country + "  " + e5.population + "B  " + e5.climate);

        Earth e6 = new Earth();
        e6.continent = "Australia";
        e6.country = "Australia";
        e6.population = 0.026;
        e6.climate = "Arid";
        System.out.println(e6.continent + "  " + e6.country + "  " + e6.population + "B  " + e6.climate);

        Earth e7 = new Earth();
        e7.continent = "Antarctica";
        e7.country = "N/A";
        e7.population = 0.000004;
        e7.climate = "Polar";
        System.out.println(e7.continent + "  " + e7.country + "  " + e7.population + "B  " + e7.climate);

        Earth e8 = new Earth();
        e8.continent = "Asia";
        e8.country = "China";
        e8.population = 1.41;
        e8.climate = "Varied";
        System.out.println(e8.continent + "  " + e8.country + "  " + e8.population + "B  " + e8.climate);

        Earth e9 = new Earth();
        e9.continent = "Europe";
        e9.country = "France";
        e9.population = 0.067;
        e9.climate = "Temperate";
        System.out.println(e9.continent + "  " + e9.country + "  " + e9.population + "B  " + e9.climate);

        Earth e10 = new Earth();
        e10.continent = "North America";
        e10.country = "Canada";
        e10.population = 0.038;
        e10.climate = "Subarctic";
        System.out.println(e10.continent + "  " + e10.country + "  " + e10.population + "B  " + e10.climate);
    }
}
