package devgraft.dgpay.infra.wallet.inbound

import devgraft.dgpay.domain.wallet.model.PublicToken
import devgraft.dgpay.domain.wallet.model.PrivateToken
import devgraft.dgpay.domain.wallet.model.Wallet
import devgraft.dgpay.domain.wallet.port.inbound.WalletGenerateUseCase
import devgraft.dgpay.domain.wallet.port.outbound.WalletPort
import org.springframework.stereotype.Service
import java.security.KeyPairGenerator
import java.security.spec.ECGenParameterSpec
import java.util.Base64


@Service
internal class GenerateWalletService(private val walletPort: WalletPort) : WalletGenerateUseCase {
    override fun generate(): Wallet {
        val generateKey = generateKey()
        val wallet = Wallet(generateKey.first, generateKey.second)
        walletPort.addWallet(wallet)
        return wallet
    }
}

/**
 * 어디 패키지에 두어야할까~
 * 어떤 암호화를 쓸지 딱히 정하지 않았고, 목표는 오직 유일키로 식별.
 * 이렇다보니 도메인로직으로 두는건 패스.
 * 인프라스트럭처에 두는게 이해라도 쉬울 것 같긴한데...
 */
private fun generateKey() : Pair<PublicToken, PrivateToken> {
    val kpg: KeyPairGenerator = KeyPairGenerator.getInstance("EC", "SunEC")
    kpg.initialize(ECGenParameterSpec("secp256r1"))

    val keyPair = kpg.generateKeyPair()

    return Pair(
        first = PublicToken(Base64.getEncoder().encodeToString(keyPair.public.encoded)),
        second = PrivateToken(Base64.getEncoder().encodeToString(keyPair.private.encoded))
    )
}