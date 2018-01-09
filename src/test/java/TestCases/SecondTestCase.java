package TestCases;

/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/8/2018
 */

import com.instacarrogenderize.io.RestAPIConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase
{
    @Test
    public void validateGender() //Just execute and log the response
    {
        RestAPIConfig u_URL = new RestAPIConfig();
        Assert.assertEquals(u_URL.ExecuteAPIForThree("https://api.genderize.io", "/?name[0]=peter&", "name[1]=rose&", "name[2]=max").contains("peter"), true);
        Assert.assertEquals(u_URL.ExecuteAPIForThree("https://api.genderize.io", "/?name[0]=peter&", "name[1]=rose&", "name[2]=max").contains("rose"), true);
        Assert.assertEquals(u_URL.ExecuteAPIForThree("https://api.genderize.io", "/?name[0]=peter&", "name[1]=rose&", "name[2]=max").contains("max"), true);
        System.out.println("API IS WORKING GOOD, please find the THREE expected here: " + u_URL.ExecuteAPIForThree("https://api.genderize.io", "/?name[0]=peter&", "name[1]=rose&", "name[2]=max"));
    }
}
