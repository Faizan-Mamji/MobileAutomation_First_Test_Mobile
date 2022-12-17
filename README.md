# Steps To Configure Automation Project
## Installation

Following are the software that needs to be installed.
-  Download JDK-11 <br/>
   https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html
-  Download Android studio. <br/>
   https://developer.android.com/studio?gclid=CjwKCAiAy_CcBhBeEiwAcoMRHFB_k6bG9mKROIrqSLvZoYPOLJ0an7SF1RxCVvuJ3KkbyWxY1MuGiBoC67IQAvD_BwE&gclsrc=aw.ds
-  Set Environment variables for Java & Android.<br/>
      1. **For windows:** <br/>
           Java    - https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html <br/>
           Android - https://www.360logica.com/blog/how-to-set-path-environmental-variable-for-sdk-in-windows/ <br/>
      2. **For Mac:** <br/>
           Java    - https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux <br/>
           Android - https://kashanhaider.com/set-up-android-environment-variables-on-macos/ <br/>
-  Download Appium desktop <br/>
   https://github.com/appium/appium-desktop/releases/tag/v1.22.0

---

## Clone The Project & Configure

```
> git clone https://github.com/Faizan-Mamji/MobileAutomation_First_Test_Mobile.git
```
- After project clone, open project in intellij idea.
- Once project loads, go to File > Project Structure
- On the left panel click on the project & select JDK 11 in SDK option.
- Then click on modules from the left panel & select 11 from Language Level dropdown.
- Click on SDKs under platform settings in left panel and select JDK 11 from JDK Home Path field.
- Click on Apply button. This will update the project according to specific JDK.
 
## Steps To Run The Project
- Open the Appium desktop & click on start server button.
- Connect the android device from the laptop/mac
- Go to project & right click on the Executor.xml file & run.
- It will install the Application from the code & cases will execute successfully.
- After the execution, report will generate under Soum-Report folder.