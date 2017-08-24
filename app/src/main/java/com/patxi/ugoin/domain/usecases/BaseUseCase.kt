package com.patxi.ugoin.domain.usecases

import com.patxi.ugoin.Either

abstract class BaseUseCase<R> {

    abstract fun execute(): Either<String, R>

}