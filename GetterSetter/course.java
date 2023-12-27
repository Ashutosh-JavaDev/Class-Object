package GetterSetter;

class course {
    String Name, Course, arr[];
    char Grade;
    int press;

    void getName(String Name) {
        this.Name = Name;
    }

    String setName() {
        return Name;
    }

    void getCourse(String Course) {
        this.Course = Course;
    }

    String setCourse() {
        return Course;
    }

    void getGrade(char Grade) {
        this.Grade = Grade;
    }

    char setGrade() {
        return Grade;
    }

}
