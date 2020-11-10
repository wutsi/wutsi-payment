package com.wutsi.payment

data class TransferStatusResponse (
        val transactionId: String,
        val financialTransactionId: String? = null,
        val status: PaymentStatus,
        val error: Error? = null
)
