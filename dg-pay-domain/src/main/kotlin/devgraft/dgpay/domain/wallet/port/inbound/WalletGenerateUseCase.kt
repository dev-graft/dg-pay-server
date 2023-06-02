package devgraft.dgpay.domain.wallet.port.inbound

import devgraft.dgpay.domain.wallet.model.Wallet

interface WalletGenerateUseCase {
    fun generateWallet(): Wallet
}
