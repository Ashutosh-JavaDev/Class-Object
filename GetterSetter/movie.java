package GetterSetter;

class movie {
    String Title, Actor, Director;
    int Review;

    void getdata(String Title, String Actor, String Director, int Review) {
        this.Title = Title;
        this.Actor = Actor;
        this.Director = Director;
        this.Review = Review;
    }
}
