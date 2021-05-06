import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        simpleTest();
        numberTest();
        spaceTest();
        emptyTest();
        nullTest();
        abbreviate10();
        abbreviate20();
        abbreviateTest();
    }

    public static void simpleTest(){
        System.out.println(
                "Sergey".equals(StringUtils.capitalize("sergey")));

        System.out.println(
                "Sergey".equals(StringUtils.capitalize("sergey")));
    }

    public static void numberTest() {
        System.out.println(
                "1234".equals(StringUtils.capitalize("1234")));
    }

    public static void spaceTest(){
        System.out.println(
                " Sergey".equals(StringUtils.capitalize(" Sergey")));
    }

    public static void emptyTest() {
        System.out.println(
                "".equals(StringUtils.capitalize("")));
    }

    public static void nullTest() {
        System.out.println(
                null == StringUtils.capitalize(null));
    }

    //HW 13

    public static void abbreviate10() {
        System.out.println("Привет ...".equals(StringUtils.abbreviate("Привет всем кто живет на луне!",10)));
    }

    public static void abbreviate20() {
        System.out.println("Привет всем кто ж...".equals(StringUtils.abbreviate("Привет всем кто живет на луне!", 20)));
    }

    public static void abbreviateTest() {
        System.out.println(StringUtils.abbreviate("Привет всем кто живет на луне!",4));
    }
}
