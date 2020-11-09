package com.wutsi.payment

import java.lang.RuntimeException

class PaymentException(
        val error: Error,
        message: String? = null,
        cause: Throwable? = null
): RuntimeException(message, cause)
