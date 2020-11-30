import Models.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ObjDoubleConsumer;


import Models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;


public class App {
    private static Object Squad;

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
    public static void main(String[] args) {

        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        Map<String, Object> model = new HashMap<>();

        get("/", (request, response) -> {
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/add-hero", (request, response) -> {
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/add-hero",(req,res)->{
            String name = req.queryParams("name");
            String power = req.queryParams("superpower");
            String weakness = req.queryParams("weakness");
            int age = Integer.parseInt(req.queryParams("age"));
            int squadId = Integer.parseInt(req.queryParams("squad"));
            Hero anotherHero = new Hero(name, age, power,weakness, squadId);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
//
        get("/add-squad", (request, response) -> {
            
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());


        post("/add-squad", (req, res) -> {
            String name = req.queryParams("name");
            String cause = req.queryParams("volume");
            int size = Integer.parseInt(req.queryParams("volume"));
            Squad anotherSquad = new Squad(name, cause, size);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            
            model.put("squad", Squad);
            return new ModelAndView(model, "hero-details.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            return new ModelAndView(model, "squad-details.hbs");
        }, new HandlebarsTemplateEngine());

        get("/remove-hero/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/remove-squad/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/modify-squad/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            model.put("editHero", true);
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/modify-hero/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            model.put("modifyHero", true);
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/modify-hero/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            String name = req.queryParams("name");
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");
            int age = Integer.parseInt(req.queryParams("age"));
            int squadId = Integer.parseInt(req.queryParams("squadId"));
            return new ModelAndView(model, "hero-details.hbs");
        }, new HandlebarsTemplateEngine());

        post("/modify-squad/:id", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            String name = req.queryParams("name");
            String mission = req.queryParams("power");
            int size = Integer.parseInt(req.queryParams("volume"));
            return new ModelAndView(model, "hero-details.hbs");
        }, new HandlebarsTemplateEngine());
    }
}