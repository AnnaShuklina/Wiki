package org.wikipedia.myTests.pageObjects

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class OnboardingPageObject {

    private val skipButton = onView(withId(R.id.fragment_onboarding_skip_button))

    fun clickSkipButton() {
        skipButton.perform(click())
    }
}