package entities;

public class Triangule {

    public double width;
    public double height;

    public double area(){
        return this.height * this.width;
    }

    public double perimetro(){
        return (this.height + this.width) * 2;
    }

    public double diagonalR (){
        return Math.sqrt(this.width *  this.width + this.height * this.height);
    }

    public String toString(){
        java.lang.String s = "Area retangulo: " +
                area() +
                ", " +
                "Perimetro retangulo: " +
                perimetro() +
                ", " +
                "Diagonal retangulo: " +
                diagonalR();
        return s;
    }

}
