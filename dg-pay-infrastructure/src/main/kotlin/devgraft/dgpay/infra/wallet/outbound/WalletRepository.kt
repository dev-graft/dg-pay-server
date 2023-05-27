package devgraft.dgpay.infra.wallet.outbound

import org.springframework.data.jpa.repository.JpaRepository

interface WalletRepository : JpaRepository<WalletEntity, Long>