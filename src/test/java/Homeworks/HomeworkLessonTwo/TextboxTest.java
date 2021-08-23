package Homeworks.HomeworkLessonTwo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextboxTest {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void happyPath() {

        File file = new File("src/test/resources/logo.png");

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Bulat");
        $("#lastName").setValue("Shaydullin");
        $("#userEmail").setValue("bshaydullin@gaguru.ru");
        $x("//label[contains(text(),'Male')]").click();
        $("#userNumber").setValue("1212121212");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("11");
        $(".react-datepicker__year-select").selectOptionByValue("1991");
        $(".react-datepicker__month-container").$(byText("12")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $x("//label[contains(text(),'Music')]").click();
        $("#uploadPicture").uploadFile(file);
        $("#currentAddress").setValue("Kazan");
        $("#stateCity-wrapper").$(byText("Select State")).scrollIntoView(true).click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();


        $(".table-responsive").shouldHave(text("Bulat Shaydullin"));
        $(".table-responsive").shouldHave(text("bshaydullin@gaguru.ru"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("1212121212"));
        $(".table-responsive").shouldHave(text("12 December,1991"));
        $(".table-responsive").shouldHave(text("English"));
        $(".table-responsive").shouldHave(text("Music"));
        $(".table-responsive").shouldHave(text("logo.png"));
        $(".table-responsive").shouldHave(text("Kazan"));
        $(".table-responsive").shouldHave(text("NCR Delhi"));
    }
}