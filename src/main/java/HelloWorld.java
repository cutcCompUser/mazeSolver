import static spark.Spark.*;
import spark.*;

public class HelloWorld {
  public static void main(String[] args) {
    setPort(Integer.parseInt(System.getenv("PORT")));
    post(new Route("/echo") {
      @Override
      public Object handle(Request request, Response response) {
        return request.body();
      }
    });
  }
}
