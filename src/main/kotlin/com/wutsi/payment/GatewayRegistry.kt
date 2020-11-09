package com.wutsi.payment

class GatewayRegistry {
    private val gateways: MutableMap<WalletType, Gateway> = mutableMapOf()

    fun register(type: WalletType, gateway: Gateway) {
        gateways[type] = gateway
    }

    fun get(type: WalletType): Gateway =
            gateways[type]
                    ?: throw PaymentException(
                            error = Error(code = ErrorCode.UNSUPPORTED_GATEWAY)
                    )
}
