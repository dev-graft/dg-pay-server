package devgraft.dgpay.infra.wallet.outbound

import devgraft.dgpay.domain.wallet.model.Wallet
import devgraft.dgpay.domain.wallet.port.outbound.WalletPort
import org.springframework.stereotype.Component

@Component
internal class WalletAdapter(
    private val walletRepository: WalletRepository
) : WalletPort {
    override fun addWallet(wallet: Wallet) {
        val walletEntity = wallet.toEntity()
        walletRepository.save(walletEntity)
    }
}
