package github;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySoftAssertionsSearch {

    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void softAssertionsShouldHaveJUnit5ExamplesTest() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").$(byText("Soft assertions")).click();
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:")).sibling(0).shouldHave(text("@ExtendWith")).shouldHave(text("@Test"));
    }
}
