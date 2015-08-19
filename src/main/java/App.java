import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;
import java.util.Timer;
import java.util.Map;
import java.util.HashMap;
import java.util.TimerTask;

import spark.ModelAndView;

import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App{
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

 		get("/rectangle", (request, response) -> {
		  HashMap<String, Object> model = new HashMap<String, Object>();

		  int length = Integer.parseInt(request.queryParams("length"));
		  int width = Integer.parseInt(request.queryParams("width"));

		  Rectangle myRectangle = new Rectangle(length, width);
		  model.put("myRectangle", myRectangle);

		  if (myRectangle.isSquare()) {
		  	Cube myCube = new Cube(myRectangle);
		  	model.put("myCube", myCube);
		  }

		  model.put("template", "templates/rectangle.vtl");
		  return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());



  }//end of main
}//end of class