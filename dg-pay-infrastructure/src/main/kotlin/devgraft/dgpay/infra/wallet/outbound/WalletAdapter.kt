package devgraft.dgpay.infra.wallet.outbound

import devgraft.dgpay.domain.wallet.model.Wallet
import devgraft.dgpay.domain.wallet.port.outbound.WalletPort
import org.springframework.stereotype.Component

@Component
internal class WalletAdapter(
    private val walletRepository: WalletRepository
) : WalletPort {
    override fun addWallet(wallet: Wallet) {
        val walletEntity = WalletEntity(
            publicToken = wallet.publicToken.value,
            secretToken = wallet.privateToken.value
        )
        walletRepository.save(walletEntity)
    }
}