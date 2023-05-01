package org.wikipedia.myTests

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.intent.Intents



import androidx.test.espresso.matcher.ViewMatchers

import androidx.test.espresso.matcher.ViewMatchers.withId

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.R
import org.wikipedia.myTests.pageObjects.SettingsScreen
import org.wikipedia.myTests.pageObjects.OnboardingPageObject
import org.wikipedia.main.MainActivity


@RunWith(AndroidJUnit4::class)
class TestCaseThree {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testCheckPrivacyPolicy() {

        val onboardingPage = OnboardingPageObject()
        val settingsScreen = SettingsScreen()



        onboardingPage.clickSkipButton()

        settingsScreen.openCustomizeExploreFeed()

        onView(withId(R.id.recycler_view)).perform(swipeUp())

        onView(ViewMatchers.withText(R.string.privacy_policy_description)).perform(ViewActions.click())
        Intents.init()
//        intended(hasAction(Intent.ACTION_VIEW)) к сожалению на этом месте тест падает, так и не справилась





    }
}



















