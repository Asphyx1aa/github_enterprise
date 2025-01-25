import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GithubEnterpriseTest {
    @BeforeAll
    static void setupTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void GithubEnterprisePageTest() {
        
    }
}
