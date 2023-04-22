package com.neroz1x.testApplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy
import tools.fastlane.screengrab.locale.LocaleTestRule


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Rule @JvmField
    val localeTestRule: LocaleTestRule? = LocaleTestRule()

    @Rule @JvmField
    var activityRule: ActivityTestRule<MainActivity?>? = ActivityTestRule(
        MainActivity::class.java
    )

    @Test
    fun testTakeScreenshot() {
        //ScreenUtil.activateScreenForTesting(activity);
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())
        /*var device = UiDevice.getInstance(getInstrumentation())
        device.pressHome()

        // Bring up the default launcher by searching for a UI component
        // that matches the content description for the launcher button.
        val allAppsButton = device.findObject(
            UiSelector().description("Neroz1xTestApp"))

        // Perform a click on the button to load the launcher.
        allAppsButton.clickAndWaitForNewWindow()
        // Wait for the app to appear
        device.wait(
            Until.hasObject(By.pkg("com.neroz1x.testApplication").depth(0)),
            5000L
        )*/

        Screengrab.screenshot("main_page")
    }
}