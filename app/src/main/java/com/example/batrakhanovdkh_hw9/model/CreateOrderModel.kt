package com.example.batrakhanovdkh_hw9.model

/**
 * Модель для создания заказа
 */
data class CreateOrderModel(
    var firstName: String = "",
    var lastName: String = "",
    var middleName: String = "",
    var phoneNumber: String = ""
)