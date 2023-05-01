package org.wikipedia.myTests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.myTests.pageObjects.CustomizeExploreFeedScreen
import org.wikipedia.myTests.pageObjects.SettingsScreen
import org.wikipedia.myTests.pageObjects.OnboardingPageObject
import org.wikipedia.main.MainActivity
import org.wikipedia.R


@RunWith(AndroidJUnit4::class)
class TestCaseOne {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testCheckSettingsFeed() {
        val onboardingPage = OnboardingPageObject()
        val settingsScreen = SettingsScreen()
        val customizeExploreFeedScreen = CustomizeExploreFeedScreen()


        onboardingPage.clickSkipButton()

        settingsScreen.openCustomizeExploreFeed()

        onView(withText(R.string.preference_title_customize_explore_feed)).perform(click())

        assert(customizeExploreFeedScreen.isContentTypeCheckboxDisplayed())
    }
}



















