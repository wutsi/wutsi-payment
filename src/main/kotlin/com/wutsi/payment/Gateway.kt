package com.wutsi.payment

interface Gateway {
    @Throws(PaymentException::class)
    fun transfer(request: TransferRequest): TransferResponse
}
