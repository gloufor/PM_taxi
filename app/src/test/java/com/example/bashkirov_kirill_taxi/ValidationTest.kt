package com.example.bashkirov_kirill_taxi

import com.google.android.material.textfield.TextInputEditText
import junit.framework.Assert.assertEquals
import org.junit.Test

class ValidationTest {
    //тест на правильность валидации почты
    @Test
    fun email_is_valid() {
        val email = "....@mail.ru"
        assertEquals(email.validateEmail(), true)
    }

    //тест на правильность работы функции сравнения паролей
    @Test
    fun password_is_match(){
        val pass1 = "password"
        val pass2 = "password"
        assertEquals(pass1.passEqual(pass2), true)
    }
}