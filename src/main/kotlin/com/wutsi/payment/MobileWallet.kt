package com.wutsi.payment

class MobileWallet (
    type: WalletType,
    val number: String
): Wallet(type)
