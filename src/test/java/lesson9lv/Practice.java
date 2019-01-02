package lesson9lv;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lesson9lv.model.Student;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Practice {
    private Student student = new Student();
    private String nameAge;

    @Given("student:")
    public void set_student(Map<String, String> params) {
        student.setName(params.get("name"));
        student.setAge(Integer.valueOf(params.get("age")));
        student.setWeight(Integer.valueOf(params.get("weight")));
        student.setHeight(Integer.valueOf(params.get("height")));
    }

//    @Given("student with name (.*)")
//    public void set_student(String name) {
//        student.setName(name);
//    }
//
//    @Given("age ([0-9]*)")
//    public void set_age(Integer age) {
//        student.setAge(age);
//    }
//
//    @Given("height ([0-9]*)")
//    public void set_height(Integer height) {
//        student.setHeight(height);
//    }
//
//    @Given("weight ([0-9]*)")
//    public void set_weight(Integer weight) {
//        student.setWeight(weight);
//    }

    @When("we requesting name and age together")
    public void get_nameAge() {
        nameAge = student.getNameAge();
    }

    @Then("response must be (.*)")
    public void check_result(String toCheck) {
        Assertions.assertEquals(toCheck, nameAge, "NOooooo!");
    }
}
