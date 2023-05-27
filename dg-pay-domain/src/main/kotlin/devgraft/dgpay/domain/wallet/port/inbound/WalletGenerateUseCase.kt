package devgraft.dgpay.domain.wallet.port.inbound

import devgraft.dgpay.domain.wallet.model.WalletId

interface WalletGenerateUseCase {
    fun generate(): WalletId
}