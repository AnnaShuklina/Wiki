package org.wikipedia.myTests.pageObjects

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class EnterWiki {


    fun buttonEnter() {
        onView(withId(R.id.menu_icon)).perform(click())
        onView(withId(R.id.main_drawer_login_button)).perform(click())
    }
}