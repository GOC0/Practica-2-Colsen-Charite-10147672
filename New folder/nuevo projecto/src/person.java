import java.io.*;

public class person {

    private String nombre;
    private int age;
    private int height;
    
    public person (String nombre, int age, int height){
        this.age = age;
        this.height= height;
        this.nombre= nombre;
    }

    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public String getNombre() {
        return nombre;
    }
    public void setAge(int age) {
        this.age = age;
    }public void setHeight(int height) {
        this.height = height;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(){
        System.err.println(age+" name: "+ nombre);
    }



}
