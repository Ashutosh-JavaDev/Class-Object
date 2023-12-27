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
    void check(){
        if(Year>=1943){
            int present=2023-Year;
            System.out.println("Year of Working:        "+present);
        }
        else if((Year>=1935) && (Year<=1942)){
            System.out.println("Please take Retirement and Visit Kashi");
        }
        else{
            System.out.println("Enter Valid Year of Joining");
        }
    }
}
