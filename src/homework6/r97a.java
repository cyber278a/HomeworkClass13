package homework6;

import java.util.Scanner;
//If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
//
//"Proceed with Chrome browser"
//
//If browser is firefox, FIREFOX or FireFOX it should print the:
//
//"Proceed with Firefox browser"
//
//If browser is IE, ie or iE it should print the:
//
//"Proceed with IE browser"
//
//If any other browser it should print the:
//
//"Invalid browser"
public class r97a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();

if(browser.equalsIgnoreCase("Chrome")){
    System.out.println("Proceed with Chrome browser");} else
        if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Proceed with Firefox browser");}
        else if (browser.equalsIgnoreCase("ie")) {
            System.out.println("Proceed with IE browser");}
        else {
            System.out.println("Invalid browser");}

        }

    }



