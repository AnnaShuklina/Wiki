package org.wikipedia.myTests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.R
import org.wikipedia.myTests.pageObjects.SettingsScreen
import org.wikipedia.myTests.pageObjects.OnboardingPageObject
import org.wikipedia.main.MainActivity


@RunWith(AndroidJUnit4::class)
class TestCaseTwo {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testCheckAbout() {
        val onboardingPage = OnboardingPageObject()
        val settingsScreen = SettingsScreen()

        onboardingPage.clickSkipButton()

        settingsScreen.openCustomizeExploreFeed()

        onView(withId(R.id.fragment_container)).perform(swipeUp())

        onView(ViewMatchers.withText(R.string.about_description)).perform(ViewActions.click())


        onView(
            Matchers.allOf(
                withId(R.id.about_container),
                ViewMatchers.hasDescendant(
                    Matchers.allOf(
                        ViewMatchers.withText(R.string.about_contributors_heading),
                        ViewMatchers.isDisplayed()
                    )
                )
            )
        )


        onView(
            Matchers.allOf(
                withId(R.id.about_container),
                ViewMatchers.hasDescendant(
                    Matchers.allOf(
                        ViewMatchers.withText(R.string.about_translators_heading),
                        ViewMatchers.isDisplayed()
                    )
                )
            )
        )

        onView(
            Matchers.allOf(
                withId(R.id.about_container),
                ViewMatchers.hasDescendant(
                    Matchers.allOf(
                        ViewMatchers.withText(R.string.about_app_license_heading),
                        ViewMatchers.isDisplayed()
                    )
                )
            )
        )


    }
}



















