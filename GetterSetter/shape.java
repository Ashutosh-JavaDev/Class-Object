package GetterSetter;

class shape {
    double area, perimeter, circumfrence;

    // Rectangle
    class Rectangle {
        float length, breadth;

        void getData(float length, float breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        float putLength() {
            return length;
        }

        float PutBreadth() {
            return breadth;
        }

        void disp() {
            area = length * breadth;
            System.out.println("Area of Rectangle:  " + area);
            perimeter = (length + breadth) * 2;
            System.out.println("Perimeter of Rectangle:    " + perimeter);
        }
    }

    // Triangle
    class Triangle {
        float Base, Height;

        void getData(float Base, float Height) {
            this.Base = Base;
            this.Height = Height;
        }

        float putBase() {
            return Base;
        }

        float putHeight() {
            return Height;
        }

        void disp() {
            area = 0.5 * Base * Height;
            System.out.println("Area of Triangle:  " + area);
            perimeter = (Base + Height);
            System.out.println("Perimeter of Triangle:    " + perimeter);
        }
    }

    // Circle
    class Circle {
        float Radius;

        void getData(float Radius) {
            this.Radius = Radius;
        }

        float putRadius() {
            return Radius;
        }

        void disp() {
            area = 3.14 * Radius * Radius;
            System.out.println("Area of Circle:  " + area);
            circumfrence = 2 * 3.14 * Radius;
            System.out.println("Circumfrence of Circle:    " + circumfrence);
        }
    }

}
