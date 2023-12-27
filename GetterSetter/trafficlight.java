package GetterSetter;
class trafficlight {
    String color,newColor;
    void getcolor(String color){
        this.color=color;
    }
    String setColor(){
        return color;
    }
    void getNewcolor(String newColor){
        this.newColor=newColor;
    }
    String setNewColor(){
        return color=newColor;
    }
}
