package com.darkos.mvu.login.model

sealed class LoginResult<T : Any> {
    class Success<T : Any>(
        val data: T
    ) : LoginResult<T>()

    class Error<T : Any>(
        val error: Exception
    ) : LoginResult<T>()
}