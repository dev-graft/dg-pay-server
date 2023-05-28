package devgraft.dgpay.infra.wallet.outbound

import org.springframework.data.jpa.repository.JpaRepository

internal interface WalletRepository : JpaRepository<WalletEntity, Long>