package neonatalDirection;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class MainBlock {
    private SelenideElement statusNns = $x("//div[@class='common-status']/span");
    private SelenideElement numberNns = $x("//input[@formcontrolname='number']");
    private SelenideElement dateNns =
            $x("//h1[contains(text(),'Направление ')]/../..//input[@placeholder='Дата']");
    private SelenideElement crossDateNns =
            $x("//date-time[@formcontrolname='directionDate']//button[@aria-label='Clear']");
    private SelenideElement calendarDateNns =
            $x("//date-time[@formcontrolname='directionDate']//button[@aria-label='Open calendar']");
    private SelenideElement typePaymentNns = $x("//input[@role='combobox'][@placeholder='Вид оплаты']");
    private SelenideElement crossTypePaymentNns = $x("//st-autocomplete[@placeholder='Вид оплаты']//button");
    private SelenideElement fieldTreatmentCase  =$x("//input[@placeholder='Случай лечения']");
    private SelenideElement fieldSentFromMedicalOrganization =
            $x("//input[@placeholder='Направлен из медицинской организации']");
    private SelenideElement fieldSentInMedicalOrganization =
            $x("//input[@placeholder='Направлен в медицинскую организацию']");
   private SelenideElement checkboxDirectionOutside =
           $x("//mat-checkbox[@formcontrolname='isDirectionOutside']//div[@class='mat-checkbox-inner-container']");
   private SelenideElement checkboxDirectionIsRepeat =
           $x("//mat-checkbox[@formcontrolname='isRepeat']//div[@class='mat-checkbox-inner-container']");
   private  SelenideElement fieldReasonRepeat = $x("//input[@formcontrolname='reasonRepeat']");
   private SelenideElement fieldDiagnosisMkb10 = $x("//input[@placeholder='МКБ-10']");
   private SelenideElement fieldMedicalDescriptionOfNosologicalUnit =
           $x("//input[@formcontrolname='additionalComment']");

   @Step
    public MainBlock CheckFieldNumber () {
       

       return this;
   }


}
