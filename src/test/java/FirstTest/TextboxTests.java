package FirstTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextboxTests {

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
        $("#submit").scrollIntoView(true);
        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();


        $x("//tbody/tr[1]/td[2]").shouldHave(text("Bulat Shaydullin"));
        $x("//tbody/tr[2]/td[2]").shouldHave(text("bshaydullin@gaguru.ru"));
        $x("//tbody/tr[3]/td[2]").shouldHave(text("Male"));
        $x("//tbody/tr[4]/td[2]").shouldHave(text("1212121212"));
        $x("//tbody/tr[5]/td[2]").shouldHave(text("12 December,1991"));
        $x("//tbody/tr[6]/td[2]").shouldHave(text("English"));
        $x("//tbody/tr[7]/td[2]").shouldHave(text("Music"));
        $x("//tbody/tr[8]/td[2]").shouldHave(text("logo.png"));
        $x("//tbody/tr[9]/td[2]").shouldHave(text("Kazan"));
        $x("//tbody/tr[10]/td[2]").shouldHave(text("NCR Delhi"));


    }


}