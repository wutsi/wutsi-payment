package com.wutsi.payment

data class Error (
        val code: ErrorCode,
        val transactionId: String? = null,
        val supplierErrorCode: String? = null
)
