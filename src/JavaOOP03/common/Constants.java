package JavaOOP03.common;

public class Constants {

   private static String browser = "chrome";
   private static boolean report = true;
   private static boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }


    public static boolean isReport() {
        return report;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
