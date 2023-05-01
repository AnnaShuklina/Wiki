package org.wikipedia.myTests.pageObjects

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Matchers.allOf
import org.wikipedia.R

class CustomizeExploreFeedScreen {
    private val contentTypeCheckbox = onView(allOf(
            withId(R.id.fragment_container),
            hasDescendant(allOf(
                withId(R.id.feed_content_type_checkbox),
                isChecked()
            ))))

    fun isContentTypeCheckboxDisplayed(): Boolean {
        contentTypeCheckbox.check(matches(isDisplayed()))
        return true
    }
}