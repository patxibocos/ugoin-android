package com.patxi.ugoin.domain.usecases

interface BaseUseCase<out T> {

    fun execute(): T

}