package com.wutsi.payment

data class TransferRequest (
        val externalId: String,
        val amount: Double,
        val currency: String,
        val description: String? = null,
        val party: Party = Party(),
        val wallet: Wallet
)
