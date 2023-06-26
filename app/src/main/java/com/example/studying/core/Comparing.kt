package com.example.studying.core

interface Comparing<T> {
    fun same(item: T): Boolean
    fun sameContent(item: T): Boolean
    fun changePayload(item: T): Any = Any()
}