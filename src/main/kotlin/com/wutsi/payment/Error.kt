package com.wutsi.payment

data class Error (
        val code: ErrorCode,
        val referenceGuid: String? = null,
        val supplierCode: String? = null
)
