package com.patxi.ugoin

interface BaseView<T : BasePresenter> {

    var presenter: T?

}