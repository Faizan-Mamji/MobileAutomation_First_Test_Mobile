package org.Soum.PageObjects.Mobile.Android;

public enum Vehicles_Series {

    series_Option("(//android.widget.TextView[@resource-id='com.octagen.freetestcode:id/serieLabel'])[2]"),
    series_NumericOne("com.octagen.freetestcode:id/answerThree"),
    series_NumericTwo("com.octagen.freetestcode:id/answerFour"),
    series_NumericThree("com.octagen.freetestcode:id/correctionBtn"),
    series_NumericFour("com.octagen.freetestcode:id/validationBtn");

    public String description;

    Vehicles_Series(String desc) {
        this.description = desc;
    }


    public String getSeries() {
        return description;
    }

}
