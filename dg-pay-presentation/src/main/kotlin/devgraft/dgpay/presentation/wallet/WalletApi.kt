package devgraft.dgpay.presentation.wallet

import devgraft.dgpay.domain.wallet.model.Wallet
import devgraft.dgpay.domain.wallet.port.inbound.WalletGenerateUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WalletApi(private val walletGenerateUseCase: WalletGenerateUseCase) {

    @PostMapping("wallets")
    private fun generate() : WalletGeneratedResponse {
        val wallet = walletGenerateUseCase.generate()
        return toResponse(wallet)
    }
}

private fun toResponse(wallet: Wallet): WalletGeneratedResponse {
    return WalletGeneratedResponse(
        publicKey = wallet.publicToken.value,
        privateKey = wallet.privateToken.value
    )
}
private data class WalletGeneratedResponse(
    val publicKey: String,
    val privateKey: String
)