package devgraft.dgpay.infra.wallet.handler

import devgraft.dgpay.domain.wallet.event.GeneratedWalletEvent
import devgraft.dgpay.domain.wallet.port.outbound.WalletPort
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
internal class WalletEventHandler(
    private val walletPort: WalletPort
) {

    @EventListener
    fun handle(event: GeneratedWalletEvent) {
        walletPort.storeWallet(event.wallet)
    }
}
