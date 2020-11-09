package com.wutsi.payment

data class TransferRequest (
        val referenceGuid: String,
        val amount: Double,
        val currency: String,
        val description: String? = null,
        val customer: Customer = Customer(),
        val wallet: Wallet
)