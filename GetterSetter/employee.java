package GetterSetter;

class employee {
    String Name;
    int Salary, Year;

    void getName(String Name) {
        this.Name = Name;
    }

    String setName() {
        return Name;
    }

    void getvalue(int Salary, int Year) {
        this.Salary = Salary;
        this.Year = Year;
    }

    int setValue() {
        return Salary;
    }
}
