import io.javalin.Javalin;

public class Main {

    public static void main() {

        var app= Javalin.create()
                .get("/",ctx-> ctx.result("hola"))
                .start(7000);
    }
}
