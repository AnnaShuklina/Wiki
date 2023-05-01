package org.wikipedia.myTests.pageObjects

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId

import org.wikipedia.R

class SettingsScreen {


    fun openCustomizeExploreFeed() {
        onView(withId(R.id.menu_icon)).perform(click())
        onView(withId(R.id.main_drawer_settings_container)).perform(click())
    }
}