package com.example.stqajunittestcasesapp

object LoginUtils {

    fun validate(username: String, email: String, password: String, age: Int): String? {
        if (username.isEmpty()) return "please enter username"
        if (username.length < 6) return "very short username"
        if (username.length > 20) return "long username"

        if (email.isEmpty()) return "please enter email"
        if (!email.contains("@")) return "please enter valid email"
        if (email.filter { it.isDigit() }.isEmpty()) return "email must contain at least one digit"

        if(password.isEmpty()) return "please enter password"
        if(password.length<6)return "please enter valid password"

        if(age==0) return "please enter valid age"
        if(age<18) return "not eligible"

        return null

    }
}