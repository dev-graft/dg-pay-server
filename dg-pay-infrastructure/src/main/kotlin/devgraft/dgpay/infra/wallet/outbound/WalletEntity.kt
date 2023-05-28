package devgraft.dgpay.infra.wallet.outbound

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
    @Column(name = "secretToken", nullable = false, unique = true)
    val secretToken: String,
    @Id @GeneratedValue(strategy = IDENTITY)
    val id: Long?=null
)