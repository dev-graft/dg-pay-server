package devgraft.dgpay.domain.wallet.port.inbound

import devgraft.dgpay.domain.wallet.model.SecretToken

interface WalletGenerateUseCase {
    fun generate(): SecretToken
}