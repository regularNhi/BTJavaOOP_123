package JavaOOP03.Testcases;

import JavaOOP03.common.BaseTest;

public class TestCases extends BaseTest {

    public void testLogin(){
        createDriver("Edge");
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456 ");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashboard is display");
        closeDriver("Edge");
    }

    public void testAddCategory(){
        createDriver();
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456 ");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashboard is display");
        System.out.println("Click menu Product");
        System.out.println("Click menu Category");
        System.out.println("Verify redirect to the Category page");
        System.out.println("Enter form data to add new category");
        System.out.println("Click Save button");
        System.out.println("Verify new category added successfully");
        System.out.println("Verify the new category information is correct");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("=========================");
        testCases.testAddCategory();
    }
}
