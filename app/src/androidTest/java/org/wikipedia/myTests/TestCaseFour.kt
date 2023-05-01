package org.wikipedia.myTests


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText

import androidx.test.espresso.matcher.ViewMatchers.withId

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.CoreMatchers.allOf

import org.junit.Rule
import org.junit.Test
import org.wikipedia.myTests.pageObjects.OnboardingPageObject
import org.wikipedia.main.MainActivity
import org.wikipedia.R
import org.wikipedia.myTests.pageObjects.EnterWiki


class TestCaseFour {
    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun checkPassHidden() {
        val onboardingPage = OnboardingPageObject()
        val enteringWiki = EnterWiki()
        val password = "qwerty2023"


        onboardingPage.clickSkipButton()

        enteringWiki.buttonEnter()

        onView(allOf(withId(R.id.create_account_password_input)))
            .perform(click())
        Thread.sleep(500)
//        closeSoftKeyboard()
//        onView(allOf(withId(R.id.create_account_password_input)))
//            .perform(typeText("password")) //
//        Вот тут ничего не вышло, не удалось настроить вставку текста, а уж тем более проверку с "глазиком"


    }

}