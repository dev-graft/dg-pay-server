package devgraft.dgpay.infra.wallet.outbound

import devgraft.dgpay.domain.wallet.model.Wallet
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "wallet")
@Entity
internal class WalletEntity(
    @Column(name = "publicToken", nullable = false, unique = true)
    val publicToken: String,
    @Column(name = "privateToken", nullable = false, unique = true)
    val privateToken: String,
    @Id @GeneratedValue(strategy = IDENTITY)
    val id: Long?=null
)

internal fun Wallet.toEntity() : WalletEntity {
    return WalletEntity(
        publicToken = this.publicToken.value,
        privateToken = this.privateToken.value
    )
}
