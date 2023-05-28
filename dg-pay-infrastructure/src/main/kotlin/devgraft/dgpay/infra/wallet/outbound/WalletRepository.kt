package devgraft.dgpay.infra.wallet.outbound

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
internal interface WalletRepository : JpaRepository<WalletEntity, Long>