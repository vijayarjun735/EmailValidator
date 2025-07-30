package project.group6.emailvalidator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkTextViewInMainActivity() {
        onView(withId(R.id.textView)).check(matches(withText("Expected Text")))
    }

    @Test
    fun enter123AndChangeText() {
        onView(withId(R.id.editTextUserInput)).perform(typeText("123"), closeSoftKeyboard())
        onView(withId(R.id.buttonChangeText)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("123")))
    }

    @Test
    fun enter123AndChangeTextInShowTextActivity() {
        onView(withId(R.id.editTextUserInput)).perform(typeText("123"), closeSoftKeyboard())
        onView(withId(R.id.buttonOpenActivityAndChangeText)).perform(click())
        Thread.sleep(1000)
        onView(withId(R.id.textViewShow)).check(matches(withText("123")))
    }


    @Test
    fun emptyInputAndChangeText() {
        onView(withId(R.id.editTextUserInput)).perform(replaceText(""), closeSoftKeyboard())
        onView(withId(R.id.buttonChangeText)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("")))
    }

    @Test
    fun emptyInputAndChangeTextInShowTextActivity() {
        onView(withId(R.id.editTextUserInput)).perform(replaceText(""), closeSoftKeyboard())
        onView(withId(R.id.buttonOpenActivityAndChangeText)).perform(click())
        onView(withId(R.id.textViewShow)).check(matches(withText("")))
    }

    @Test
    fun enterAbcdefAndChangeText() {
        onView(withId(R.id.editTextUserInput)).perform(typeText("abcdef"), closeSoftKeyboard())
        onView(withId(R.id.buttonChangeText)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("abcdef")))
    }

    @Test
    fun enterAbcdefAndChangeTextInShowTextActivity() {
        onView(withId(R.id.editTextUserInput)).perform(typeText("abcdef"), closeSoftKeyboard())
        onView(withId(R.id.buttonOpenActivityAndChangeText)).perform(click())
        onView(withId(R.id.textViewShow)).check(matches(withText("abcdef")))
    }
}
