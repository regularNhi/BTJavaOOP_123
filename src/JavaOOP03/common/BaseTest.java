package JavaOOP03.common;

public class BaseTest {


    public void createDriver(){

        System.out.println("Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());

    }

    public void createDriver(String browser){

        System.out.println("Browser: " + browser);
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless() );

    }

    //truyền giá trị
    public void closeDriver(String browser){
        System.out.println("Closed: " + browser);

    }

    //đa hình - giá trị cứng
    public void closeDriver(){
        System.out.println("Closed: " + Constants.getBrowser());

    }
}
