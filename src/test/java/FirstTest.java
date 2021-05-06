import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void simpleTest(){
        System.out.println(
                "Sergey".equals(StringUtils.capitalize("sergey")));

        System.out.println(
                "Sergey".equals(StringUtils.capitalize("sergey")));
    }

    @Test
    public void numberTest() {
        System.out.println(
                "1234".equals(StringUtils.capitalize("1234")));
    }

    @Test
    public void spaceTest(){
        System.out.println(
                " Sergey".equals(StringUtils.capitalize(" Sergey")));
    }

    @Test
    public void emptyTest() {
        System.out.println(
                "".equals(StringUtils.capitalize("")));
    }

    @Test
    public void nullTest() {
        System.out.println(
                null == StringUtils.capitalize(null));
    }

    @Test
    public void repeatTest(){
        String str = StringUtils.repeat("Yes", 3);
        Assert.assertEquals(str, "YesYesYes");
    }

    @Test
    public static void abbreviate10() {
        System.out.println("Привет ...".equals(StringUtils.abbreviate("Привет всем кто живет на луне!",10)));
    }

    @Test
    public static void abbreviate20() {
        System.out.println("Привет всем кто ж...".equals(StringUtils.abbreviate("Привет всем кто живет на луне!", 20)));
    }

    @Test
    public void abbreviateTest(){
        String str = StringUtils.abbreviate("Привет всем кто живет на луне!", 4);
        Assert.assertEquals(str, "П...");
    }

}
