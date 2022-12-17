package org.Soum.PageObjects.Mobile.Android;

public enum SplashScreen {

//    btnLocator("(//android.widget.TextView[@resource-id='android:id/text1'])[3]");

    btnLocator("//android.widget.TextView[@resource-id='com.octagen.freetestcode:id/frenchLeft']");

    public String description;
    SplashScreen(String desc){
        this.description=desc;
    }

    public String getLocator(){
        return description;
    }

}
