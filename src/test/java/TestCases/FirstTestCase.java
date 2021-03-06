package TestCases;

/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/8/2018
 */

import com.instacarrogenderize.io.RestAPIConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase
{
    @Test
    public void validateGender() //Just execute and log the response
    {
        RestAPIConfig u_URL = new RestAPIConfig();
        Assert.assertEquals(u_URL.ExecuteAPIForSingle("https://api.genderize.io", "/?name=peter").contains("peter"), true);
        System.out.println("API IS WORKING GOOD, please find the expected response here: " + u_URL.ExecuteAPIForSingle("https://api.genderize.io", "/?name=peter"));
    }
}
