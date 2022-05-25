package Test;

import Base.Base;
import Component.BRALines;
import Component.LeftMenu;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Brasil501_Test extends Base {
    @BeforeSuite
    public void beforemethod(){
        super.beforemethod();
        super.loginmethod();
    }
    @Test(priority = 1)
    public void MOD1_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {
            leftmenu.ComboboxBrasil().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.BRA501()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(bralines.title().getText() + " Daily");
            Thread.sleep(2000);
            actions.moveToElement(bralines.TabMod1()).click().build().perform();

            System.out.println(bralines.TabMod1().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 2)
    public void MOD2_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {

            System.out.println(bralines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod2()).click().build().perform();

            System.out.println(bralines.TabMod2().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 3)
    public void MOD3_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {

            System.out.println(bralines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod3()).click().build().perform();

            System.out.println(bralines.TabMod3().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 4)
    public void MOD4_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {

            System.out.println(bralines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod4()).click().build().perform();

            System.out.println(bralines.TabMod4().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 5)
    public void MOD1_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(bralines.title().getText() + " Weekly");
            Thread.sleep(2000);
            bralines.PeriodFilter().click();
            Thread.sleep(2000);
            bralines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod1()).click().build().perform();

            System.out.println(bralines.TabMod1().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 6)
    public void MOD2_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(bralines.title().getText() + " Weekly");
            Thread.sleep(2000);
            bralines.PeriodFilter().click();
            Thread.sleep(2000);
            bralines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod2()).click().build().perform();

            System.out.println(bralines.TabMod2().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 7)
    public void MOD3_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(bralines.title().getText() + " Weekly");
            Thread.sleep(2000);
            bralines.PeriodFilter().click();
            Thread.sleep(2000);
            bralines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod3()).click().build().perform();

            System.out.println(bralines.TabMod3().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 8)
    public void MOD4_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        BRALines bralines = new BRALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(bralines.title().getText() + " Weekly");
            Thread.sleep(2000);
            bralines.PeriodFilter().click();
            Thread.sleep(2000);
            bralines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(bralines.TabMod4()).click().build().perform();

            System.out.println(bralines.TabMod4().getText());
            System.out.println("OEE " + bralines.ValueOEE().getText());
            System.out.println("Availability " + bralines.ValueAvailability().getText());
            System.out.println("Performance " + bralines.ValuePerformance().getText());
            System.out.println("Quality " + bralines.ValueQuality().getText());

            System.out.println("Total Production " + bralines.TotalProduction().getText());
            System.out.println("Defect " + bralines.Defect().getText());
            System.out.println("PPM " + bralines.PPM().getText());
            System.out.println("Breakdowns " + bralines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(bralines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @AfterTest
    public void aftertest(){
        super.aftermethod();
    }
}
