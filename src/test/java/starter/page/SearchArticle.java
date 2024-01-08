package starter.page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchArticle extends PageObject {

    private By ClickQuestionBox() {return By.xpath("//*[@id=\"root\"]/div/div[1]/main/div[1]/div/div[2]/form/div/input");}
    private By ButtonTanya() {return  By.xpath("//*[@id=\"root\"]/div/div[1]/main/div[1]/div/div[2]/form/div/button");}
    private By ClickSelengkapnya() {return By.xpath("//*[@id=\"root\"]/div/div[1]/main/div[2]/div[3]/div[1]");}
    private By ClickArticle() {return  By.xpath("//*[@id=\"root\"]/div/div[1]/main/div/div[1]/div[3]/div[1]/div[1]/p[1]");}


    //=============Functional==============
    @Step
    public void onLoginPage() {
        open();
        $(ButtonTanya()).shouldBeVisible();
    }

    @Step
    public void UserClickQuestionBox(){
        $(ClickQuestionBox()).click();
    }
    @Step
    public void UserInputKeyword(String inputname){
        $(ClickQuestionBox()).type(inputname);
    }
    @Step
    public void UserClickButtonTanya(){
        $(ButtonTanya()).click();
    }
    @Step
    public void UserClickMore(){
        $(ClickSelengkapnya()).click();
    }
    @Step
    public void UserClickArticle(){
        $(ClickArticle()).click();
    }
}
