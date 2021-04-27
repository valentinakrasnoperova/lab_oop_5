public class Worker implements Comparable<Worker> {
    String surnameAndInitials;
    String position;
    int yearWhenStarted;

    public Worker(String surnameAndInitials, String position, int yearWhenStarted) {
        this.surnameAndInitials = surnameAndInitials;
        this.position = position;
        this.yearWhenStarted = yearWhenStarted;

    }


    @Override
    public String toString() {
        return "Surname and initials : " + surnameAndInitials + ", position : " + position + "year of starting : " + yearWhenStarted;
    }

    @Override
    public int compareTo(Worker other) {
        return (this.surnameAndInitials.compareTo(other.surnameAndInitials));
    }

}
