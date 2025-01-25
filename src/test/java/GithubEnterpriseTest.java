import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubEnterpriseTest {
    @BeforeAll
    static void setupTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void GithubEnterprisePageTest() {
        open("https://github.com/");
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        $("title").shouldHave(attribute("text", "The AI Powered Developer Platform. · GitHub"));
    }
}
