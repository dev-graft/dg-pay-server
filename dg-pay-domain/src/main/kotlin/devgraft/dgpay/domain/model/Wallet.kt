package devgraft.dgpay.domain.model

/**
 * @property id: 아아디
 * @property identityToken: 외부에 노출될 식별토큰
 * @property authorizationToken: 특정 사용자를 식별하기 위한 인증토큰
 */
data class Wallet(
    val id: Long,
    val identityToken: IdentityToken,
    val authorizationToken: String
)
