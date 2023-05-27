package devgraft.dgpay.domain.wallet.model

/**
 * 공개키: 입금을 받기 위해 사용되는 정보.
 * 비밀키: 송금하기 위해 필요한 정보. 누군가에게 공유되어서는 안되고, 거래 서명에 사용되는 중요한 값.
 */
class Wallet(
    val publicToken: PublicToken,
    val secretToken: SecretToken
)