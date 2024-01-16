package com.example.stqajunittestcasesapp

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun username_is_empty() {
        val username = ""
        val assert = LoginUtils.validate(username, "dflja@3", "dkjafjla", 20)
        assert(assert == "please enter username")
    }


    @Test
    fun username_length_less_than_6() {
        val username = "djlfa"
        assert(
            LoginUtils.validate(username, "dflja@3", "dkjafjla", 20)
                    == "very short username"
        )
    }

    @Test
    fun username_length_very_long(){
        val username="fdlksakjfklafjkjfklkaljfklajfkajfkjasldkjfajlksfjlakjfakl"
        assert(
            LoginUtils.validate(username, "dflja@3", "dkjafjla", 20)
                    == "long username"
        )
    }

    @Test
    fun email_is_empty() {
        val email = ""
        val assert = LoginUtils.validate("Mayank", email, "dkjafjla", 20)
        assert(assert == "please enter email")
    }

    @Test
    fun username_contains_symbol() {
        val email = "djlfa"
        assert(
            LoginUtils.validate("username", email, "dkjafjla", 20)
                    == "please enter valid email"
        )
    }

    @Test
    fun username_contains_digit() {
        val email = "abcd@"
        assert(
            LoginUtils.validate("username", email, "dkjafjla", 20)
                    == "email must contain at least one digit"
        )
    }

    @Test
    fun password_isEmpty() {
        val password = ""
        assert(
            LoginUtils.validate("username", "dflja@3", password, 20)
                    == "please enter password"
        )
    }

    @Test
    fun password_isShort() {
        val password = "2123"
        assert(
            LoginUtils.validate("username", "dflja@3", password, 20)
                    == "please enter valid password"
        )
    }

    @Test
    fun age_empty() {
        val age = 0
        assert(
            LoginUtils.validate("username", "dflja@3", "dkjafjla", age)
                    == "please enter valid age"
        )
    }

    @Test
    fun age_18more() {
        val age = 12
        assert(
            LoginUtils.validate("username", "dflja@3", "dkjafjla", age)
                    == "not eligible"
        )
    }
}