package com.xworkz.inheritance;

public class EducationPlatform {
    public void start(Education education) {
        education.teach();
        education.assess();
        education.enroll();
        education.conductClass();
        education.evaluate();

        if (education instanceof OnlineEducation) {
            OnlineEducation online = (OnlineEducation) education;
            online.provideRecordedLectures();
        }
    }
}
