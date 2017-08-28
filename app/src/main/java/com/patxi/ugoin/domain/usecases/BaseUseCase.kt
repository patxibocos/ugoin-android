package com.patxi.ugoin.domain.usecases

abstract class BaseUseCase<out T> {

    abstract fun execute(): T

}