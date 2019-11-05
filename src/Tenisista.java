public class Tenisista implements Comparable<Tenisista> {
    private final int position;
    private final String nationality;
    private final String name;
    private final String lastName;
    private final int age;
    private final int points;
    private final int numberOfTournaments;

    public Tenisista(int position, String nationality, String name, String lastName, int age, int points, int numberOfTournaments) {
        this.position = position;
        this.nationality = nationality;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.points = points;
        this.numberOfTournaments = numberOfTournaments;
    }//end of constructor

    public int getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Tenisista tenisista) {
        return Integer.compare(age, tenisista.age);
    }
}//end of class
