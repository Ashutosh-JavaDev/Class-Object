class aa2 {
    private int age;
    private String Name;
    private char Gender;
    private double fare;

    void getAge(int age) {
        this.age = age;
    }

    int setAge() {
        return age;
    }

    void getName(String Name) {
        this.Name = Name;
    }

    String setName() {
        return Name;
    }

    void getGender(char Gender) {
        this.Gender = Gender;
    }

    char setGender() {
        return Gender;
    }

    void getFare(double fare) {
        this.fare = fare;
    }

    double setFare() {
        return fare;
    }

    double cal() {
        double da = 0;
        if (age <= 60) {
            da = da * .30;
        } else if (age <= 20) {
            da = da * .20;
        } else if (Gender == 'F' || Gender == 'f') {
            da = da * .10;
        }
        return da;
    }
}