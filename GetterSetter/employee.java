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

    void getSalary(int Salary) {
        this.Salary = Salary;
    }

    int setSalary() {
        return Salary;
    }
    void getYear(int Year){
        this.Year=Year;
    }
    int setYear(){
        return Year;
    }
    
}
