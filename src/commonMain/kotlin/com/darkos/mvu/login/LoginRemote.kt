package com.darkos.mvu.login

import com.darkos.mvu.login.model.LoginResult

interface LoginRemote<T : Any, R : Any> {
    suspend fun login(data: T): LoginResult<R>
}