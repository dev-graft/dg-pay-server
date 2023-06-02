package devgraft.dgpay.domain.wallet.port.outbound

import devgraft.dgpay.domain.wallet.model.Wallet

interface WalletPort {
    fun storeWallet(wallet: Wallet)
}
